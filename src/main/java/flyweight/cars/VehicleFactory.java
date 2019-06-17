package flyweight.cars;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class VehicleFactory {
    private static Map<Color, Vehicle> vehicleCache = new HashMap<>();

    public static Vehicle createVehicle(@NonNull Color color) {
        return vehicleCache.computeIfAbsent(color, newColor -> {
           Engine engine = new Engine();
           return new Car(engine, newColor);
        });
    }
}