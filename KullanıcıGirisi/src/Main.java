import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String username,password;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Kullanıcı adınızı giriniz");
        username=scanner.nextLine();
        System.out.println("Şifrenizi giriniz");
        password=scanner.nextLine();
        if(username=="ogedayonline"&&password=="ogedayonline"){
            System.out.println("Başarıyla giriş yaptınız");
        }
        else{
            System.out.println("Kullanıcı adınız ve ya şifreniz yanlış");
        }
        System.out.println("Şifrenizi sıfırlamak için <S> Tuşuna basın." );
        String s=scanner.nextLine();
        s.toUpperCase();
        if(s.equals("s")){
            System.out.println("Yeni şifreniz eski şifrenizle aynı olamaz.");
            String yeniSifre;
            System.out.println("Lütfen yeni şifrenizi giriniz");
            yeniSifre=scanner.nextLine();
            if(yeniSifre.equals(password)){
                System.out.println("Eski şifrenizle aynı şifreyi girdiniz lütfen tekrar deneyin.");

            }
            else{
                System.out.println("Şifrenizi Başarıyla Değiştirdiniz.");
            }
        }
    }
}
