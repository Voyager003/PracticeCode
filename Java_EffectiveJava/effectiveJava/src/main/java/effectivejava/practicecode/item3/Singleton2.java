package effectivejava.practicecode.item3;

import java.io.Serializable;

public class Singleton2 implements Serializable {
    private static final Singleton2 INSTANCE = new Singleton2();
    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        return INSTANCE;
    }
}
