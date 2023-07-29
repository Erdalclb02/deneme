package Soru_Exam;

import java.util.Scanner;

public class S_04 {

    public static void main(String[] args) {


        /*
        4-) KDV’li ürünün yeni fiyatını hesaplama
        Bu örnekte kullanıcıdan ürünün KDV’siz değerini alacağız.
        Sonrasında ürünün KDV’li fiyatını hesaplayıp ekrana yazdıracağız.
         */

        Scanner erdal=new Scanner(System.in);
        System.out.println("Ürünün KDV'siz fiyatını giriniz");
        double fiyat= erdal.nextDouble();
        double yeni_fiyat=fiyat+(fiyat*18/100);

        System.out.println("Ürünün KDV'li fiyatı : " + yeni_fiyat);
        }

    }

