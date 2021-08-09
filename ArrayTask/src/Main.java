import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int girilenSayi, min, max;
        int[] sayilar = {-5, 0, -80, 6, -8, 50, 6, 30, -50};
        Scanner scanner = new Scanner(System.in);
        System.out.println(Arrays.toString(sayilar));
        Arrays.sort(sayilar);
        System.out.println("Sıralı: " + Arrays.toString(sayilar));
        System.out.println("bir sayı giriniz, çıkmak için -1000 giriniz");
        girilenSayi = scanner.nextInt();
        while (girilenSayi != -1000) {

            for (int i = sayilar.length - 1; i >= 0; i--) {
                if (sayilar[i] < girilenSayi) {
                    min = sayilar[i];

                    System.out.println("Dizide girilen sayıdan küçük ve en yakın sayı: " + min);
                    break;
                } else if (i == 0) {
                    System.out.println("Dizide girilen sayıdan [" + girilenSayi + "] küçük sayı bulunamadı " + sayilar[i]);
                    min = sayilar[i];
                }
            }
            for (int i = 0; i < sayilar.length; i++) {
                if (sayilar[i] > girilenSayi) {
                    max = sayilar[i];

                    System.out.println("Dizide girilen sayıdan büyük ve en yakın sayı: " + max);
                    break;
                } else if (i == sayilar.length - 1) {
                    System.out.println("Dizide girilen sayıdan [" + girilenSayi + "] büyük sayı bulunamadı " + sayilar[i]);
                    max = sayilar[i];
                }
            }
            girilenSayi = scanner.nextInt();
        }
    }
}



