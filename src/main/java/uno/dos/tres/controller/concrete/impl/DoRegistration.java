package uno.dos.tres.controller.concrete.impl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import uno.dos.tres.bean.RegInfo;
import uno.dos.tres.controller.concrete.Command;
import uno.dos.tres.service.ServiceProvider;
import uno.dos.tres.service.UserService;

import java.io.IOException;

public class DoRegistration implements Command {

    private final UserService userService = ServiceProvider.getInstance().getUserService();

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String mail = request.getParameter("mail");
        System.out.println(username + " " + password + " " + mail);

        if (username != null && password != null && mail != null) {
            //logic stub
            RegInfo regInfo = new RegInfo();
            regInfo.setUserName(username);
            regInfo.setPassword(password);
            regInfo.setEmail(mail);
            userService.signUp(regInfo);
            response.sendRedirect("MyController?command=go_to_welcome_page&Info=Success registration");
        }else {
            response.sendRedirect("MyController?command=go_to_welcome_page&Info=Invalid registration");
        }


    }
}
