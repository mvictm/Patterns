package flyweight.forest;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class LittleForest extends JFrame {
    private List<Tree> treeList = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String data) {
        TreeType treeType = TreeFactory.getTypeTree(name, color, data);
        Tree tree = new Tree(x, y, treeType);
        treeList.add(tree);
    }

    public void paint(Graphics graphics) {
        for (Tree tree:treeList) {
            tree.draw(graphics);
        }
    }
}