import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double hesaplanacakPara;
	double kdv,sonuc;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Kdv'si hesaplanacak ücreti giriniz.");
	hesaplanacakPara=scanner.nextDouble();
	if (hesaplanacakPara>0&&hesaplanacakPara<=1000){
	    kdv=0.18;
	    sonuc=hesaplanacakPara*kdv;
        System.out.println(sonuc);
    }
	else{
	    kdv=0.08;
	    sonuc=hesaplanacakPara*kdv;
        System.out.println(sonuc);
    }
  }
}