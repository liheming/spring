package cn.heming.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * Created by haily on 2017/3/28.
 */
@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends javax.servlet.http.HttpServlet {


    @Override
    public void init() throws ServletException {
        System.out.println("=======doInit========");
        super.init();
    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("===========doPost========");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("===========doGet========");

    }
}
