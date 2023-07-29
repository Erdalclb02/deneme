package Java_10;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class J_01 {


    public static void main(String[] args) {


        // Soru 4- Kullanicidan ISTQB kisaltmasindan harfin anlamini ogrenmek istedigini alin
        //         ve girilen harfin karsiligini yazdirin.
        //	I : International
        //	S : Software
        //	T : Testing
        //	Q : Qualifications
        //	B: Board



        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen anlamını görmek istediğiniz harfi giriniz");
        char harf=scan.next().toUpperCase().charAt(0);

switch (harf){
    case 'I':
        System.out.println("International");
        break;
    case 'S' :
        System.out.println("Software");
        break;
    case 'T':
        System.out.println("Testing");
        break;
    case 'Q' :
        System.out.println("Qualification");
        break;
    case 'B' :
        System.out.println("Board");
        break;
    default:
        System.out.println("Yanlış harf girdiniz");


}


    }
}
