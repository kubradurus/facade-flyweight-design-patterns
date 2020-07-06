package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Kübra VARICI
 */
public class CharacterFactory {
    private Map<java.lang.Character, Character> characterDictionary = new HashMap<>();

    public Character GetCharacter(char key)
    {
        Character character = null;

        if (characterDictionary.containsKey(key))
        {
            character = characterDictionary.get(key);
        }

        else
        {
            switch (key)
            {
                case 'A': character = new CharacterA(); break;
                case 'B': character = new CharacterB(); break;
                //...
                case 'Z': character = new CharacterZ(); break;
            }
            characterDictionary.put(key, character);
        }

        return character;
    }

}
