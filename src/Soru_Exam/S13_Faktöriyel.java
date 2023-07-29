package Soru_Exam;

import java.util.Scanner;

public class S13_Faktöriyel {

    public static void main(String[] args) {

        /*
        Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
         bu sayinin faktoryel degerini hesaplayin
         Ör: 6! =6*5*4*3*2*1=720
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen 20 den küçük bir tamsayı alınız");
        int sayı= scanner.nextInt();

        int çarpım=1;

        for (int i = 1; i <=sayı ; i++) {
            çarpım*=i;
        }
        System.out.println("girilen sayı olan : " +  sayı+ "! = "+çarpım);



    }
}
