package Java_07;

import java.util.Scanner;

public class J_09 {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

       System.out.println("Bir not giriniz");
        double girilenNot= scanner.nextDouble();

        /*
        if (girilenNot >= 50 ){
            System.out.println("Sınıfı geçtin");
        }
        if (girilenNot < 50 ){
            System.out.println("Malesef kaldın");
        }*/


        if (girilenNot >= 50){
            System.out.println("Sınıfı geçtin");
        }else{
            System.out.println("Malesef kaldın");
        }

    }
}
