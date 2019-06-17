package adapter.cars;

import lombok.AllArgsConstructor;

/**
 * @author Max
 * */
@AllArgsConstructor
public class MovableAdapterImpl implements MovableAdapter {
    private Movable luxury;

    @Override
    public double getSpeed() {
        double speed = luxury.getSpeed();
        return convertKMToMiles(speed);
    }

    private double convertKMToMiles(double speed) {
        return speed / 1.609;
    }
}
