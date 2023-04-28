package practice.okulyonetim.okulyonetim;

public class Ogretmen {
    String ogretmenAdi;
    String ogretmenSoyadi;
    String ogretmenKimlikNo;
    String ogretmenYas;
    String ogretmenBolum;
    String ogretmenSicilNo;

    @Override
    public String toString() {
        return "=================================" +
                "\nAdi=" + ogretmenAdi +
                "\nSoyadi=" + ogretmenSoyadi  +
                "\nKimlikNo=" + ogretmenKimlikNo  +
                "\nYas=" + ogretmenYas +
                "\nBolum=" + ogretmenBolum +
                "\nSicilNo=" + ogretmenSicilNo+
                "\n================================";
    }

    public Ogretmen() {

    }

    public Ogretmen(String ogretmenAdi, String ogretmenSoyadi, String ogretmenKimlikNo, String ogretmenYas, String ogretmenBolum, String ogretmenSicilNo) {
        this.ogretmenAdi = ogretmenAdi;
        this.ogretmenSoyadi = ogretmenSoyadi;
        this.ogretmenKimlikNo = ogretmenKimlikNo;
        this.ogretmenYas = ogretmenYas;
        this.ogretmenBolum = ogretmenBolum;
        this.ogretmenSicilNo = ogretmenSicilNo;
    }

    public String getOgretmenAdi() {
        return ogretmenAdi;
    }

    public void setOgretmenAdi(String ogretmenAdi) {
        this.ogretmenAdi = ogretmenAdi;
    }

    public String getOgretmenSoyadi() {
        return ogretmenSoyadi;
    }

    public void setOgretmenSoyadi(String ogretmenSoyadi) {
        this.ogretmenSoyadi = ogretmenSoyadi;
    }

    public String getOgretmenKimlikNo() {
        return ogretmenKimlikNo;
    }

    public void setOgretmenKimlikNo(String ogretmenKimlikNo) {
        this.ogretmenKimlikNo = ogretmenKimlikNo;
    }

    public String getOgretmenYas() {
        return ogretmenYas;
    }

    public void setOgretmenYas(String ogretmenYas) {
        this.ogretmenYas = ogretmenYas;
    }

    public String getOgretmenBolum() {
        return ogretmenBolum;
    }

    public void setOgretmenBolum(String ogretmenBolum) {
        this.ogretmenBolum = ogretmenBolum;
    }

    public String getOgretmenSicilNo() {
        return ogretmenSicilNo;
    }

    public void setOgretmenSicilNo(String ogretmenSicilNo) {
        this.ogretmenSicilNo = ogretmenSicilNo;
    }
}
