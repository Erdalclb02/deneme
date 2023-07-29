package Scanner;

import java.util.Scanner;

public class tekrar_07 {

    public static void main(String[] args) {

        Scanner safvan=new Scanner(System.in);

        System.out.println("Lütfen ilk sayıyı giriniz");
        int sayı1= safvan.nextInt();

        System.out.println("Lütfen ikinci sayıyı giriniz");

        int sayı2=safvan.nextInt();

        int temp= sayı1;
        sayı1=sayı2;
        sayı2=temp;

        System.out.println("İlk sayının yeni değeri : " +sayı1);
        System.out.println("İkinci sayının yeni değeri :"+ sayı2);







    }





}
