package com.maximus.jwd.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Locale;
import java.util.logging.Logger;

public class FrontController extends HttpServlet {
    public static final Logger LOGGER = Logger.getLogger(FrontController.class.getName());


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final String message = req.getParameter("message");
        final String capMessage = message.toUpperCase();
        req.setAttribute("capitalizedText", capMessage);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
