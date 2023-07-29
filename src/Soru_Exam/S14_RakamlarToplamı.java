package Soru_Exam;

import java.util.Scanner;

public class S14_RakamlarToplamı {

    public static void main(String[] args) {

        //Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Rakamlarını toplamak üzere pozitif bir tamsayı giriniz");

        int girilenSayı = scanner.nextInt();

        int sayı = girilenSayı;
        int birlerBasamağı = 0;
        int rakamlarToplamı = 0;

        int basamakSayısı = (sayı + "").length();//int 'ı uzunluğunu bulmak için int öceString yapılmalı.Oda  sayı+"" şelinde yazılarak yapılır.
        for (int i = 1; i <= basamakSayısı; i++) {

            birlerBasamağı = sayı % 10;
            rakamlarToplamı += birlerBasamağı;
            sayı /= 10;

        }
        System.out.println("Girilen " + girilenSayı + "sayının rakamlar Toplamı : " + rakamlarToplamı);


    }
}
