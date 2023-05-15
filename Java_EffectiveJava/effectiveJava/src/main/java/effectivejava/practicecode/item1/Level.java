package effectivejava.practicecode.item1;

public class Level {

    public static Level checkLevel(int score) {
        if (score < 50) {
            return new Basic();
        } else if (score < 80) {
            return new Advanced();
        } else {
            return new Master();
        }
    }
}
