package org.example;

import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * Created by vijaytyagi on 14/09/15.
 */
public class HelloWorld extends HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.getWriter().write("get request accepted");
        response.getWriter().flush();
    }
}
