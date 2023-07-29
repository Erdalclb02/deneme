package Java_07;

import java.util.Scanner;

public class J_07 {

    public static void main(String[] args) {

        Scanner scaner=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz");
        int girilenSayı= scaner.nextInt();

        if (girilenSayı % 3 ==0 || girilenSayı % 5 ==0 ){
            System.out.println("Güzel sayı");
        }

    }
}
