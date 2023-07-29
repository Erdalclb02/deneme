package Java_07;

import java.util.Scanner;

public class J_05 {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz");
        int girilenSayı= scanner.nextInt();


        if (girilenSayı % 3 ==0){
            System.out.println("Üç ile bölünebilen sayı");
        }
        if (girilenSayı % 5 ==0){
            System.out.println("Beş ile bölünebilen sayı");

        }


    }

}
