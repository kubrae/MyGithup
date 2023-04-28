package practice.okulyonetim.okulyonetim;

import java.util.List;

import static practice.okulyonetim.okulyonetim.OgrenciMethod.basla;

public class OgretmenMethods extends Depo {


    static void ogretmenIslemleri() {
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
                ogretmenEkleme();
            case "2":
                ogretmenArama();
            case "3":
                ogretmenListeleme();
            case "4":
                ogretmenSilme();
            case "5":
                basla();
            default:
                System.out.println("Yanlış secim yaptınız");
                ogretmenIslemleri();


        }


    }

    private static void ogretmenSilme() {
        System.out.println(ogretmenList);
        System.out.println("Silmek istediğiniz ogretmen kimlik no girin");
        kimlikNo = input.next();
        if (ogretmenKimlikList.contains(kimlikNo)) {
            index = ogretmenKimlikList.indexOf(kimlikNo);
            ogretmenList.remove(index);
            ogretmenIsimList.remove(index);
            ogretmenSoyIsimList.remove(index);
            ogretmenYasList.remove(index);
            ogretmenBolumList.remove(index);
            ogretmenSicilList.remove(index);
            ogretmenKimlikList.remove(index);

        } else {
            System.out.println("Kimlik no bulunamadı");
        }
        System.out.println("1-Ogretmen islemleri\n2-Ogretmen sil");
        secim = input.next();
        switch (secim) {
            case "1":
                ogretmenIslemleri();
            case "2":
                ogretmenSilme();
            default:
                System.out.println("yanlış secim");
                ogretmenSilme();
        }


    }

    private static void ogretmenListeleme() {
        listeYazdir(ogretmenList);
       //System.out.println(ogretmenList);
        System.out.println("1-Ana menu\n2-Ogretmen islemleri");
        secim = input.next();
        switch (secim) {
            case "1":
                basla();
            case "2":
                ogretmenIslemleri();
            default:
                System.out.println("yanlış seçim");
                ogretmenListeleme();
        }

    }

    private static void ogretmenArama() {
        System.out.println("Ogretmen kimlik no giriniz");
        kimlikNo = input.next();
        if (ogretmenKimlikList.contains(kimlikNo)) {
            index = ogretmenKimlikList.indexOf(kimlikNo);
            listeYazdirIndex(ogretmenList,index);


        } else {
            System.out.println("Kimlik no bulunamadı");

        }


        System.out.println("1-Ogretmen islemleri\n2-Ogretmen arama");
        secim = input.next();
        switch (secim) {
            case "1":
                ogretmenIslemleri();
            case "2":
                ogretmenArama();
            default:
                System.out.println("yanlış secim");
                ogretmenIslemleri();


        }


    }

    private static void ogretmenEkleme() {
        Ogretmen ogrt = new Ogretmen();
        System.out.println("Ogretmen adi: ");
        ogrt.setOgretmenAdi(input.next());
        ogretmenIsimList.add(ogrt.getOgretmenAdi());

        System.out.println("Ogretmen soy adı: ");
        ogrt.setOgretmenSoyadi(input.next());
        ogretmenSoyIsimList.add(ogrt.getOgretmenSoyadi());

        System.out.println("Ogretmen kimlik no: ");
        ogrt.setOgretmenKimlikNo((input.next()));
        ogretmenKimlikList.add((ogrt.getOgretmenKimlikNo()));

        System.out.println("Ogretmen yas:");
        ogrt.setOgretmenYas(input.next());
        ogretmenYasList.add(ogrt.getOgretmenYas());

        System.out.println("Ogretmen bolum: ");
        ogrt.setOgretmenBolum(input.next());
        ogretmenBolumList.add(ogrt.getOgretmenBolum());

        System.out.println("Ogretmen sicil: ");
        ogrt.setOgretmenSicilNo(input.next());
        ogretmenSicilList.add(ogrt.getOgretmenSicilNo());

        ogretmenList.add(ogrt);
        System.out.println("1-Ogretmen ekle\n2-Ogretmen islemleri");
        secim = input.next();
        switch (secim) {
            case "1":
                ogretmenEkleme();
            case "2":
                ogretmenIslemleri();
            default:
                System.out.println("yanlış secim");
                ogretmenEkleme();
        }


    }
    static void listeYazdir(List<Ogretmen> ogretmenList) {
        for (Ogretmen o:ogretmenList) {
            System.out.println(o);
        }}
        static void listeYazdirIndex(List<Ogretmen> ogretmenList,int i) {
            System.out.println(ogretmenList.get(i));

        }

    static void ogretmenEkle(){
        Ogretmen og=new Ogretmen("Ali","Veli","1234","34","kimya","1234");
        Ogretmen og1=new Ogretmen("Ahmet","Aslan","4567","35","biyoloji","4567");
        Ogretmen og2=new Ogretmen("Mehmet","Kaplan","8910","36","matematik","8910");
        Ogretmen og3=new Ogretmen("Mustafa","Koc","1011","37","fizik","1011");
        Ogretmen og4=new Ogretmen("Yakup","Kus","1112","38","edebiyat","1112");

        ogretmenList.add(og);
        ogretmenList.add(og1);
        ogretmenList.add(og2);
        ogretmenList.add(og3);
        ogretmenList.add(og4);

        ogretmenIsimList.add(og.getOgretmenAdi());
        ogretmenIsimList.add(og1.getOgretmenAdi());
        ogretmenIsimList.add(og2.getOgretmenAdi());
        ogretmenIsimList.add(og3.getOgretmenAdi());
        ogretmenIsimList.add(og4.getOgretmenAdi());

        ogretmenSoyIsimList.add(og.getOgretmenSoyadi());
        ogretmenSoyIsimList.add(og1.getOgretmenSoyadi());
        ogretmenSoyIsimList.add(og2.getOgretmenSoyadi());
        ogretmenSoyIsimList.add(og3.getOgretmenSoyadi());
        ogretmenSoyIsimList.add(og4.getOgretmenSoyadi());

        ogretmenKimlikList.add(og.getOgretmenKimlikNo());
        ogretmenKimlikList.add(og1.getOgretmenKimlikNo());
        ogretmenKimlikList.add(og2.getOgretmenKimlikNo());
        ogretmenKimlikList.add(og3.getOgretmenKimlikNo());
        ogretmenKimlikList.add(og4.getOgretmenKimlikNo());

        ogretmenYasList.add(og.getOgretmenYas());
        ogretmenYasList.add(og1.getOgretmenYas());
        ogretmenYasList.add(og2.getOgretmenYas());
        ogretmenYasList.add(og3.getOgretmenYas());
        ogretmenYasList.add(og4.getOgretmenYas());

        ogretmenBolumList.add(og.getOgretmenBolum());
        ogretmenBolumList.add(og1.getOgretmenBolum());
        ogretmenBolumList.add(og2.getOgretmenBolum());
        ogretmenBolumList.add(og3.getOgretmenBolum());
        ogretmenBolumList.add(og4.getOgretmenBolum());

        ogretmenSicilList.add(og.getOgretmenSicilNo());
        ogretmenSicilList.add(og1.getOgretmenSicilNo());
        ogretmenSicilList.add(og2.getOgretmenSicilNo());
        ogretmenSicilList.add(og3.getOgretmenSicilNo());
        ogretmenSicilList.add(og4.getOgretmenSicilNo());
    }
}
