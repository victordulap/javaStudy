package com.step.exercises;

public class FindInt {

    private final static char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private final static char[] vocals = {'a', 'e', 'i', 'o', 'u'};

    public static boolean isLetter(char character) {
        character = Character.toLowerCase(character);

        for (char ch : letters) {
            if (character == ch) {
                return true;
            }
        }

        return false;
    }

    public static boolean isVocal(char letter) {
        letter = Character.toLowerCase(letter);

        if (isLetter(letter)) {
            for (char ch : vocals) {
                if (letter == ch) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isConsone(char letter) {
        letter = Character.toLowerCase(letter);

        if (!(isLetter(letter)) || isVocal(letter)) {
            return false;
        }

        return true;
    }
}
