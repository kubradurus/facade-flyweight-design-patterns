package facade;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Kübra VARICI
 */
public class App {
    public static void main(String[] args) {
        SiparisFacade siparisFacade = new SiparisFacade();

        List<SepettekiUrun> urunler = new ArrayList<SepettekiUrun>();
        urunler.add(new SepettekiUrun(1,"X",5L,2));
        urunler.add(new SepettekiUrun(2,"Y",8L,3));
        urunler.add(new SepettekiUrun(1,"Z",10L,1));
        urunler.add(new SepettekiUrun(1,"Q",20L,1));

        siparisFacade.siparisVer("Türkay", "Aras Kargo", urunler);

//        Musteri musteri = new Musteri();
//        musteri.setAd("Türkay");
//
//        KargoSirketi kargoSirketi = new KargoSirketi();
//        kargoSirketi.setAd("Aras Kargo");
//
//        SiparisIslemleri siparisIslemleri = new SiparisIslemleri();
//        int siparisId = siparisIslemleri.siparisEkle(new Date(), musteri, kargoSirketi);
//
//        SiparisDetaylari siparisDetaylari = new SiparisDetaylari();
//        siparisDetaylari.siparisDetaylariniEkle(siparisId, urunler);
//
//        UrunIslemleri urunIslemleri = new UrunIslemleri();
//        urunler.forEach(u -> urunIslemleri.StokGuncelle(u.id, u.adet));

    }
}
