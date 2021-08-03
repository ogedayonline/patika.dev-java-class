import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Kuvvetini almak istediğiniz sayı:");
        int sayi=scanner.nextInt();
        for(int i=1;i<=sayi;i*=4){
            System.out.println("Girilen sayıya kadar olan 4'ün kuvvetleri= "+i);
        }
        System.out.println("-------------------------------------------------------");
        for (int j=1;j<=sayi;j*=5){
            System.out.println("Girilen sayıya kadar olan 5'in kuvvetleri= "+j);
        }
    }
}
