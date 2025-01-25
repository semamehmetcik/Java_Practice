package day04;

import java.util.Scanner;

public class P01_forLoop {
    public static void main(String[] args) {

        /*  Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         hesaplayan kodu yazınız.

         Örnek Ekran Çıktısı
        Girilen sayı=4
        Kareler toplamı=30
     */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 1'den büyük bir tamsayı griniz");
        int sayi = scanner.nextInt();;

        if (sayi<= 1){
            System.out.println("Lütfen 1'den büyük bir tamsayı giriniz");

        }else {

            int toplam = 0;
            for (int i = 0; i <= sayi ; i++) {
                toplam=i*i;

                
            }
            System.out.println("Girilen sayı : "+sayi);
            System.out.println("1 ile "+ sayi+ "arasındaki sayıların karesi toplamı : "  +toplam);












        }
    }
}
