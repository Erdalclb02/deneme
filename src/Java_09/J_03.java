package Java_09;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class J_03 {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz");
        int sayı= scanner.nextInt();

        /*
        if (sayı % 2 == 0 ) System.out.println("Sayı çifttir");
        else System.out.println("Sayı tektir");
        */
        System.out.println(sayı % 2==0 ? "Çift sayı" : "Tek sayı");


    }
}
