import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int yil;
        System.out.println("Bir yil giriniz");
        yil=scanner.nextInt();
        if(yil%4==0&&(yil*100)%400==0){
            System.out.println(yil+"Artık yıldır");
        }
        else {
            System.out.println(yil+"Artık yıl değildir");
        }
    }
}
