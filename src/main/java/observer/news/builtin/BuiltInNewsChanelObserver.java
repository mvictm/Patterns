package observer.news.builtin;

import lombok.Getter;
import lombok.Setter;

import java.util.Observable;
import java.util.Observer;

public class BuiltInNewsChanelObserver implements Observer {
    @Getter
    @Setter
    private String news;

    @Override
    public void update(Observable observable, Object news) {
        this.setNews((String) news);
    }
}
