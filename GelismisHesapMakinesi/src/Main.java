import java.util.Scanner;

public class Main {
    static void topla(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    static void cikart(int a, int b) {
        int result = a - b;
        System.out.println(result);
    }

    static void carp(int a, int b) {
        int result = a * b;
        System.out.println(result);
    }

    static void bolme(int a, int b) {
        int result = a / b;
        System.out.println(result);
    }

    static void usluSayi(int a, int b) {
        int result = a;
        for (int i = 1; i <= a; i++) {
            result *= a;
        }
        System.out.println(result);
    }

    static void faktoriyel(int a) {
        int result = 1;

        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println(result);
    }

    static void modAlma(int a, int b) {
        int result;
        result = a % b;
        System.out.println(result);
    }


    public static void main(String[] args) {

        int islem;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("İşlem Seçiniz\n" +
                    "1- Toplama İşlemi\n" +
                    "2- Çıkarma İşlemi\n" +
                    "3- Çarpma İşlemi\n" +
                    "4- Bölme işlemi\n" +
                    "5- Üslü Sayı Hesaplama\n" +
                    "6- Faktoriyel Hesaplama\n" +
                    "7- Mod Alm");
                    islem = scanner.nextInt();
            switch (islem) {
                case 1:
                    System.out.println("1. sayıyı giriniz");
                    int sayi1 = scanner.nextInt();
                    System.out.println("2. sayıyı giriniz");
                    int sayi2 = scanner.nextInt();
                    topla(sayi1,sayi2);
                    break;
                case 2:
                    System.out.println("1. sayıyı giriniz");
                    int sayi3 = scanner.nextInt();
                    System.out.println("2. sayıyı giriniz");
                    int sayi4 = scanner.nextInt();
                    cikart(sayi3,sayi4);
                    break;
                case 3:
                    System.out.println("1. sayıyı giriniz");
                    int sayi5 = scanner.nextInt();
                    System.out.println("2. sayıyı giriniz");
                    int sayi6 = scanner.nextInt();
                    carp(sayi5,sayi6);
                    break;
                case 4:
                    System.out.println("1. sayıyı giriniz");
                    int sayi7 = scanner.nextInt();
                    System.out.println("2. sayıyı giriniz");
                    int sayi8 = scanner.nextInt();
                    bolme(sayi7,sayi8);
                    break;
                case 5:
                    System.out.println("sayıyı giriniz");
                    int sayi9 = scanner.nextInt();
                    System.out.println("almak istediğiniz üssü giriniz");
                    int sayi10 = scanner.nextInt();
                    usluSayi(sayi9,sayi10);
                    break;
                case 6:
                    System.out.println("Faktöriyelini almak istediğiniz sayıyı giriniz.");
                    int sayi11 = scanner.nextInt();
                    faktoriyel(sayi11);
                    break;
                case 7:
                    System.out.println("1.sayıyı giriniz");
                    int sayi12 = scanner.nextInt();
                    System.out.println("2. sayıyı giriniz.");
                    int sayi13 = scanner.nextInt();
                    modAlma(sayi12,sayi13);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış değer girdiniz.");
                    break;
            }
        }while (islem!=0);
    }
}