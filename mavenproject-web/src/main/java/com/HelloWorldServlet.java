/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author zcpw
 */
@WebServlet(name = "HelloWorldServlet", urlPatterns = {"/helloworld"})
public class HelloWorldServlet extends HttpServlet {

    @EJB
    private HelloWorldSB helloWorldSB;
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");
        response.getWriter().println(helloWorldSB.hello(nome));
    }
    
}
