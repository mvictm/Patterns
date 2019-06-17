package flyweight.forest;

import lombok.NonNull;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    public static Map<String, TreeType> treeCache = new HashMap<>();

    public static TreeType getTypeTree(@NonNull String name, @NonNull Color color, @NonNull String data) {
        return treeCache.computeIfAbsent(name, newName ->
                new TreeType(newName, color, data));
    }
}
