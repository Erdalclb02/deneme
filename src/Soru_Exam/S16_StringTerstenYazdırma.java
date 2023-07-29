package Soru_Exam;

import java.util.Scanner;

public class S16_StringTerstenYazdırma {


    public static void main(String[] args) {

        //Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen tersten yazdırmak istediğiniz metni giriniz");
        String str= scanner.nextLine();

        //Java Candır
        //rıdnaC avaJ

        for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));

        }
        System.out.println("");
        // terse çevrilmiş halini kaydedelim

        String tersMetin="";

        for (int i = str.length()-1; i>=0 ; i--) {
            tersMetin+=str.charAt(i);
        }
        System.out.println("Terse çevrilen metin : " +tersMetin);
    }
}
