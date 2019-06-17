package flyweight.forest;

import javax.swing.*;
import java.awt.*;

public class StartPoint {
    private static int CANVAS_SIZE = 500;
    private static int TREES_TO_DRAW = 1000000;
    private static int TREE_TYPES = 2;

    public static void main(String[] args) {
        LittleForest forest = new LittleForest();

        for (int i = 0; i < Math.floor(TREES_TO_DRAW / TREE_TYPES); i++) {
            forest.plantTree(random(CANVAS_SIZE), random(CANVAS_SIZE),
                    "Summer Oak", Color.GREEN, "Oak texture stub");
            forest.plantTree(random(CANVAS_SIZE), random(CANVAS_SIZE),
                    "Autumn Oak", Color.ORANGE, "Autumn Oak texture stub");
            forest.plantTree(random(CANVAS_SIZE), random(CANVAS_SIZE),
                    "El'", Color.CYAN, "The best El'");
        }

        forest.setSize(CANVAS_SIZE, CANVAS_SIZE);
        forest.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        forest.setVisible(true);

        System.out.println(TREES_TO_DRAW + " trees drawn");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("Tree size (8 bytes) * " + TREES_TO_DRAW);
        System.out.println("+ TreeTypes size (~30 bytes) * " + TREE_TYPES + "");
        System.out.println("---------------------");
        System.out.println("Total: " + ((TREES_TO_DRAW * 8 + TREE_TYPES * 30) / 1024 / 1024) +
                "MB (instead of " + ((TREES_TO_DRAW * 38) / 1024 / 1024) + "MB)");
    }

    private static int random(int max) {
        return (int) (Math.random() * (max + 1));
    }
}
