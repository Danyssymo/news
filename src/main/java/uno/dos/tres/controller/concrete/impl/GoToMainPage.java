package uno.dos.tres.controller.concrete.impl;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import uno.dos.tres.bean.News;
import uno.dos.tres.controller.concrete.Command;
import uno.dos.tres.service.NewsService;
import uno.dos.tres.service.ServiceProvider;
import uno.dos.tres.service.impl.NewsServiceImpl;

import java.io.IOException;
import java.util.List;

public class GoToMainPage implements Command {

    private final NewsService newsService = ServiceProvider.getInstance().getNewsService();

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<News> myNews = newsService.getNews();
        request.setAttribute("myNews", myNews);
        RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/jsp/main.jsp");
        rd.forward(request, response);
    }
}
