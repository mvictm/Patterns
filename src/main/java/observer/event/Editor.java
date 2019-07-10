package observer.event;

import lombok.Getter;

import java.io.File;

public class Editor {
    @Getter
    private EventManager eventManager;
    private File file;

    public Editor() {
        eventManager = new EventManager("open", "save");
    }

    public void openFile(String path) {
        file = new File(path);
        eventManager.notify("open", file);
    }

    public void saveFile() {
        if (file != null) {
            eventManager.notify("save", file);
        } else {
            throw new RuntimeException("Please create file! Use openFile method.");
        }
    }
}
