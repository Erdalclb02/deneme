package day_15nestedForloop;

import java.util.Scanner;

public class C02 {

public static void main(String[] args) {
    /*
Kullanıcıdan 2 rakam alın
ilk rakam satır
ikinci rakam sütun olmak üzere aaşğıdaki şekli çizdirin

          *  *  *  *  *
          *  *  *  *  *
          *  *  *  *  *
          *  *  *  *  *
 */

    Scanner scanner=new Scanner(System.in);

    System.out.println("Oluşturulacak şeklin satır sayısını giriniz");
    int satır= scanner.nextInt();

    System.out.println("Oluşturulacak şeklin sütun sayısını giriniz");
    int sütun=scanner.nextInt();

    for (int i = 1; i <=satır ; i++) {//satırları kontrol eder
        for (int j = 1; j <=sütun ; j++) {//sütunları kontrol eder
            System.out.print("*  ");

        }
        System.out.println("");
    }

}

}

