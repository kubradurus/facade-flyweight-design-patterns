package flyweight;

/**
 * @author Kübra VARICI
 */
public class CharacterZ extends Character {

    public CharacterZ() {
        this.symbol = 'Z';
        this.keyKod = 29;
    }

    @Override
    public void Display(int pointIndex) {
        this.pointIndex = pointIndex;
        System.out.println(this.symbol + " (pointIndex " + this.pointIndex + ")" + " (Adres " + System.identityHashCode(this.symbol) +")");
    }
}
