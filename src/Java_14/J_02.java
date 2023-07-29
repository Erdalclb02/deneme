package Java_14;

import java.util.Scanner;
import java.util.zip.ZipFile;

public class J_02 {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen başlangıç için pozitif bir tamsayı değeri giriniz");
        int başlangıç= scanner.nextInt();

        System.out.println("Lütfen bitiş için pozitif bir tamsayı değeri giriniz");
        int bitiş= scanner.nextInt();

        if (bitiş < başlangıç){
            System.out.println("Başlangıç değeri bitiş değerinden büyük olamaz");
        }else{
             int toplam= 0;
             for (int i = başlangıç ; i <= bitiş ; i++) {
                toplam+=i;
            }
            System.out.println("Sınılar arsındaki tam sayıların toplamı:" + toplam);
             
        }
    }
}
