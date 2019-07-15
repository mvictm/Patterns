package decorator;

import lombok.NonNull;

public class Garland extends TreeDecorator {
    public Garland(@NonNull ChristmasTree christmasTree) {
        super(christmasTree);
    }

    @Override
    public String decorate() {
        return super.decorate() + decorateWithGarland();
    }

    private String decorateWithGarland() {
        return " with garland";
    }
}