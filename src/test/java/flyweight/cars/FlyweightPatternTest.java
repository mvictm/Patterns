package flyweight.cars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class FlyweightPatternTest {
    private Vehicle pinkVehicle;
    private Vehicle blackVehicle;
    private Vehicle vehicleBlack;

    @BeforeEach
    void initialize() {
        pinkVehicle = VehicleFactory.createVehicle(Color.PINK);
        blackVehicle = VehicleFactory.createVehicle(Color.BLACK);
        vehicleBlack = VehicleFactory.createVehicle(Color.BLACK);
    }

    @Test
    void nonEqualsObject() {
        assertNotEquals(pinkVehicle, blackVehicle);
    }

    @Test
    void equalsObject() {
        assertEquals(blackVehicle, vehicleBlack);
    }

    @Test
    void createNullObject () {
        assertThrows(NullPointerException.class, () ->
                VehicleFactory.createVehicle(null));
    }
}