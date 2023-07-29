package dataCasting;

public class Dt_03CharDataCasting {
    public static void main(String[] args) {

        char ch1='A';
        int sayı1=ch1;
        System.out.println("ch1: "+ch1);
        System.out.println("sayı1: "+sayı1);

        char ch8='a';
        int sayı8=100;
        System.out.println(ch8+sayı8);
        System.out.println(ch8+1);

        char ch9=(char)(ch8+1);
        System.out.println(ch9);

        String str1="Java";
        String str2=" ";
        String str3="Candır";
        System.out.println(str1+str2+str3);

        char ch0='?';
        char ch7='/';
        System.out.println(ch0+ch7);//110


        char chk='h';
        char chl='g';
        System.out.println(chk+chl);//207


        int karakter=50;
        char asciDeğeri=(char)karakter;
        System.out.println("Verilen sayının ascii tablosundaki karşılığı: "+asciDeğeri);



























    }
}
