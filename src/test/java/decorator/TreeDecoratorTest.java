package decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TreeDecoratorTest {

    @Test
    public void checkDecorator() {
        ChristmasTree christmasTree = new Garland(new BubbleLight(new ChristmasTreeImpl()));
        assertEquals(christmasTree.decorate(), "Christmas tree with Bubble Lights with garland");
    }
}