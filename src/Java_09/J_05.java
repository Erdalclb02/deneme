package Java_09;

import java.util.Scanner;

public class J_05 {


    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Üçgenin kenar uzunluklarını giriniz");
        double kenar1= scanner.nextDouble();
        double kenar2= scanner.nextDouble();
        double kenar3= scanner.nextDouble();

        System.out.println(kenar1==kenar2 && kenar1==kenar3 && kenar1>0 ? "Eşkenar üçgen"  : "Eşkenar değil");


    }
}
