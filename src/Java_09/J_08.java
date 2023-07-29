package Java_09;

import java.util.Scanner;

public class J_08 {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Sayı olarak ay numarasını yazdırın");
        int ayNo= scanner.nextByte();

       /* if (ayNo==1) System.out.println("Ocak");
        else if (ayNo==2) System.out.println("Şubat");
        else if (ayNo==3) System.out.println("Mart");
        else if (ayNo==4) System.out.println("Nisan");
        else if (ayNo==5) System.out.println("Mayıs");
        else if (ayNo==6) System.out.println("Haziran");
        else if (ayNo==7) System.out.println("Temmuz");
        else if (ayNo==8) System.out.println("Ağostos");
        else if (ayNo==9) System.out.println("Eylül");
        else if (ayNo==10) System.out.println("Ekim");
        else if (ayNo==11) System.out.println("Kasım");
        else if (ayNo==12) System.out.println("Aralık");
        else System.out.println("Ay numarası yanlış");

        */

        switch (ayNo){
            case 1 :
                System.out.println("Ocak");
                break;
            case 2 :
                System.out.println("Şubat");
                break;

            case 3 :
                System.out.println("Mart");
                break;

            case 4 :
                System.out.println("Nisan");
                break;
            case 5 :
                System.out.println("Mayıs");
                break;
            case 6 :
                System.out.println("Haziran");
                break;
            case 7 :
                System.out.println("Temmuz");
                break;
            case 8 :
                System.out.println("Ağostos");
                break;
            case 9 :
                System.out.println("Eylül");
                break;
            case 10 :
                System.out.println("Ekim");
                break;
            case 11 :
                System.out.println("Kasım");
                break;
            case 12 :
                System.out.println("Aralık");
                break;
            default:
                System.out.println("Ay numarası yalnış");


                    }


    }
}
