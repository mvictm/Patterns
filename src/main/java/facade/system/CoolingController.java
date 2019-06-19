package facade.system;

import lombok.Setter;
import lombok.extern.java.Log;

/**
 * @author Max
 * */
@Log
public class CoolingController {
    public static final int DEFULT_RADIATOR_SPEED = 10;

    @Setter
    private int temperatureUpLimit;
    private Radiator radiator = new Radiator();
    private TemperatureSensor temperatureSensor = new TemperatureSensor();

    public void run() {
        log.info("Ready!");
        radiator.setSpeed(DEFULT_RADIATOR_SPEED);
    }

    public void cool() {
        log.info("");
        temperatureSensor.getTemperature();
        radiator.on();
    }

    public void stop() {
        log.info("Stopping Cooling controller");
        radiator.off();
    }
}
