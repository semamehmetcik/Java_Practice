package day03;

import java.util.Scanner;

public class P03_switchStatements {
    public static void main(String[] args) {
            /*
    Kullanıcıdan alınan bir sayının kaç basamaklı olduğunu yazdıran bir Java programı yazınız
    Girilen sayı negatifse, pozitif olarak ele alınacaktır. switch yapısını kullanarak çözünüz.
     */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz ");


        if (scanner.hasNextInt()){
            int number =scanner.nextInt();
            if (number>1234567890){
                System.out.println("int max değerinden fazla değer girdiniz,'1234567890'küçük değer giriniz ");
            }

           if (number<0){
                     number = -number;
           }

           String numberString = Integer.toString(number);
           int basamakSayisi = numberString.length();


           switch (basamakSayisi){
               case  1 : System.out.println("Girilen sayi 1 basamaklıdır");
               case  2 : System.out.println("Girilen sayi 2 basamaklıdır");
               case  3 : System.out.println("Girilen sayi 3 basamaklıdır");
               case  4 : System.out.println("Girilen sayi 4 basamaklıdır");
               case  5 : System.out.println("Girilen sayi 5 basamaklıdır");
               case  6 : System.out.println("Girilen sayi 6 basamaklıdır");
               case  7 : System.out.println("Girilen sayi 7 basamaklıdır");
               case  8 : System.out.println("Girilen sayi 8 basamaklıdır");
               case  9 : System.out.println("Girilen sayi 9 basamaklıdır");
               case  10 : System.out.println("Girilen sayi 10 basamaklıdır");
           }



        }else {
            System.out.println("Geçersiz bir giriş yaptınız");
        }
    }
}
