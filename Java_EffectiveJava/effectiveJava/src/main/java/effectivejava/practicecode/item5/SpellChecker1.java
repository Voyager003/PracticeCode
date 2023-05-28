package effectivejava.practicecode.item5;

import java.util.List;

public class SpellChecker1 {

    private static final Lexicon dictionary = new KoreanDictionary();

    private SpellChecker1() {
    }

    public static boolean isValid(String word) {
        throw new UnsupportedOperationException();
    }

    public static List<String> suggestions(String typo) {
        throw new UnsupportedOperationException();
    }
}
