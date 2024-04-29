package uno.dos.tres.controller.concrete.impl;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import uno.dos.tres.controller.concrete.Command;

import java.io.IOException;

public class Logout implements Command {
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.sendRedirect("MyController?command=go_to_welcome_page&Info=Success logout");

    }
}
