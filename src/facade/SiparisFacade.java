package facade;

import java.util.Date;
import java.util.List;

/**
 * @author Kübra VARICI
 */
public class SiparisFacade {
    private Musteri musteri;
    private KargoSirketi kargoSirketi;
    private UrunIslemleri urunIslemleri = new UrunIslemleri();
    private SiparisIslemleri siparisIslemleri = new SiparisIslemleri();
    private SiparisDetaylari siparisDetaylari = new SiparisDetaylari();

    public void siparisVer(String musteriAdi, String secilenKargoSirketi, List<SepettekiUrun> urunler)
    {
        musteri = new Musteri();
        kargoSirketi = new KargoSirketi();

        musteri.setAd(musteriAdi);
        kargoSirketi.setAd(secilenKargoSirketi);

        int siparisId = siparisIslemleri.siparisEkle(new Date(), musteri, kargoSirketi);
        siparisDetaylari.siparisDetaylariniEkle(siparisId, urunler);
        urunler.forEach(u -> urunIslemleri.StokGuncelle(u.id, u.adet));

        System.out.println();
        System.out.println("İşlem tamamlandı");
    }

}
