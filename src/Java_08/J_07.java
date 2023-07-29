package Java_08;

import java.util.Scanner;

public class J_07 {


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen cinsiyetinizi giriniz E: Erkek, K: Kadın");
        char cinsiyet=scanner.next().toUpperCase().charAt(0);

        System.out.println("Lütfen yaşınızı giriniz");
        double yaş= scanner.nextDouble();


        if(cinsiyet == 'E' ){
          if(yaş <0 || yaş >100){
              System.out.println("Geçersiz yaş girişi");
          } else if (yaş >=65 ) {
              System.out.println("Erkek emekli olabilir");
          }else{
              System.out.println("Emekli olmak için daha, " + (65- yaş ) + "Yıl daha çalışman gerekir");
          }


        }else if(cinsiyet == 'K'){
            if(yaş <0 || yaş >100){
                System.out.println("Geçersiz yaş girişi");
            } else if (yaş >=60 ) {
                System.out.println("Kadın emekli olabilir");
            }else{
                System.out.println("Emekli olmak için daha, " + (60- yaş ) + "Yıl daha çalışman gerekir");
            }


        }else{
            System.out.println("Cinsiyet hatalı girildi");
        }











    }

}
