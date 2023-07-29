package dataCasting;

public class DT_05Wrapper {

    public static void main(String[] args) {

        String  str="Java Candır";
        System.out.println(str.charAt(3));//a

        int sayı1=20;

         Integer sayı2=sayı1;
         int sayı3=sayı2;


        System.out.println(Integer.MIN_VALUE);//-2147483648
        System.out.println(Integer.MAX_VALUE);//2147483647


        System.out.println(Short.MIN_VALUE);//-32768
        System.out.println(Short.MAX_VALUE);//32767

         String str1="22";
         String  str2="33";
         System.out.println(str1+str2);//2233

        System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2));//55


       /* String str3="22a";
        String  str4="33b";
        System.out.println(str1+str2);//2233

        System.out.println(Integer.parseInt(str3)+Integer.parseInt(str4));//sayıların formatında bir problem olduğunu söyler ve çalışmaz
        */

        char ch1='7';
        System.out.println(Character.isDigit(ch1));//true
        System.out.println(Character.isLetter(ch1));//false
        System.out.println(Character.isWhitespace(ch1));//false




    }

}
