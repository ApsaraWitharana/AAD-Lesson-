package lk.ijse.gdse68.helloservlet;

import java.io.*;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;


public class HelloServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Hello Servlet: init(ServletConfig)");
        super.init(config);
    }

    {
        System.out.println("Hello Servlet:instance block ");
    }

    static {
        System.out.println("Hello Servlet: static block");
    }
    public HelloServlet() {
        System.out.println("Hello Servlet: Constructor");
    }

//    @Override
//    public void init() throws ServletException {
//        System.out.println("Hello Servlet: int()");
//        super.init();
//    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Hello Servlet: doGet()");
//        super.doGet(req, resp);

    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Hello Servlet: service()");
        super.service(req, resp);

    }
}

// setup project step3 jakarta EE
//01.create project -jakarta ee , change template name web application next add jakarta version 10
//02.add meven dependency
//03.create webapp derectry
//04.create helloservlet

//05.coll methods
//06.add web.xml file path to classes
//07.build-build artifact-add jakarta.war file create the traget file in this stop tomcat in this time
//09.run-edit config-add tomcat local and deployment add the server start up
//10.stop tomcat -run
