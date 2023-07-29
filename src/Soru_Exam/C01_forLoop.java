package Soru_Exam;

import java.util.Scanner;

public class C01_forLoop {

    public static void main(String[] args) {

        /*
        Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
         sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
         Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen başlangıç değeri için pozitif bir tamsayı alınız");
        int başSayı= scanner.nextInt();

        System.out.println("Lütfen bitiş değeri için pozitif bir tamsayı alınız");
        int bitSayı= scanner.nextInt();

       if (bitSayı<başSayı){
           System.out.println("Başlangıç değeri bitiş değerinden büyük olamaz ");

        }else{
           int toplam=0;
           for (int i = başSayı; i <=bitSayı ; i++) {
              //toplam=toplam+i;
               toplam+=i;
               
           }
           System.out.println("Sınırlar arasındaki sayıları toplamı :" + toplam);
       }
       }
    }

