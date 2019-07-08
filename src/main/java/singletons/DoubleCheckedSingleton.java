package singletons;

/**
 * @author Max
 */
public class DoubleCheckedSingleton {
    /**
     * Current instance of the singleton without initialization
     */
    private static volatile DoubleCheckedSingleton instance;

    private DoubleCheckedSingleton() {
    }

    /**
     * @return current instance of the singleton
     */
    public static DoubleCheckedSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedSingleton();
                }
            }
        }
        return instance;
    }
}