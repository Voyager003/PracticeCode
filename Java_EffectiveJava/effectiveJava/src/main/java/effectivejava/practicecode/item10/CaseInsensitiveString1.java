package effectivejava.practicecode.item10;

import java.util.Objects;

public final class CaseInsensitiveString1 {

    private final String s;

    public CaseInsensitiveString1(String s) {
        this.s = Objects.requireNonNull(s);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof CaseInsensitiveString1) {
            return s.equalsIgnoreCase(((CaseInsensitiveString1) o).s);
        }
        if (o instanceof String) {
            return s.equalsIgnoreCase((String) o);
        }
        return false;
    }
}
