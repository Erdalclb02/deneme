package Java_08;

import java.util.Scanner;

public class J_03 {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        double girilenNot= scanner.nextDouble();

        if (girilenNot >= 85) System.out.println("Notunuz AA ");

        else if (girilenNot >= 65 ) System.out.println("Notunuz BB ");

        else if (girilenNot >= 50 ) System.out.println("Notunuz CC ");

        else System.out.println("Notunuz DD ");


    }
}
