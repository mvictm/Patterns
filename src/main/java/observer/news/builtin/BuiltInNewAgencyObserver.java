package observer.news.builtin;

import java.util.Observable;

public class BuiltInNewAgencyObserver extends Observable {
    private String news;

    public void setNews(String news) {
        this.news = news;
        setChanged();
        notifyObservers(news);
    }
}
