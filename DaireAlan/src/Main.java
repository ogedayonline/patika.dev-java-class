import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double pi = 3.14,alan;
        int r,a;
        System.out.println("Dairenin yarıçapını giriniz.");
        r=scanner.nextInt();
        System.out.println("Dairenin merkezi açısını giriniz.");
        a=scanner.nextInt();
        alan=(pi*(r*r)*a)/360;
        System.out.println("Dairenin alanı = "+alan);
    }
}
