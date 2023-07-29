package Java_08;

import java.util.Scanner;

public class J_02 {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz");
        int girilenSayı= scanner.nextInt();


        if(girilenSayı % 3== 0 && girilenSayı % 5== 0){
            System.out.println("Süper sayı");

        }else if(girilenSayı % 5== 0){
            System.out.println("Sayı beş'in katı");
        }else if (girilenSayı % 3== 0){
            System.out.println("Sayı üç'ün katı");
        }else{
            System.out.println("Yaramaz sayı");
        }




    }
}
