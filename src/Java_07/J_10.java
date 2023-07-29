package Java_07;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class J_10 {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("üçgenin kenarlarını giriniz");
        double kenar1= scanner.nextDouble();
        double kenar2= scanner.nextDouble();
        double kenar3= scanner.nextDouble();


        if(kenar1==kenar2 && kenar1==kenar3 && kenar1>0){
            System.out.println("Eşkenar üçgen");
        }else{
            System.out.println("Eşkenar değil");
        }

    }
}
