package yncrea.lab01.filter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebFilter(urlPatterns = "/*")
public class SessionFilter implements Filter {

    @Override
    public void init(final FilterConfig filterConfig) throws ServletException {
    }


    @Override
    public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resp = (HttpServletResponse) response;
        List<String> urlToBypass = Arrays.asList("/login","/index.jsp");
        if(urlToBypass.contains(req.getServletPath())){
            chain.doFilter(req,resp);
        }else{
            if(req.getSession().getAttribute("loggedPharmacist")!=null){
                chain.doFilter(req,resp);
            }else{
                resp.sendRedirect(req.getServletContext().getContextPath()+"/");
            }
        }

    }


    @Override
    public void destroy() {
    }
}
