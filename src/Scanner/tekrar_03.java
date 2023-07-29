package Scanner;

import java.util.Scanner;

public class tekrar_03 {
    public static void main(String[] args) {

    Scanner erdal=new Scanner(System.in);
        System.out.println("Lütfen bir adınızı giriniz");
        String girilenisim= erdal.nextLine();

        System.out.println("Lütfen soyisiminizi giriniz");
        String girilensoyisim= erdal.nextLine();

        System.out.println("Lütfen yaşınızı girin");
        double girilenyaş= erdal.nextDouble();

        System.out.println("İsminiz: "+girilenisim);
        System.out.println("Soyadınız: " +girilensoyisim);
        System.out.println("Yaşınız: "+ girilenyaş);
        System.out.println("Kaydınız başarıyla tamamlanmıştır");




    }

}
