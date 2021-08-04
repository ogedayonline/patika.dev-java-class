import java.util.Scanner;
public class Main {


    static int desen(int n){
        if(n>=-4){
            System.out.print(" "+n+" ");
            desen(n-5);
            if(n!=-4 && n!=-3 && n!=-2 && n!=-1 && n!=0)
                System.out.print(" "+n+" ");}
        return 0;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısı : ");
        int n = input.nextInt();
        System.out.print("Çıktısı: ");
        desen(n);
    }
}