package Scanner;

import java.util.Scanner;

public class tekrar_02 {
    public static void main(String[] args) {

        Scanner erdal=new Scanner(System.in);

        System.out.println("lütfen bir double sayı giriniz");
        double ikincisayı= erdal.nextDouble();

        System.out.println("Lütfen bir int sayı giriniz");
        int ilksayı= erdal.nextInt();

        System.out.println("iki sayının toplamı:" +(ilksayı+ikincisayı));
        System.out.println("iki sayının çarpımı: " + ilksayı*ikincisayı);

    }
}
