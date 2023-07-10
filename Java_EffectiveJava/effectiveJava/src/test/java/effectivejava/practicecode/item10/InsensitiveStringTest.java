package effectivejava.practicecode.item10;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class InsensitiveStringTest {

    @Test
    void test() throws Exception {
        CaseInsensitiveString1 cis = new CaseInsensitiveString1("Polish");
        String s = "polish";

        List<CaseInsensitiveString1> list = new ArrayList<>();
        list.add(cis);

        System.out.println(list.contains(s));
    }
}
