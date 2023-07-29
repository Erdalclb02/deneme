package Scanner;

import java.util.Scanner;

public class tekrar_06 {
    public static void main(String[] args) {

        Scanner yusra=new Scanner(System.in);

        System.out.println("Lütfen bir çemberin yarıçapını giriniz");

        int yarıçap= yusra.nextInt();

        System.out.println("Çemberin çevresi :"+ (2*3.14*yarıçap));

        System.out.println("Dairenin alanı: "+3.14*yarıçap*yarıçap);



    }





}
