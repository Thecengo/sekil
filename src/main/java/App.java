import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    static List<Sekil> sekilList = new ArrayList<Sekil>();




    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        sekilOlustur(scanner);

        cevreHesaplariGoster(sekilList);

        alanHesaplariGoster(sekilList);




    }

    public static void cevreHesaplariGoster(List<Sekil> sekilList){

        for (Sekil sekil : sekilList) {
            System.out.println(sekil.getClass().getName() + " cevresi: "+sekil.cevreHesapla());

        }

    }

    public static void alanHesaplariGoster(List<Sekil> sekilList){

        for (Sekil sekil : sekilList) {
            System.out.println(sekil.getClass().getName() + " alani: "+sekil.alanHesapla());

        }

    }

    public static void sekilOlustur(Scanner scanner){

        Sekil sekil;

        boolean cikisYap = true;

        while (cikisYap){
            System.out.println(StringYazici.sekilSecStringi);
            System.out.println(StringYazici.kareSecimYazisi);
            System.out.println(StringYazici.dikdortgenYazisi);
            System.out.println(StringYazici.ucgenYazisi);
            System.out.println(StringYazici.cikisYazisi);

            int sekilIcinGirilenSayi = scanner.nextInt();

            switch (sekilIcinGirilenSayi){
                case 0:
                    System.out.println("Çıkış yapildi");
                    cikisYap = false;
                    break;
                case 1:
                    System.out.println(StringYazici.kareKenarYazisi);
                    double kareKenarUzunlugu = scanner.nextDouble();

                    sekil = new Kare(kareKenarUzunlugu);

                    sekilList.add(sekil);

                    break;
                case 2:
                    System.out.println(StringYazici.uzunKenarYazisi);
                    double uzunKenarUzunlugu = scanner.nextDouble();

                    System.out.println(StringYazici.kisaKenarYazisi);
                    double kisaKenarUzunlugu = scanner.nextDouble();

                    sekil = new Dikdörtgen(uzunKenarUzunlugu, kisaKenarUzunlugu);

                    sekilList.add(sekil);
                    break;
                case 3:
                    System.out.println(StringYazici.birinciKenarUzunluguUcgenYazisi);
                    double ucgenIlkKenar = scanner.nextDouble();

                    System.out.println(StringYazici.tabanUzunluguUcgenYazisi);
                    double ucgenTaban = scanner.nextDouble();

                    System.out.println(StringYazici.yukseklikYazisi);
                    double ucgenYukseklik = scanner.nextDouble();

                    System.out.println(StringYazici.ucuncuKenarUzunluguUcgenYazisi);
                    double ucgenUcuncuKenar = scanner.nextDouble();

                    sekil = new Ucgen(ucgenIlkKenar,ucgenTaban,ucgenUcuncuKenar,ucgenYukseklik);

                    sekilList.add(sekil);

                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + sekilIcinGirilenSayi);
            }
        }
    }

}
