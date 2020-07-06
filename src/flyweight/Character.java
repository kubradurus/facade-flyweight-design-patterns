package flyweight;

/**
 * @author Kübra VARICI
 */
public abstract class Character {
    //intrinsic
    protected char symbol;
    protected int keyKod;
    //extrinsic
    protected int pointIndex;

    public abstract void Display(int pointIndex);
}
