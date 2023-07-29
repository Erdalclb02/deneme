package day_15nestedForloop;

public class C03 {

    public static void main(String[] args) {

        /*
        1               1.satır 1'den 1'e kadar yazdır
        1  2            2.satır 1'den 2'e kadar yazdır
        1  2  3         3.satır 1'den 3'e kadar yazdır
        1  2  3  4      4.satır 1'den 4'e kadar yazdır

         */
        for (int i = 1; i <=4 ; i++) {
            for (int j =1 ; j <=i ; j++) {
                System.out.print(j + "  ");

            }
            System.out.println("");

        }
    }
}
