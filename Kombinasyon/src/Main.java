import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi1, sayi, faktoriyel1 = 1, faktoriyel2 = 1, faktoriyel3 = 1;
        System.out.println("1. sayıyı giriniz");
        sayi = scanner.nextInt();
        System.out.println("2. sayıyı giriniz");
        sayi1 = scanner.nextInt();
        if (sayi > sayi1) {
            for (int i = 1; i <= sayi; i++) {
                faktoriyel1 *= i;

            }
            for (int j = 1; j <= sayi1; j++) {
                faktoriyel2 *= j;
            }
            for (int k = 1; k <= sayi - sayi1; k++) {
                faktoriyel3 *= k;
            }
            int kombinasyon=(faktoriyel1/(faktoriyel2*(faktoriyel3)));
            System.out.println(kombinasyon);

        }
        else{
            System.out.println("1. Sayı 2. Sayıdan büyük olmalıdır.");
        }
    }
}
