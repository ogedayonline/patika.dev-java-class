import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int kilo;
	double vke,boy;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Kilonuzu giriniz");
        kilo=scanner.nextInt();
        System.out.println("Boyunuzu giriniz");
        boy=scanner.nextDouble();
        vke= kilo/(boy*boy);
        System.out.println("Vücut kitle endeksiniz"+vke);

    }
}
