package facade;

import java.util.List;

/**
 * @author Kübra VARICI
 */
public class SiparisDetaylari {
    public void siparisDetaylariniEkle(int siparisId, List<SepettekiUrun> urunler)
    {
        System.out.println( String.format("%s numaralı siparişte alınan ürünler:", siparisId));
        System.out.println("...............................");

        urunler.forEach(u -> System.out.println(String.format("%s ürününden %s adet alındı. Ara toplam:%s", u.urunAdi, u.adet, u.adet * u.fiyat)));
        System.out.println("...............................");

        Long toplam = urunler.stream().mapToLong(u -> u.fiyat * u.adet).sum();
        System.out.println(String.format("Toplam:%s", toplam));

    }
}
