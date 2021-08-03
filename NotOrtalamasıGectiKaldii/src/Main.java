import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner=new Scanner(System.in);
	    int mat,tur,kim,fiz,muz,ortalama;
        System.out.println("Matematik notunuzu giriniz");
        mat=scanner.nextInt();
        System.out.println("Türkçe notunuzu giriniz");
        tur=scanner.nextInt();
        System.out.println("Kimya notunuzu giriniz");
        kim=scanner.nextInt();
        System.out.println("Fizik notunuzu giriniz");
        fiz=scanner.nextInt();
        System.out.println("Müzik notunuzu giriniz");
        muz=scanner.nextInt();

        ortalama=(mat+tur+kim+fiz+muz)/5;

        if(ortalama>=55){
            System.out.println(ortalama+"ile sınıfı geçtiniz");

        }
        else
            System.out.println(ortalama+"ile sınıfta kaldınız.");
        }
    }

