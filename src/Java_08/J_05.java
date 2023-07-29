package Java_08;

import java.util.Scanner;

public class J_05 {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen boyunuzu cm olarak giriniz");
        double boy= scanner.nextDouble();

        System.out.println("Lütfen kilonuzu kilogram olarak giriniz");
        double kilo= scanner.nextDouble();


        double vke=kilo*10000/(boy*boy);


        if (vke >= 30) System.out.println("Obez");
        else if (vke >= 25) System.out.println("Kilolu");
        else if (vke >= 20) System.out.println("Normal");
        else  System.out.println("Zayıf");






    }


}
