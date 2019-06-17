package flyweight.forest;

import lombok.AllArgsConstructor;

import java.awt.*;

@AllArgsConstructor
public class Tree {
    private int x;
    private int y;
    private TreeType type;

    public void draw(Graphics graphics) {
        type.draw(graphics, x, y);
    }
}
