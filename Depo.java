package practice.okulyonetim.okulyonetim;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Depo {
       /*
BİR OKUL YÖNETİM PLATFORMU KODLAYINIZ.

   1. Bu programda, Öğrenci ve Öğretmen Kayıtları ile ilgili işlemler yapılabilmelidir.
      Kayıtlarda şu bilgiler olabilmelidir.

      Öğretmen: Ad-Soyad,  kimlik No, yaş, bölüm, ve sicil No bilgileri içermelidir.
      Öğrenci: Ad-Soyad,  kimlik No, yaş, numara, sınıf bilgileri içermelidir.

   2. Program başladığında Kullanıcıya, Öğretmen ve Öğrenci işlemlerini seçebilmesi için
      Aşağıdaki gibi bir menü gösterilsin.

   ====================================
    ÖĞRENCİ VE ÖĞRETMEN YÖNETİM PANELİ
   ====================================
    1- ÖĞRENCİ İŞLEMLERİ
    2- ÖĞRETMEN İŞLEMLERİ
    Q- ÇIKIŞ

   3. Seçilen Kişi türüne göre aşağıdaki işlemleri gösteren bir alt menü daha gösterilsin.

   ============= İŞLEMLER =============
       1-EKLEME
       2-ARAMA
       3-LİSTELEME
       4-SİLME
       5-ANA MENÜ
       Q-ÇIKIŞ

   SEÇİMİNİZ:

   4. İşlemler menüsünde seçilen işleme göre bir önceki menüde seçilen Kişi türü ile ilgili
       ekleme, kimlik no ile silme ve arama, var olan tüm kişileri listeleme gibi işlemler yapılabilmelidir.
      Bunun yanında bir üst menüye dönme veya çıkış işlemleri de yapılabilmelidir.

 */

    static Scanner input=new Scanner(System.in);

    static String kimlikNo;
    static int index;
     static List<Ogretmen> ogretmenList =new ArrayList<>();
     static List<Ogrenci> ogrenciList= new ArrayList<>();
    static String secim;
///////////////////////////////////////////////////////////////
    static List<String> ogretmenIsimList =new ArrayList<>();
    static List<String> ogretmenSoyIsimList =new ArrayList<>();
    static List<String> ogretmenKimlikList =new ArrayList<>();
    static List<String> ogretmenYasList =new ArrayList<>();
    static List<String> ogretmenBolumList =new ArrayList<>();
    static List<String> ogretmenSicilList =new ArrayList<>();
 //////////////////////////////////////////////////////////////////

    static List<String> ogrenciIsimList =new ArrayList<>();
    static List<String> ogrenciSoyIsimList =new ArrayList<>();
    static List<String> ogrenciKimlikList =new ArrayList<>();
    static List<String> ogrenciYasList =new ArrayList<>();
    static List<String> ogrenciNumaraList =new ArrayList<>();
    static List<String> ogrenciSinifList =new ArrayList<>();


}
//remotta degisiklik yaptim
