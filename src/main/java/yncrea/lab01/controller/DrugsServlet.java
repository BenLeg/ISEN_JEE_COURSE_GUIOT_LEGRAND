package yncrea.lab01.controller;

import yncrea.lab01.model.Drug;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = "/drugs")
public class DrugsServlet extends HttpServlet {

    private List<Drug> drugs;

    @Override
    public void init() throws ServletException {
        drugs = new ArrayList<>();
        drugs.add(new Drug("Drug1","Lab1"));
        drugs.add(new Drug("Drug2","Lab2"));

    }


    @Override
    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("drugs",drugs);
        req.getRequestDispatcher("DrugsList.jsp").forward(req,resp);
    }


    @Override
    protected void doPost(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
        final String name = req.getParameter("name");
        final String lab = req.getParameter("lab");
        drugs.add(new Drug(name, lab));
        resp.sendRedirect(req.getServletContext().getContextPath()+"/drugs");
    }
}
