package effectivejava.practicecode.item3;

import java.io.Serializable;

public class Singleton3 implements Serializable {

    private static final Singleton3 INSTANCE = new Singleton3();
    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return INSTANCE;
    }

    private Object readResolve() {
        return INSTANCE;
    }
}
