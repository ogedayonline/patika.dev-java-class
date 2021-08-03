import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secenek;
        System.out.println("Hangi tarihler arasında doğduğunuzu tuşlayınız\n" +
                "1-21 Mart - 20 Nisan\n" +
                "2-21 Nisan - 21 Mayıs\n" +
                "3-22 Mayıs - 22 Haziran\n" +
                "4-23 Haziran - 22 Temmuz\n" +
                "5-23 Temmuz - 22 Ağustos\n" +
                "6-23 Ağustos - 22 Eylül\n" +
                "7-23 Eylül - 22 Ekim\n" +
                "8-23 Ekim - 21 Kasım\n" +
                "9-22 Kasım - 21 Aralık\n" +
                "10- 22 Aralık - 21 Ocak\n" +
                "11-22 Ocak - 19 Şubat\n" +
                "12- 20 Şubat - 20 Mart");
        secenek=scanner.nextInt();
        if(secenek==1){
            System.out.println("Koç Burcusunuz.");
        }
        else if(secenek==2){
            System.out.println("Boğa Burcusunuz");
        }
        else if(secenek==3){
            System.out.println("İkizler Burcusunuz");
        }
        else if(secenek==4){
            System.out.println("Yengeç Burcusunuz");
        }
        else if(secenek==5){
            System.out.println("Aslan Burcusunuz");
        }
        else if(secenek==6){
            System.out.println("Başak Burcusunuz");
        }
        else if(secenek==7){
            System.out.println("Terazi Burcusunuz");
        }
        else if(secenek==8){
            System.out.println("Akrep Burcusunuz");
        }
        else if(secenek==9){
            System.out.println("Yay Burcusunuz");
        }
        else if(secenek==10){
            System.out.println("Oğlak Burcusunuz");
        }
        else if(secenek==11){
            System.out.println("Kova Burcusunuz");
        }
        else if(secenek==12){
            System.out.println("Balık Burcusunuz");
        }
        else {
            System.out.println("Geçersiz tuşlama yaptınız.");
        }
    }
}