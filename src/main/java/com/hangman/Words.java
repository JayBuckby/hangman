package com.hangman;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Words {
    private static final List<String> words = new ArrayList<>();
    private static final Random RANDOM = new Random();

    static {
        words.add("abbreviated");
        words.add("activators");
        words.add("baking");
        words.add("bleaching");
        words.add("console");
        words.add("cracked");
        words.add("drinker");
        words.add("drystone");
        words.add("embossed");
        words.add("explores");
        words.add("focused");
        words.add("gravitate");
        words.add("hoods");
        words.add("hopefulness");
        words.add("imprint");
        words.add("intimidates");
        words.add("ladled");
        words.add("lookalike");
        words.add("motorways");
        words.add("negotiate");
        words.add("outlaw");
        words.add("questing");
        words.add("radiated");
        words.add("recognised");
        words.add("revisit");
        words.add("sombrero");
        words.add("sweetcorn");
        words.add("testing");
        words.add("unpaid");
        words.add("vibrations");
        words.add("wizardry");
        words.add("xylophone");
        words.add("yesterday");
        words.add("zookeepers");
    }

    public static String generateWord() {
        return words.get(RANDOM.nextInt(words.size()));

    }

}
