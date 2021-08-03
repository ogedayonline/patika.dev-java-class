import java.util.Scanner;

public class Main {
        public static void main(String[] args) {


            double mat, fiz, kim, tur, tar, muz;
            Scanner input = new Scanner(System.in);


            System.out.print("Matematik notunuzu giriniz = ");
            mat = input.nextInt();

            System.out.print("Fizik notunuzu giriniz = ");
            fiz = input.nextInt();

            System.out.print("Kimya notunuzu giriniz = ");
            kim = input.nextInt();

            System.out.print("Türkçe notunuzu giriniz = ");
            tur = input.nextInt();

            System.out.print("Tarih notunuzu giriniz = ");
            tar = input.nextInt();

            System.out.print("Müzik notunuzu giriniz = ");
            muz = input.nextInt();


            double toplam = mat + fiz + kim + tur + tar + muz;
            double ortalama = toplam / 6;


            System.out.println("Ortalamanız = " + ortalama);
            boolean kosul1 = ortalama < 50;
            System.out.println("Durum = " + (kosul1 == true ? "Kaldı" : "Geçti"));

        }
    }


