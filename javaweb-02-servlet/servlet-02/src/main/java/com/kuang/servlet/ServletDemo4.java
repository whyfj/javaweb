package com.kuang.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletDemo4 extends HelloServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = this.getServletContext();
        System.out.println("进入了ServletDemo04");
//RequestDispatcher requestDispatcher =
        context.getRequestDispatcher("/gp"); //转发的请求路径
//requestDispatcher.forward(req,resp); //调用forward实现请求转发；
        context.getRequestDispatcher("/gp").forward(req,resp);
    }
}
