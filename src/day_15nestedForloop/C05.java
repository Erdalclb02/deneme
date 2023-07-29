package day_15nestedForloop;

public class C05 {


    public static void main(String[] args) {

        int satır = 5;
        int sütun = 7;

        //dikdörtgen biçiminde satır ve sütun numaralarını yazdıralım

        for (int i = 1; i <= satır; i++) {//satır
            for (int j = 1; j < sütun; j++) {//sütun
                System.out.print(i + "," + j + "  ");

            }
            System.out.println("");

        }

        // üçgen içn satır ve sütun sayılarını yazdıralım

        for (int i = 1; i <= satır; i++) {//satır
            for (int j = 1; j <= i; j++) {//sütun
                System.out.print(i + "," + j + "  ");

            }
            System.out.println("");

        }


    }
}
