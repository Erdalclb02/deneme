package Java_09;

import java.util.Scanner;

public class J_07 {


    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");

        double sayı= scanner.nextDouble();

        System.out.println(sayı >0 ? sayı : -1*sayı);


    }
}
