package day16_MethodOluşturma;

public class C01 {


    public static void main(String[] args) {

        String str = "Java güzeldir";
        int başIndex = 3;
        int bitIndex = 7;
        altString("java Güzeldir", 3, 7);
        altString("biraz sabır lütfen", 5, 4);
        altString("Bu da mı gol değil", 11, 33);

        String str1 = "Aramız bozulmasın";
        altString(str1, 5, 10);

    }

    public static void altString(String metin, int başIndex, int bitIndex) {

        if (başIndex > bitIndex) {
            System.out.println("Başlangıç index'i bitiş index'inden büyük olamaz");
        } else if (başIndex >= metin.length() || bitIndex >= metin.length()) {
            System.out.println("Verilen index sınırların dışında");
        } else {
            for (int i = başIndex; i < bitIndex; i++) {
                System.out.print(metin.charAt(i));

            }
        }
        System.out.println("");


    }

}
