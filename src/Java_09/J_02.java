package Java_09;

import java.util.Scanner;

public class J_02 {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ürün adedini giriniz");
        int ürünSayısı = scanner.nextInt();

        System.out.println("Lütfen liste fiyatı giriniz");
        double listeFiyatı = scanner.nextDouble();

        System.out.println("Müşteri kartınız varmı? \nE:Evet, H:Hayı");
        char kartVarmı = scanner.next().toUpperCase().charAt(0);


        if (kartVarmı == 'E')  {
            if (ürünSayısı > 10) {
                System.out.println("%20 indirimli toplam fiyat : " + ürünSayısı * listeFiyatı * 80 / 100);
            } else {
                System.out.println("%15 indirimli toplam fiyat : " + ürünSayısı * listeFiyatı * 85 / 100);
            }
        } else if (kartVarmı == 'H') {
                if (ürünSayısı > 10) {
                    System.out.println(" %15 indirimli toplam fiyat :" + ürünSayısı * listeFiyatı * 85 / 100);
                } else {
                    System.out.println("%10 indirimli toplam fiyat : " + ürünSayısı * listeFiyatı * 90 / 100);
                }

        } else {
                System.out.println("Kart bilgisi hatalı");

            }
        }
    }
