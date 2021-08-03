import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 Scanner scanner=new Scanner(System.in);
	 int sayi1,sayi2,sayi3;
        System.out.println("1. Sayıyı giriniz.");
        sayi1=scanner.nextInt();
        System.out.println("2. Sayıyı giriniz.");
        sayi2=scanner.nextInt();
        System.out.println("3. Sayıyı giriniz.");
        sayi3=scanner.nextInt();
        if(sayi1<sayi2&&sayi1<sayi3){
            System.out.println("Sayı 1 diğerlerinden küçüktür.");
        }
        else if(sayi2<sayi1&&sayi2<sayi1){
            System.out.println("Sayı 2 diğerlerinden küçüktür.");
        }
        else if(sayi3<sayi2&&sayi3<sayi1){
            System.out.println("Sayı 3 diğerlerinden küçüktür.");
        }
    }
}
