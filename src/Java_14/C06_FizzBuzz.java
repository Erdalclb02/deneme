package Java_14;

import java.util.Scanner;

public class C06_FizzBuzz {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen bir tamsayı giriniz");
        int sayı= scanner.nextInt();


        for (int i = 1; i <=sayı ; i++) {

            if (i %3 ==0 && i% 5==0){
                System.out.print("fizzbuzz\n");
            } else if(i %3 ==0){
                System.out.print("fizz ");
            }else if (i % 5==0){
                System.out.print("buzz ");
            }else{
                System.out.print(i + " ");
            }

        }




    }
}
