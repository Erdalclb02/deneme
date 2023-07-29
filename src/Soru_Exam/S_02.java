package Soru_Exam;

import java.util.Scanner;

public class S_02 {


    public static void main(String[] args) {


        //2-) Dikdörtgenin çevresi ve alanını hesaplama


        Scanner scan=new Scanner(System.in);
        System.out.println("Dikdörtgenin ilk kenarını giriniz");
        int kenar1= scan.nextInt();
        System.out.println("Dikdörtgenin ikinci kenarını giriniz");
        int kenar2= scan.nextInt();
        System.out.println("Dikdörtgenin alanı : " + kenar1*kenar2);
        System.out.println("Dikdörtgenin çevresi : " + 2* (kenar1+kenar2));
    }
}
