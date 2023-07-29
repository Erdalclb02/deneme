package Soru_Exam;

import java.util.Scanner;

public class S_07 {


    public static void main(String[] args) {

/*
7-) Girilen 2 sayıyı birbirine göre karşılaştırma
Bu örnekte kullanıcıdan aldığımız 2 sayıyı birbirine göre
 karşılaştırıp eşit, büyük, küçük olma durumlarını ekrana yazdıracağız.
 */

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen ilk sayı giriniz");
        int sayı1=scanner.nextInt();

        System.out.println("Lütfen ilk sayı giriniz");
        int sayı2=scanner.nextInt();


        if (sayı1 > sayı2){
            System.out.println("Sayı1 sayı2 'den büyüktür");
        } else if (sayı1<sayı2) {
            System.out.println("Sayı1  sayı2 'den küçüktür");
        }else {
            System.out.println("sayı1 eşittir sayı2");
        }
    }


}
