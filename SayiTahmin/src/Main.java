import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random=new Random();
        int number=random.nextInt(100);
        Scanner scanner=new Scanner(System.in);
        int right =0;
        int select;
        int [] wrong=new int[5];
        boolean isWin=false;
        boolean isWrong=false;
        while(right<5){
            System.out.println("Lütfen tahmininizi giriniz");
            select=scanner.nextInt();

            if(select<0 || select>100){
                System.out.println("Lütfen 0 ile 100 arasında bir sayı giriniz.");
                if(isWrong){
                    right++;
                    System.out.println("Çok fazla hatalı deneme yaptınız"+(5-right));

                }
                else {
                    isWrong=true;
                    System.out.println("Bir sonraki hatalı girişinizde hakkınızdan düşülecek.");
                }
                continue;
            }

            if(select==number){
                System.out.println("Tebrikler Doğru Tahmin ! Tahmin ettiğiniz sayı = "+ number);
                isWin=true;
                break;

            }
            else {

                System.out.println("Hatalı sayı girdiniz.");
                if(select>number){
                    System.out.println("Seçtiğiniz sayı gizli sayıdan büyük.");
                }
                else {
                    System.out.println("Girdiğiniz sayı gizli sayıdan küçük");
                }
                wrong[right]=select;
                right++;
                System.out.println("Kalan hakkınız = "+ (5-right));
            }

        }
        if(!isWin){
            System.out.println("Kaybettiniz.");
            System.out.println("Tahminleriniz = "+ Arrays.toString(wrong));
        }
    }
}
