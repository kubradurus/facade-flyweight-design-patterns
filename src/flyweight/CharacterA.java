package flyweight;

/**
 * @author Kübra VARICI
 */
public class CharacterA extends Character {

    public CharacterA() {
        this.symbol = 'A';
        this.keyKod = 1;
    }

    @Override
    public void Display(int pointIndex) {
        this.pointIndex = pointIndex;
        System.out.println(this.symbol + " (pointIndex " + this.pointIndex + ")" + " (Adres " + System.identityHashCode(this.symbol) +")");
    }
}
