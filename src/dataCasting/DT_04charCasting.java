package dataCasting;

import java.util.Scanner;

public class DT_04charCasting {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen ascii tablosundan bir karakter giriniz");

        char girilenKrk=scanner.next().charAt(0);
        System.out.println("Girilen karakter: "+girilenKrk);
        System.out.println("Girilen karakter sonrasındaki 3 karakter:"+
                (girilenKrk+1)+","+
                (girilenKrk+2)+","+
                (girilenKrk+3));//98,99,100

        System.out.println("Lütfen ascii tablosundan bir karakter giriniz");

        char girilenKrt=scanner.next().charAt(0);
        System.out.println("Girilen karakter: "+girilenKrk);
        System.out.println("Girilen karakter sonrasındaki 3 karakter:"+
                (char)(girilenKrt+1)+","+
                (char)(girilenKrt+2)+","+
                (char)(girilenKrt+3));// b,c,d








    }
}
