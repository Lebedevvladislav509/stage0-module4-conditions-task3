package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        character = Character.toLowerCase(character);
        if (character == 97 || character == 101 || character == 105 || character == 111 || character == 117 || character == 121) {
            System.out.println("Vowel");
        }
    }
}
