package day_15nestedForloop;

import java.util.Scanner;

public class C04 {

    public static void main(String[] args) {
        /*

        *                         Kullanıcıdan satır sayısı olarak bir rakam alın ve
        *  *                      aşağıdaki gibi bir şekil çizdirin.
        *  *  *
        *  *  *  *
        *  *  *  *

         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen satır sayısını giriniz");
        int satır= scanner.nextInt();

        for (int i = 1; i <=satır ; i++) {

            for (int j = 1; j <=i ; j++) {
                System.out.print("*  ");
            }
            System.out.println("");
        }











    }
}
