package effectivejava.practicecode.item5;

import java.util.List;

public class SpellChecker2 {

    private final Lexicon dictionary = new KoreanDictionary();

    private SpellChecker2() {
    }

    public static SpellChecker2 INSTANCE = new SpellChecker2();

    public static boolean isValid(String word) {
        throw new UnsupportedOperationException();
    }

    public static List<String> suggestions(String typo) {
        throw new UnsupportedOperationException();
    }
}
