package facade;

/**
 * @author Kübra VARICI
 */
public class UrunIslemleri {
    public void StokGuncelle(int urunId, int adet)
    {
        System.out.println(String.format("%s id'li ürünün stoğundan, %s adet düşüldü.", urunId, adet));
    }
}
