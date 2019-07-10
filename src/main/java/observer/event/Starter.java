package observer.event;

public class Starter {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.getEventManager().subscribe("open", new LogListener("text.txt"));
        editor.getEventManager().subscribe("save", new EmailListener("adm@mail.ru"));

        editor.openFile("text.txt");
        editor.saveFile();
    }
}