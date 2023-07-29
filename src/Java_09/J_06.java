package Java_09;

import java.util.Scanner;

public class J_06 {


    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen iki sayı giriniz");

        double sayı1= scanner.nextDouble();
        double sayı2= scanner.nextDouble();


        System.out.println(sayı1 > sayı2 ? sayı2  :sayı1);
    }
}
