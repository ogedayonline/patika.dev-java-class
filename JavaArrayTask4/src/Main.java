import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.println("Dizinin boyutunu giriniz. ");
        int boyut=scanner.nextInt();
        int[] dizi= new int[boyut];
        for(int i=0;i<dizi.length;i++){
         System.out.println("Dizinin "+i+". Elemanını giriniz");
         dizi[i]=scanner.nextInt();
      }


        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));



    }
}
