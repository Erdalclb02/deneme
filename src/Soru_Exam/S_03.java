package Soru_Exam;

import java.util.Scanner;

public class S_03 {

    public static void main(String[] args) {


    /*
            3-) Tahmini varış süresi hesaplama
           Bu örnekte kullanıcıya gitmek istediği mesafeyi
           ve kaç saatte gitmek istediğini soracağız.
           Bu bilgilere göre saatte ortalama
           kaç km hız ile gitmesi gerektiğini ekrana yazdıracağız.

    */

        Scanner scanner=new Scanner(System.in);
        int yol, saat;

        System.out.println("Lütfen yol mesafesini giriniz (km) ");
        yol=scanner.nextInt();

        System.out.println("Gitmek istediğiniz süreyi giriniz (saat) ");
        saat=scanner.nextInt();
        System.out.println("Gitmeniz gereken ortalam hız :" +yol/saat + "km/saat");


    }
}


