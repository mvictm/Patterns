package singletons;

import lombok.Getter;
import lombok.Setter;

/**
 * Enum singleton pattern
 *
 * @author Max
 */
public enum EnumSingleton {
    INSTANCE;

    @Getter
    @Setter
    private String singletonName;

    @Getter
    @Setter
    private int singletonNumber;
}
