import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi, toplam = 0;
        System.out.println("Bir sayı giriniz.");
        sayi = scanner.nextInt();
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        if (toplam == sayi) {
            System.out.println(sayi + "Mükemmel Sayıdır.");
        }
    }
}
