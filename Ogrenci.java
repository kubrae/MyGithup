package practice.okulyonetim.okulyonetim;

public class Ogrenci {

    String ogrenciAdi;
    String ogrenciSoyadi;
    String ogrenciKimlikNo;
    String ogrenciYas;
    String ogrenciNumara;
    String ogrenciSinif;
    public Ogrenci(){

    }

    @Override
    public String toString() {
        return "===============================" +
                "\nAdi=" + ogrenciAdi  +
                "\nSoyadi=" + ogrenciSoyadi +
                "\nKimlikNo=" + ogrenciKimlikNo+
                "\nYas=" + ogrenciYas +
                "\nNumara=" + ogrenciNumara +
                "\nSınıf=" + ogrenciSinif+
                "\n=============================";
    }

    public Ogrenci(String ogrenciAdi, String ogrenciSoyadi, String ogrenciKimlikNo, String ogrenciYas, String ogrenciNumara, String ogrenciSinif) {
        this.ogrenciAdi = ogrenciAdi;
        this.ogrenciSoyadi = ogrenciSoyadi;
        this.ogrenciKimlikNo = ogrenciKimlikNo;
        this.ogrenciYas = ogrenciYas;
        this.ogrenciNumara = ogrenciNumara;
        this.ogrenciSinif = ogrenciSinif;
    }

    public String getOgrenciAdi() {
        return ogrenciAdi;
    }

    public void setOgrenciAdi(String ogrenciAdi) {
        this.ogrenciAdi = ogrenciAdi;
    }

    public String getOgrenciSoyadi() {
        return ogrenciSoyadi;
    }

    public void setOgrenciSoyadi(String ogrenciSoyadi) {
        this.ogrenciSoyadi = ogrenciSoyadi;
    }

    public String getOgrenciKimlikNo() {
        return ogrenciKimlikNo;
    }

    public void setOgrenciKimlikNo(String ogrenciKimlikNo) {
        this.ogrenciKimlikNo = ogrenciKimlikNo;
    }

    public String getOgrenciYas() {
        return ogrenciYas;
    }

    public void setOgrenciYas(String ogrenciYas) {
        this.ogrenciYas = ogrenciYas;
    }

    public String getOgrenciNumara() {
        return ogrenciNumara;
    }

    public void setOgrenciNumara(String ogrenciNumara) {
        this.ogrenciNumara = ogrenciNumara;
    }

    public String getOgrenciSinif() {
        return ogrenciSinif;
    }

    public void setOgrenciSinif(String ogrenciSinif) {
        this.ogrenciSinif = ogrenciSinif;
    }
}
