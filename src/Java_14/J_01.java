package Java_14;

import java.util.Scanner;

public class J_01 {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        //Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
        //         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //         eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        //         - ilk harf kucuk harf olmali
        //         - son karakter rakam olmali
        //         - sifre bosluk icermemeli
        //         - uzunlugu en az 10 karakter olmali

        // flag yontemini kullanalim
        // flag'i basta true yapalim, her uygun olmayan durumda false degeri atayalim

        boolean flag = true;

        // sartlar birbirinden bagimsiz oldugundan bagimsiz if cumleleri kullanalim


        System.out.println("Lütfen şifrenizi giriniz");
        String şifre= scanner.nextLine();
        char ilkHarf=şifre.charAt(0);


        if(!(ilkHarf>='a' && ilkHarf<='z')){
        System.out.println("İlk karakter küçük harf  olmalı");
        flag=false;}


        char sonKarakter=şifre.charAt(şifre.length()-1);

        if (!(sonKarakter>='0' && sonKarakter <='9')){
        System.out.println("Son karakter rakam olmalı");
        flag=false;}


        if (şifre.contains(" ")){
        System.out.println("Şifre boşluk içermemeli");
        flag=false;}

        if (!(şifre.length() >=10)){
            System.out.println("Şifrenin uzunluğu en az on karakter olmalı");
            flag=false;
        }

        if (flag){
            System.out.println("Şifre başarıli şekilde kaydedildi");
        }











    }

}
