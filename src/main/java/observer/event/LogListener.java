package observer.event;

import java.io.File;

public class LogListener implements EventListener {
    private File log;

    public LogListener(String path) {
        log = new File(path);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Save " + log + "; By " + eventType + "operation; Write in file " + file.getName());
    }
}
