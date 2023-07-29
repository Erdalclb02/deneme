package Java_07;

import java.util.Scanner;

public class J_06 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Üçgenin kenar uzunluklarını giriniz ");
        double dbl1= scanner.nextDouble();
        double dbl2= scanner.nextDouble();
        double dbl3= scanner.nextDouble();


        if (dbl1==dbl2 &&dbl2==dbl3 && dbl1>0){
            System.out.println("Üçgen eşkenardır");
        }


    }
}
