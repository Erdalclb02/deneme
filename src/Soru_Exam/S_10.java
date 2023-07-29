package Soru_Exam;

import java.awt.event.MouseAdapter;
import java.util.Scanner;

public class S_10 {

    public static void main(String[] args) {

/*
10-) Switch-case ile basit hesap makinesi
 */

        Scanner scanner=new Scanner(System.in);
        System.out.println("1.sayıyı giriniz");
        int sayı1= scanner.nextInt();

        System.out.println("2.sayıyı giriniz");
        int sayı2= scanner.nextInt();

        System.out.println("****İŞLEMİNİZİ SEÇİNİZ");
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");

        System.out.println("Seçiminizi giriniz");
        int seçim= scanner.nextInt();

         switch (seçim){
             case 1:
                 System.out.println("Tolama işleminin sonucu : " +(sayı1+sayı2));
                 break;
             case 2:
                 System.out.println("Çıkarma işlemi sonucu : " + (sayı1-sayı2));
                 break;
             case 3:
                 System.out.println("Çarpma işlemi sonucu : " + (sayı1*sayı2));
                 break;
             case 4:
                 System.out.println("Bölme işleminin sonucu : " + (float)sayı1/sayı2);
                 break;
             default:
                 System.out.println("Seçiminiz yanlıştır.Seçiminizi tekrar kontrol ediniz");
         }



    }
}
