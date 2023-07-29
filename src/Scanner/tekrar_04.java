package Scanner;

import java.util.Scanner;

public class tekrar_04 {
    public static void main(String[] args) {

        Scanner ahsen=new Scanner(System.in);
        System.out.println("Dikdörtgenin iki kenarını giriniz");
        double kenar1= ahsen.nextDouble();
        double kenar2= ahsen.nextDouble();
        System.out.println("Dikdörtgenin alanı :"+ kenar1*kenar2);
    }
}
