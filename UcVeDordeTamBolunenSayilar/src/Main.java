import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi, toplam = 0, ortalama = 0, sayac = 0;
        System.out.println("Bir sayi giriniz.");
        sayi = scanner.nextInt();
        for (int i = 0; i <= sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sayac++;
                toplam += i;
                System.out.println("3'e ve 4'e bölünen sayılar " + i);
            }
        }
        System.out.println("3'e ve 4'e tam bölünen sayıların toplamları= "+toplam);
        ortalama = toplam / sayac;
        System.out.println("Ortalamaları= "+ortalama);
    }
}

