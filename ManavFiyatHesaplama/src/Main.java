import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double armutFiyat=2.14,elmaFiyat=3.67,domatesFiyat=1.11,muzFiyat=0.95,patlıcanFiyat=5.0;
        System.out.println("Kaç kilo armut almak istiyorsunuz?");
        double armut=scanner.nextDouble();
        System.out.println("Kaç kilo elma almak istiyorsunuz?");
        double elma=scanner.nextDouble();
        System.out.println("Kaç kilo domates almak istiyorsunuz?");
        double domates=scanner.nextDouble();
        System.out.println("Kaç kilo MUZ almak istiyorsunuz?");
        double muz=scanner.nextDouble();
        System.out.println("Kaç kilo patlıcan almak istiyorsunuz?");
        double patlıcan=scanner.nextDouble();

        double toplam=(armutFiyat*armut)+(elmaFiyat*elma)+(domatesFiyat*domates)+(muzFiyat*muz)+(patlıcanFiyat*patlıcan);
        System.out.println(toplam);



    }
}
