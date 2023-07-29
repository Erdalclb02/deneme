package Java_14;

import java.util.Scanner;

public class J_05 {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen pozitif bir tamsayı giriniz");
        int girilenSayı=scanner.nextInt();

        int sayı= girilenSayı;
        int birlerBasamağı= 0;
        int rakamlarToplamı= 0;

        int basmakSayısı=(sayı+"").length();


        for (int i = 1; i <= basmakSayısı; i++) {
            birlerBasamağı=sayı%10;
            rakamlarToplamı+=birlerBasamağı;
            sayı/=10;


        }












    }

}
