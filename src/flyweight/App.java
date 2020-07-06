package flyweight;

/**
 * @author Kübra VARICI
 */
public class App {
    public static void main(String[] args) {
        // Build a document with text
        String document = "AAZZBBZB";
        char[] chars = document.toCharArray();
        CharacterFactory factory = new CharacterFactory();

        // extrinsic state
        int pointSize = 10;

        for (char c : chars) {
            pointSize++;
            Character character = factory.GetCharacter(c);
            character.Display(pointSize);
        }

    }
}
