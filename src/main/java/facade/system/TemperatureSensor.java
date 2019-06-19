package facade.system;

import lombok.extern.java.Log;

/**
 * @author Max
 * */
@Log
public class TemperatureSensor {
    public void getTemperature() {
        log.info("Getting temperature");
    }
}
