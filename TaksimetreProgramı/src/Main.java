import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double kackm,odenecekTutar,kmBasina,acilis;
            kmBasina=2.20;
            acilis=10;
        Scanner scanner=new Scanner(System.in);
	    System.out.println("Kaç km gitmek istiyorsunuz");
        kackm=scanner.nextDouble();
        odenecekTutar=kackm*kmBasina+acilis;
        if (odenecekTutar<=20){
            odenecekTutar=20;
            System.out.println("Toplam Tutar :"+odenecekTutar);
        }
        else {
            System.out.println("Toplam Tutar :"+odenecekTutar);
        }
    }
}
