package uno.dos.tres.service.impl;

import uno.dos.tres.bean.News;
import uno.dos.tres.service.NewsService;

import java.util.ArrayList;
import java.util.List;

public class NewsServiceImpl implements NewsService {
    @Override
    public List<News> getNews() {

        List<News> list = new ArrayList<>();
        list.add(new News("mainNews", "Hello", "img/girl.jpg"));
        list.add(new News("mainNews", "HI", "img/girl.jpg"));
        list.add(new News("mainNews", "Heyy", "img/girl.jpg"));
        return list;
    }
}
