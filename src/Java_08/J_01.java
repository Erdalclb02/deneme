package Java_08;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class J_01 {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char girilenKarakter=scanner.next().charAt(0);

        if(girilenKarakter>='A' && girilenKarakter <= 'Z'){
            System.out.println("Girilen karakter büyük harftır");
        }else{
            System.out.println("Girilen karakter büyük harf değildir");
        }


    }
}
