package Java_08;

import java.util.Scanner;

public class J_06 {


    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen cinsiyetinizi giriniz E: Erkek, K: Kadın");
        char cinsiyet=scanner.next().toUpperCase().charAt(0);

        System.out.println("Lütfen yaşınızı giriniz");
        double yaş= scanner.nextDouble();


        if (cinsiyet == 'E' && yaş >= 65){
            System.out.println("Emekli olabilir");
        }
        else if(cinsiyet == 'E' && yaş < 65){
            System.out.println("Emekli olamaz, " + (65- yaş ) + "Yıl daha çalışman gerekir");
        }
        else if (cinsiyet == 'K' && yaş >= 60){
            System.out.println("Emekli olabilir");
        }
        else if (cinsiyet == 'K' && yaş < 60) {
            System.out.println("Emekli olamaz, " + (60 - yaş) + "Yıl daha çalışman gerekir");

        }







    }

}
