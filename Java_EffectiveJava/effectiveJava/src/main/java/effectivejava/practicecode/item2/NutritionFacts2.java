package effectivejava.practicecode.item2;

import lombok.Getter;
import lombok.Setter;

// JavaBeans 패턴
@Getter @Setter
public class NutritionFacts2 {

    private int servingSize = -1;
    private int servings = -1;
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    public NutritionFacts2() {

    }
}
