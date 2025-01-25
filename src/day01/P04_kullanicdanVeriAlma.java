package day01;

import java.util.Scanner;

public class P04_kullanicdanVeriAlma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen adınızı giriniz");
        String isim = scanner.nextLine();

        System.out.println("Lütfen adınızı ve soyadınızı giriniz");
        String isimSoyisim = scanner.nextLine();

        System.out.println("Merhaba " + isimSoyisim + " Hoşgeldiniz");

    }


}
