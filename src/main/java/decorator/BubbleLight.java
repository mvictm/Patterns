package decorator;

import lombok.NonNull;

public class BubbleLight extends TreeDecorator {
    public BubbleLight(@NonNull ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithBubble();
    }

    private String decorateWithBubble() {
        return " with Bubble Lights";
    }
}