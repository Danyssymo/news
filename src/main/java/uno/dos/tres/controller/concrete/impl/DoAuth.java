package uno.dos.tres.controller.concrete.impl;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import uno.dos.tres.bean.AuthInfo;
import uno.dos.tres.bean.User;
import uno.dos.tres.controller.concrete.Command;
import uno.dos.tres.service.ServiceProvider;
import uno.dos.tres.service.UserService;

import java.io.IOException;

public class DoAuth implements Command {

    private final UserService userSerivice = ServiceProvider.getInstance().getUserService();

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String username = request.getParameter("login");
        String password = request.getParameter("password");
        System.out.println(username + " " + password);
        User user = userSerivice.signIn(new AuthInfo(username, password));

        if (user != null) {
            HttpSession session = (HttpSession) request.getSession(true);
            session.setAttribute("user", user);

            response.sendRedirect("MyController?command=go_to_main_page");

        } else {
            response.sendRedirect("MyController?command=go_to_welcome_page&Info=Wrong login or password!");
        }
    }
}