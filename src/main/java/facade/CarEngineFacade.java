package facade;

import facade.system.AirFlow;
import facade.system.CoolingController;
import facade.system.FuelInjector;
import facade.system.Starter;

/**
 * Facade allows to hide all difficult realization. User interacts only this class
 *
 * @author Max
 * */
public class CarEngineFacade {
    private static final int DEFAULT_COOLING_TEMP = 90;

    private FuelInjector fuelInjector = new FuelInjector();
    private AirFlow airFlow = new AirFlow();
    private Starter starter = new Starter();
    private CoolingController coolingController = new CoolingController();

    public void startEngine() {
        fuelInjector.on();
        airFlow.takeAir();
        fuelInjector.on();
        fuelInjector.inject();
        starter.start();
        coolingController.setTemperatureUpLimit(CoolingController.DEFULT_RADIATOR_SPEED);
        coolingController.run();
    }

    public void stopEngine() {
        fuelInjector.off();
        coolingController.cool();
        coolingController.stop();
        airFlow.off();
    }
}
