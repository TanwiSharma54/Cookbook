package com.tanwisharma.controller;

import com.tanwisharma.persistence.GoogleUserDao;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * A simple servlet to welcome the google user.
 * @author tanwi
 */

@WebServlet(
        urlPatterns = {"/addGoogleUser"}
)
public class AddGoogleUser extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        GoogleUserDao userData = new GoogleUserDao();

    }
}
