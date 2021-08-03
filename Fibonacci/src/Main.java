import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz");
        int n = input.nextInt();
        int x = 0, y = 1, gec = 0;

        System.out.print(n +" Fibonacci elemanları " + x + " " + y);
        for (int i = 1; i < n; i++) {
            gec = x+y;
            x = y;
            y = gec;
            System.out.print(" " + gec);
        }

    }
}