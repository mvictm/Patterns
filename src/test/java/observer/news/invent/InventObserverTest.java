package observer.news.invent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InventObserverTest {

    private NewsAgency agency = new NewsAgency();
    private NewsChanel chanel = new NewsChanel();

    @Test
    public void check() {
        agency.addObserver(chanel);
        agency.setNews("news");

        assertEquals(chanel.getNews(), "news");
    }
}