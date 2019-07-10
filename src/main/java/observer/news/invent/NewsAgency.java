package observer.news.invent;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private String news;
    private List<Channel> channelList = new ArrayList<>();

    public void addObserver(Channel channel) {
        this.channelList.add(channel);
    }

    public void removeObserver(Channel channel) {
        this.channelList.remove(channel);
    }

    public void setNews(String news) {
        this.news = news;
        for (Channel channel : channelList) {
            channel.update(this.news);
        }
    }
}
