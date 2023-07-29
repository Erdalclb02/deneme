package Soru_Exam;

import java.util.Scanner;

public class S17_AsalSayıKontrol {


    public static void main(String[] args) {

        /*
        Soru 11- Kullanicidan pozitif bir tamsayi isteyip,
        sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin.

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen asl sayı kontrolü için pozitif bir tamsayı giriniz");
        int sayı = scanner.nextInt();


        boolean flag = true;

        for (int i = 2; i < sayı; i++) {
            if (sayı % i == 0) {
                System.out.println("Asal değil");
                flag = false;
                break;
            }

        }
        if (flag) {
            System.out.println("Girilen sayı asaldır");
        }


    }
}
