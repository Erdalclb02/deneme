package Java_14;

import java.util.Scanner;

public class J_04 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen 20'den küçük pozitif bir tamsayı giriniz");
        int sayı= scanner.nextInt();

        int çarpım=1;

        for (int i =1 ; i <=sayı ; i++) {
            çarpım*=i;
        }
        System.out.println("Gİrilen sayı olan : " +sayı+"! = " + çarpım);





    }
}
