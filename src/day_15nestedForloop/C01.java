package day_15nestedForloop;

public class C01 {


    public static void main(String[] args) {
         /*
         Aşağıdaki tabloyu konsolda yazdırın
         1 2 3 4
         2 4 6 8
         3 6 9 12
        not:eğer yazdırılacak şekil dikdörtgen şeklinde ise iç içe forloop yapabiiliriz

         */


        for (int i = 1; i <=4 ; i++) {
            System.out.print(i+"  ");
            
        }
        System.out.println("");
        for (int i = 1; i <=4 ; i++) {
            System.out.print(i*2 +"  ");
        }
        System.out.println("");
        for (int i = 1; i <=4 ; i++) {
            System.out.print(i*3 +"  ");

        }
        System.out.println("=====================");

        for (int j = 1; j <=3 ; j++) {
            for (int i = 1; i <=4 ; i++) {
                System.out.print(i*j +"  ");
            }
            System.out.println("");

        }
    }
}
