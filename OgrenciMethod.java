package practice.okulyonetim.okulyonetim;


import java.util.List;

import static practice.okulyonetim.okulyonetim.OgretmenMethods.ogretmenIslemleri;

public class OgrenciMethod extends Depo {

    static void basla() {
        System.out.println("""
                ====================================
                 ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ
                ====================================""");

        System.out.println("""
                1- ÖĞRENCİ İŞLEMLERİ
                2- ÖĞRETMEN İŞLEMLERİ
                3- ÇIKIŞ""");

        secim = input.next();


        switch (secim) {
            case "1":
                ogrenciIslemleri();
            case "2":
                 ogretmenIslemleri();
            case "3":
                System.out.println("Hoşcakalın");
                System.exit(0);
            default:
                System.out.println("Yanlış secim yaptınız");
                basla();
        }


    }

    private static void ogrenciIslemleri() {
        System.out.println(" ============= İŞLEMLER =============");
        System.out.println("""
                1-EKLEME
                2-ARAMA
                3-LİSTELEME
                4-SİLME
                5-ANA MENÜ
                """);

        secim = input.next();

        switch (secim) {
            case "1":
                ogrenciEkleme();
            case "2":
                ogrenciArama();
            case "3":
                ogrenciListeleme();
            case "4":
                ogrenciSilme();
            case "5":
                basla();
            default:
                System.out.println("Yanlış secim yaptınız");
                ogrenciIslemleri();


        }


    }

    private static void ogrenciSilme() {
        listeYazdir(ogrenciList);
        System.out.println("Silmek istediğiniz ogrenci kimlik no girin");
        kimlikNo = input.next();
        if (ogrenciKimlikList.contains(kimlikNo)) {
            index = ogrenciKimlikList.indexOf(kimlikNo);
            ogrenciList.remove(index);
            ogrenciIsimList.remove(index);
            ogrenciSoyIsimList.remove(index);
            ogrenciYasList.remove(index);
            ogrenciNumaraList.remove(index);
            ogrenciSinifList.remove(index);
            ogrenciKimlikList.remove(index);

        } else {
            System.out.println("Kimlik no bulunamadı");
        }
        System.out.println("1-Ogrenci islemleri\n2-Ogrenci sil");
        secim = input.next();
        switch (secim) {
            case "1":
                ogrenciIslemleri();
            case "2":
                ogrenciSilme();
            default:
                System.out.println("yanlış secim");
                ogrenciSilme();
        }


    }

    private static void ogrenciListeleme() {
        listeYazdir(ogrenciList);

        System.out.println("1-Ana menu\n2-Ogrenci islemleri");
        secim = input.next();
        switch (secim) {
            case "1":
                basla();
            case "2":
                ogrenciIslemleri();
            default:
                System.out.println("yanlış seçim");
                ogrenciListeleme();
        }

    }

    private static void ogrenciArama() {
        System.out.println("Ogrenci kimlik no giriniz");
        kimlikNo = input.next();
        if (ogrenciKimlikList.contains(kimlikNo)) {
            index = ogrenciKimlikList.indexOf(kimlikNo);
            listeYazdirIndex(ogrenciList,index);


        } else {
            System.out.println("Kimlik no bulunamadı");

        }


        System.out.println("1-Ogrenci islemleri\n2-Ogrenci arama");
        secim = input.next();
        switch (secim) {
            case "1":
                ogrenciIslemleri();
            case "2":
                ogrenciArama();
            default:
                System.out.println("yanlış secim");
                ogrenciIslemleri();


        }


    }

