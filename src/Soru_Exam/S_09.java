package Soru_Exam;

import java.util.Scanner;

public class S_09 {


    public static void main(String[] args) {

       /*
        9-) İf-Else yapılarını kullanarak basit hesap makinesi
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen 1. sayıyı giriniz");
        int sayı1= scanner.nextInt();

        System.out.println("Lütfen 2. sayıyı giriniz");
        int sayı2= scanner.nextInt();

        System.out.println("****İŞLEMİNİZİ SEÇİNİZ");
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");

        System.out.println("Seçiminizi giriniz");
        int seçim= scanner.nextInt();


        if (seçim == 1) {
            System.out.println("Toplama işleminin sonucu : " + (sayı1+sayı2));
        }else if (seçim==2){
            System.out.println("Çıkarma işleminin sonucu : " + (sayı1-sayı2));
        }else if (seçim==3){
            System.out.println("Çarpma işleminin sonucu : " + (sayı1 * sayı2));
        }else if (seçim==4){
            System.out.println("Bölme işleminin sonucu : " + (sayı1/sayı2));
        }else {
            System.out.println("Yanlış seçim yaptınız.Seçiminizi kontrol ediniz");
        }



    }



}
