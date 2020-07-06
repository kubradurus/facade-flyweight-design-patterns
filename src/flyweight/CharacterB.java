package flyweight;

/**
 * @author Kübra VARICI
 */
public class CharacterB extends Character {

    public CharacterB() {
        this.symbol = 'B';
        this.keyKod = 2;
    }

    @Override
    public void Display(int pointIndex) {
        this.pointIndex = pointIndex;
        System.out.println(this.symbol +" (pointIndex " + this.pointIndex + ")" + " (Adres " + System.identityHashCode(this.symbol) +")");
    }
}
