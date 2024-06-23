package lk.ijse.gdse68.api;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("doGet() method is invoked");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("doPost() method is invoked");
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("doPut() method is invoked");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("doDelete() method is invoked");
    }
}

// setup project step2

//01.create project
//02.add mevent dependency
//03.create webapp derectry
//04.create helloservlet and my servlet class
//05.coll methods
//06.add web.xml file path to classes
//07.build-build artifact-add jakarta.war file create the traget file in this stop tomcat in this time
//09.run-edit config-add tomcat local and deployment add the server start up
//10.stop tomcat -run

//out put =doGet() method is invoked
//do you wont to run any method start postman tun method