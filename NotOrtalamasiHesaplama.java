import java.util.Scanner;

public class NotOrtalamasiHesaplama {
    public static void main(String[] args) {
       int mat,fizik,kimya,turkce,tarih, muzik;

       Scanner inp = new Scanner(System.in);


        System.out.println("Matematik Notu : ");
        mat = inp.nextInt();

        System.out.println("Fizik Notu : ");
        fizik = inp.nextInt();

        System.out.println("Kimya Notu : ");
        kimya = inp.nextInt();

        System.out.println("Turkçe Notu : ");
        turkce = inp.nextInt();

        System.out.println("Tarih Notu : ");
        tarih = inp.nextInt();

        System.out.println("Muzik Notu : ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız : " + sonuc);
        System.out.println(sonuc < 60 ? "Çok Çalışman Gerek 🙂" : "Tebrikler 🥳");



    }
}
