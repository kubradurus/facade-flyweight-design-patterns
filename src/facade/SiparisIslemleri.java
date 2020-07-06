package facade;

import java.util.Date;

/**
 * @author Kübra VARICI
 */
public class SiparisIslemleri {
    public int siparisEkle(Date siparisTarihi, Musteri musteri, KargoSirketi kargoSirketi)
    {
        System.out.println(String.format("%s tarihinde %s isimli müşteri siparişi eklendi. Seçilen kargo şirketi:%s",
                siparisTarihi.toString(), musteri.ad, kargoSirketi.ad));
        return 1;
    }

}
