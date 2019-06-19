package facade.system;

import lombok.extern.java.Log;

/**
 * @author Max
 * */
@Log
public class FuelInjector {
    private FuelPump fuelPump = new FuelPump();

    public void on() {
        log.info("Fuel injector ready");
    }

    public void inject() {
        fuelPump.pump();
        log.info("Fuel injected");
    }

    public void off() {
        log.info("Stopping fuel injector");
    }
}
