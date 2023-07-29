package Soru_Exam;


import java.util.Scanner;

public class S_01 {

    public static void main(String[] args) {

        // 1-) Çemberin çevresini hesaplama


        Scanner scanner=new Scanner(System.in);
        System.out.println("Çemberin yarıçapını giriniz");
        double yarıçap= scanner.nextDouble();

        System.out.println("Çemberin çevresi : " + (2*3.14*yarıçap));

    }
}
