import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("1. kenarı giriniz");
        a=scanner.nextInt();
        System.out.println("2. kenarı giriniz");
        b=scanner.nextInt();
        System.out.println("3. kenarı giriniz");
        c=scanner.nextInt();
        double u,alan;
        u=(a+b+c)/2;
        alan=Math.sqrt(u * (u-a)*(u-b)*(u-c));
        System.out.println("Alan= "+alan);
    }
}
