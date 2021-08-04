import java.util.Scanner;

public class Main {
    static boolean asalMi(int n, int i)
    {


        if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;


        return asalMi(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayiyi Gir: "); int n = sc.nextInt();
        if(asalMi(n, 2))
            System.out.println("Sayi asal");
        else
            System.out.println("Sayi asal değil");
    }
}