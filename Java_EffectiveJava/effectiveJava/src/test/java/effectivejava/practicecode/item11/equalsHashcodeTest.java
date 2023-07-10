package effectivejava.practicecode.item11;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class equalsHashcodeTest {

    @Test
    @DisplayName("zz")
    public void equalsHashcodeTest1() throws Exception {

        short areaCode = 333;
        short prefix = 333;
        short lineNum = 3333;

        PhoneNumber pn = new PhoneNumber(areaCode, prefix, lineNum);

        Map<PhoneNumber, String> map = new HashMap<>();
        map.put(new PhoneNumber(areaCode, prefix, lineNum), "ex");

        Assertions.assertThat(map.get(pn)).isEqualTo("ex");
    }

}
