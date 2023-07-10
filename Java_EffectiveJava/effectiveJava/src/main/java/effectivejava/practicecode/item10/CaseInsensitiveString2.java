package effectivejava.practicecode.item10;

import java.util.Objects;

public final
class CaseInsensitiveString2 {

    private final String s;
    public CaseInsensitiveString2(String s) {
        this.s = Objects.requireNonNull(s);
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof CaseInsensitiveString2
                && ((CaseInsensitiveString2) o).s.equalsIgnoreCase(s);
    }
}
