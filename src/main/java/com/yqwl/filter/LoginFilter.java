package com.yqwl.filter;

import com.yqwl.common.utils.Constants;
import com.yqwl.pojo.Supervisor;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Administrator on 2019/9/4.
 */
@WebFilter(filterName = "LoginFilter")
public class LoginFilter implements Filter {
    public LoginFilter() {
    }

    public void destroy() {
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        HttpSession session = req.getSession();
        Supervisor currUser = (Supervisor) session.getAttribute(Constants.Login_User);
        if (currUser != null) {
            chain.doFilter(request, response);
            return;
        }
        res.sendRedirect("/login/toLogin.action");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
