package flyweight.cars;

import lombok.extern.java.Log;

@Log
public class Engine {
    public void startEngine() {
        log.info("Engine is start!");
    }

    public void stopEngine() {
        log.info("Engine is stop!");
    }
}
