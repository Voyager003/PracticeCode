package effectivejava.practicecode.item2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuilderTest {

    @Test
    @DisplayName("점층적 생성자 패턴과 자바빈즈 패턴")
    public void test1() throws Exception {

        NutritionFacts1 cola1 = new NutritionFacts1(240,0,150,25);

        NutritionFacts2 cola2 = new NutritionFacts2();
        cola2.setServingSize(240);
        cola2.setServings(0);
        cola2.setCalories(150);
        cola2.setFat(25);

        assertEquals(cola1.getCalories(), cola2.getCalories());
        assertEquals(cola1.getServings(), cola2.getServings());
        assertEquals(cola1.getServingSize(), cola2.getServingSize());
        assertEquals(cola1.getFat(), cola2.getFat());
    }
}
