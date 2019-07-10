package observer.news.builtin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BuiltInObserverTest {
    private BuiltInNewAgencyObserver agency = new BuiltInNewAgencyObserver();
    private BuiltInNewsChanelObserver chanel = new BuiltInNewsChanelObserver();

    @Test
    public void check() {
        agency.addObserver(chanel);
        agency.setNews("news");

        assertEquals(chanel.getNews(), "news");
    }

}