package facade.system;

import lombok.extern.java.Log;

/**
 * @author Max
 * */
@Log
public class Radiator {
    public void on() {
        log.info("Radiator switched on!");
    }

    public void off() {
        log.info("Radiator switched off!");
    }

    public void setSpeed(int speed) {
        log.info("Setting radiator speed " + speed);
    }
}
