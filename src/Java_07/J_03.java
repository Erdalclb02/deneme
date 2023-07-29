package Java_07;

import java.util.Scanner;

public class J_03 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfenpozitif bir tamsayı giriniz");
        int a= scanner.nextInt();

        if (a%5==0){
            System.out.println("Sayı 5 'e tam bölünür");
        }
    }
}
