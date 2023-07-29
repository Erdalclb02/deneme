package Java_08;

import java.util.Scanner;

public class J_04 {


    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz");
        int sayı= scanner.nextInt();


        if (sayı % 3 == 0 && sayı % 5 == 0 ) System.out.println("Güzel sayı");
        else if (sayı % 3 == 0) System.out.println("Üç'ün katı");
        else if (sayı % 5 == 0) System.out.println("Beş'in katı");
        else System.out.println();








    }
}
