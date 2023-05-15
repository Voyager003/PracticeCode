package effectivejava.practicecode.item1;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(staticName = "of")
@Getter
public class LombokUser {

    private final String name;
    private final String email;
    private final String city;
}
