package Java_09;

import java.util.Scanner;

public class J_01 {


    public static void main(String[] args) {



        // Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        // veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz E : Erkek , K : Kadin");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        double yaş = scanner.nextDouble();


        if (yaş <10 || yaş>80){
            System.out.println("Geçeriz yaş");
        }else if (yaş <60){
            if (cinsiyet== 'K'){
                System.out.println("Kadın emekli olması için " + (60-yaş) + "yıl daha çalışmalı");
            }else if (cinsiyet=='E'){
                System.out.println("Erkek emekli olması için " + (65-yaş) + "yıl daha çalışmalı");
            }else {
                System.out.println("Cinsiyet hatalı");
            }
        }else if (yaş<65) {
            if (cinsiyet == 'K') {
                System.out.println("Kadın emekli olabilir");
            } else if (cinsiyet == 'E') {
                System.out.println("Erkek emekli olması için " + (65 - yaş) + "yıl daha çalışmalı");
            } else {
                System.out.println("Cinsiyet hatalı");
            }
        }else {
            if (cinsiyet=='K' || cinsiyet=='E'){
                System.out.println("Emekli olabilir");
            }else{
                System.out.println("Cinsiyet hatalı");

            }
        }







    }
}
