package Soru_Exam;

import java.util.Scanner;

public class S_08 {


    public static void main(String[] args) {

/*
8- ) Beden Kitle İndeksi (BKİ) hesaplama
Bu örnekte kullanıcıdan aldığımız verilere göre
kullanıcının Beden Kitle İndeksini (BKİ) hesaplayacağız.

Beden Kitle İndeksi = Kilo (kg) / Boy(m)*Boy
 */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen kilonuzu (kg) olarak giriniz");
        double kilo = scanner.nextDouble();

        System.out.println("Lütfen boyunuzu (m) olarak giriniz");
        double boy = scanner.nextDouble();

        double bki = kilo / (boy * boy);
        System.out.println("Beden kitle indeksiniz :" + bki);

        if (bki < 18) {
            System.out.println("Zayıf");
        } else if (bki < 25) {
            System.out.println("Normal");
        } else if (bki < 30) {
            System.out.println("Kilolu");
        } else if (bki < 35) {
            System.out.println("Aşırı kilolu");
        } else {
            System.out.println("Obez");
        }
    }
}