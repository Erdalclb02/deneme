package Java_14;

import java.util.Scanner;

public class J_03 {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen başlangıç için pozitif bir tamsayı değeri giriniz");
        int başlangıç= scanner.nextInt();

        System.out.println("Lütfen bitiş için pozitif bir tamsayı değeri giriniz");
        int bitiş= scanner.nextInt();

        int toplam=0;

        if (başlangıç< bitiş){

            for (int i = başlangıç; i <= bitiş; i++) {
                toplam+=i;
                
            }
            
        }else{
            for (int i = bitiş; i <=başlangıç ; i++) {
                toplam+=i;


            }
            
        }
        System.out.println(" sınırlar arasındaki sayıların toplamı: " +toplam);

    }
}
