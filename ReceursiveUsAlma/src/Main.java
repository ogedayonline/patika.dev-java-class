public class Main {

    static int usluSayi(int x, int y) {
        if(y>1) {
            x = x*usluSayi(x,y-1);
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(usluSayi(5, 3));
    }
}