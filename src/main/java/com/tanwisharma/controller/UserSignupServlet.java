package com.tanwisharma.controller;

import com.tanwisharma.entity.User;
import com.tanwisharma.persistence.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * A controller class for user registration.
 *
 * @author tanwi
 */
@WebServlet("/register")
public class UserSignupServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private UserDao userDao;

    /**
     * init method
     */
    public void init() {
        userDao = new UserDao();
    }

    /**
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first_name = request.getParameter("first_name");
        String last_name = request.getParameter("last_name");
        String user_name = request.getParameter("user_name");
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");

        User user = new User();
        user.setFirst_name(first_name);
        user.setLast_name(last_name);
        user.setUser_name(user_name);
        user.setEmail(email);
        user.setPass(pass);
        try {
            userDao.insert(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        response.sendRedirect("userdetails.jsp");
    }

}
