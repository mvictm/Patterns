package facade.system;

import lombok.extern.java.Log;

/**
 * @author Max
 * */
@Log
public class AirFlow {
    private AirFlowMeter airFlowMeter = new AirFlowMeter();

    public void takeAir() {
        airFlowMeter.getMeasurements();
        log.info("Air provided!");
    }

    public void off() {
        log.info("Air controller switched off");
    }
}
