package observer.event;

import lombok.AllArgsConstructor;

import java.io.File;

@AllArgsConstructor
public class EmailListener implements EventListener {
    private String email;

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email: " + email +"; Used operation: " + eventType + "; Write to file: " + file.getName());
    }
}