    private static void ogrenciEkleme() {
        Ogrenci ogrnc = new Ogrenci();
        System.out.println("ogrenci adi: ");
        ogrnc.setOgrenciAdi(input.next());
        ogrenciIsimList.add(ogrnc.getOgrenciAdi());

        System.out.println("ogrenci soy adı: ");
        ogrnc.setOgrenciSoyadi(input.next());
        ogrenciSoyIsimList.add(ogrnc.getOgrenciSoyadi());

        System.out.println("ogrenci kimlik no: ");
        ogrnc.setOgrenciKimlikNo((input.next()));
        ogrenciKimlikList.add((ogrnc.getOgrenciKimlikNo()));

        System.out.println("ogrenci yas:");
        ogrnc.setOgrenciYas(input.next());
        ogrenciYasList.add(ogrnc.getOgrenciYas());

        System.out.println("ogrenci numara: ");
        ogrnc.setOgrenciNumara(input.next());
        ogrenciNumaraList.add(ogrnc.getOgrenciNumara());

        System.out.println("ogrenci sınıf: ");
        ogrnc.setOgrenciSinif(input.next());
        ogrenciSinifList.add(ogrnc.getOgrenciSinif());

        ogrenciList.add(ogrnc);
        System.out.println("1-Ogrenci ekle\n2-Ogrenci islemleri");
        secim = input.next();
        switch (secim) {
            case "1":
                ogrenciEkleme();
            case "2":
                ogrenciIslemleri();
            default:
                System.out.println("yanlış secim");
                ogrenciEkleme();
        }

    }
    static void listeYazdir(List<Ogrenci> list) {
        for (Ogrenci o:list) {
            System.out.println(o);
        }}
    static void listeYazdirIndex(List<Ogrenci> list,int i) {
        System.out.println(ogrenciList.get(i));

    }

    static void ogrenciEkle(){
        Ogrenci og=new Ogrenci("Ali","Veli","1234","34","1234","kimya");
        Ogrenci og1=new Ogrenci("Ahmet","Aslan","4567","35","4567","biyoloji");
        Ogrenci og2=new Ogrenci("Mehmet","Kaplan","8910","36","8910","matematik");
        Ogrenci og3=new Ogrenci("Mustafa","Koc","1011","37","1011","fizik");
        Ogrenci og4=new Ogrenci("Yakup","Kus","1112","38","1112","edebiyat");

        ogrenciList.add(og);
        ogrenciList.add(og1);
        ogrenciList.add(og2);
        ogrenciList.add(og3);
        ogrenciList.add(og4);

        ogrenciIsimList.add(og.getOgrenciAdi());
        ogrenciIsimList.add(og1.getOgrenciAdi());
        ogrenciIsimList.add(og2.getOgrenciAdi());
        ogrenciIsimList.add(og3.getOgrenciAdi());
        ogrenciIsimList.add(og4.getOgrenciAdi());

        ogrenciSoyIsimList.add(og.getOgrenciSoyadi());
        ogrenciSoyIsimList.add(og1.getOgrenciSoyadi());
        ogrenciSoyIsimList.add(og2.getOgrenciSoyadi());
        ogrenciSoyIsimList.add(og3.getOgrenciSoyadi());
        ogrenciSoyIsimList.add(og4.getOgrenciSoyadi());

        ogrenciKimlikList.add(og.getOgrenciKimlikNo());
        ogrenciKimlikList.add(og1.getOgrenciKimlikNo());
        ogrenciKimlikList.add(og2.getOgrenciKimlikNo());
        ogrenciKimlikList.add(og3.getOgrenciKimlikNo());
        ogrenciKimlikList.add(og4.getOgrenciKimlikNo());

        ogrenciYasList.add(og.getOgrenciYas());
        ogrenciYasList.add(og1.getOgrenciYas());
        ogrenciYasList.add(og2.getOgrenciYas());
        ogrenciYasList.add(og3.getOgrenciYas());
        ogrenciYasList.add(og4.getOgrenciYas());

        ogrenciSinifList.add(og.getOgrenciSinif());
        ogrenciSinifList.add(og1.getOgrenciSinif());
        ogrenciSinifList.add(og2.getOgrenciSinif());
        ogrenciSinifList.add(og3.getOgrenciSinif());
        ogrenciSinifList.add(og4.getOgrenciSinif());

        ogrenciNumaraList.add(og.getOgrenciNumara());
        ogrenciNumaraList.add(og1.getOgrenciNumara());
        ogrenciNumaraList.add(og2.getOgrenciNumara());
        ogrenciNumaraList.add(og3.getOgrenciNumara());
        ogrenciNumaraList.add(og4.getOgrenciNumara());
    }
}
