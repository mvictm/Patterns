package adapter.cars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AdapterPatternTest {

    @Test
    void equalsVariable() {
        Movable semerka = new LadaSemerka();
        MovableAdapter semerkaAdapter = new MovableAdapterImpl(semerka);

        assertEquals(semerkaAdapter.getSpeed(), 6.215, 0.001);
    }
}