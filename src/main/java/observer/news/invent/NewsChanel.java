package observer.news.invent;

import lombok.Getter;
import lombok.Setter;

public class NewsChanel implements Channel {
    @Getter
    @Setter
    private String news;

    @Override
    public void update(Object object) {
        this.setNews((String) object);
    }
}
