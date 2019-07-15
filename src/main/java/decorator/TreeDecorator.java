package decorator;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class TreeDecorator implements ChristmasTree {
    @NonNull
    private ChristmasTree christmasTree;

    @Override
    public String decorate() {
        return christmasTree.decorate();
    }
}
