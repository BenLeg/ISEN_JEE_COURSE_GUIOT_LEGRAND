package yncrea.lab01.controller;

import yncrea.lab01.model.Pharmacist;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    private List<Pharmacist> pharmacists;


    @Override
    public void init() throws ServletException {
        pharmacists = new ArrayList<>();
        pharmacists.add(new Pharmacist("pharm1", "password1"));
        pharmacists.add(new Pharmacist("pharm2", "password2"));
    }


    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        handleLogout(req, resp);

    }


    private void handleLogout(final HttpServletRequest req, final HttpServletResponse resp) throws IOException {
        if("logout".equals(req.getQueryString())){
            req.getSession().removeAttribute("loggedPharmacist");
            resp.sendRedirect(req.getServletContext().getContextPath()+"/");
        }
    }


    @Override
    protected void doPost(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        final String login = req.getParameter("login");
        final String password = req.getParameter("password");
        final Pharmacist pharmacistToAuthenticate = new Pharmacist(login, password);
        if(pharmacists.contains(pharmacistToAuthenticate)){
            req.removeAttribute("loginError");
            req.getSession().setAttribute("loggedPharmacist",pharmacistToAuthenticate);
            resp.sendRedirect(req.getServletContext().getContextPath()+"/drugs");
        }else{
            req.setAttribute("loginError","Invalid credentials!");
            req.getServletContext().getRequestDispatcher("/index.jsp").forward(req,resp);
        }
    }
}
