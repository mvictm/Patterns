package singletons;

import lombok.Getter;

/**
 * Singleton with early initialization.
 *
 * @author Max
 */
public class EarlyInitializationSingleton {
    /**
     * Current instance of the singleton
     * */
    @Getter
    private static final EarlyInitializationSingleton INSTANCE = new EarlyInitializationSingleton();

    private EarlyInitializationSingleton() {
    }
}
