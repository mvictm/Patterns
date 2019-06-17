package flyweight.cars;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.java.Log;

import java.awt.*;

@Log
@AllArgsConstructor
public class Car implements Vehicle {
    private Engine engine;

    @Getter
    private Color color;

    public void startVehicle() {
        engine.startEngine();
        log.info("Car is start!");
    }

    public void stopVehicle() {
        engine.stopEngine();
        log.info("Car is stop!");
    }
}
