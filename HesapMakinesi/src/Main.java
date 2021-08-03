import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s1, s2, islem, sonuc;
        System.out.println("1. sayıyı giriniz");
        s1 = scanner.nextInt();
        System.out.println("2. Sayıyı giriniz");
        s2 = scanner.nextInt();
        System.out.println("Yapmak istediğiniz işlemi tuşlayınız \n" +
                "1-Toplama\n" +
                "2-Çıkarma\n" +
                "3-Çarpma\n" +
                "4-Bölme");
        islem = scanner.nextInt();

        switch (islem) {
            case 1:
                sonuc = s1 + s2;
                System.out.println(sonuc);
                break;
            case 2:
                sonuc = s1 - s2;
                System.out.println(sonuc);
                break;
            case 3:
                sonuc = s1 * s2;
                System.out.println(sonuc);
                break;
            case 4:
                sonuc = s1 / s2;
                System.out.println(sonuc);
                break;
            default:
                System.out.println("Yanlış tuşlama yaptınız");
                break;


        }
    }
}
