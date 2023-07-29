package Soru_Exam;

import java.util.Scanner;

public class S12_forLoop {

    public static void main(String[] args) {

        /*
        Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
         sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
         Bitis degeri baslangic degerinden kucuk olsa da program calissin
         */
        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen pozitif bir başlangıç sayısı alınız");
        int başlangıç= scanner.nextInt();

        System.out.println("Lütfen pozitif bir bitiş sayısı alınız");
        int bitiş= scanner.nextInt();

        int toplam=0;

        if (başlangıç < bitiş){

            for (int i = başlangıç; i <=bitiş; i++) {
                toplam+=i;
            }

        }else {
            for (int i = bitiş; i <=başlangıç ; i++) {
                //toplam=toplam+i;
                toplam+=i;
                
            }
        }
        System.out.println("Sınırlar arasındaki sayıların toplamı :" +toplam);


    }
}
