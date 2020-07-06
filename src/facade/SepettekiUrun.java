package facade;

/**
 * @author Kübra VARICI
 */
public class SepettekiUrun {
    public int id;
    public String urunAdi;
    public int adet;
    public Long fiyat;

    public SepettekiUrun(int id, String urunAdi, Long fiyat, int adet) {
        this.id = id;
        this.urunAdi = urunAdi;
        this.adet = adet;
        this.fiyat = fiyat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public Long getFiyat() {
        return fiyat;
    }

    public void setFiyat(Long fiyat) {
        this.fiyat = fiyat;
    }
}
