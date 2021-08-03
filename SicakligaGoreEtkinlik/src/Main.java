import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hava Sıcaklığını Giriniz.");
        int sicaklik = scanner.nextInt();
        if(sicaklik<=5){
            System.out.println("Kayağa git");
        }
        else if(sicaklik>5&&sicaklik<=15){
            System.out.println("Sinemaya git");
        }
        else if(sicaklik>15&&sicaklik<=25){
            System.out.println("Pikniğe git");
        }
        else if(sicaklik>25&&sicaklik<=40){
            System.out.println("Yüzmeye Git");
        }
        else {
            System.out.println("EVDE KAL!!!");
        }
    }
}
