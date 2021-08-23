import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int row,column;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lütfen oynamak istediğiniz boyutları giriniz");
        System.out.println("Satır sayısı giriniz");
        row = scanner.nextInt();
        System.out.println("Sütun sayısı giriniz");
        column = scanner.nextInt();
        MineSweeper mineSweeper=new MineSweeper(row,column);
        mineSweeper.run();
    }
}
