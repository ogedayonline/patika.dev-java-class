public class Main {
    static boolean isPalindrom(int number){
        int temp=number,lastNumber,reverseNumber=0;
        while (temp!=0){
            System.out.println("Sayı=> "+temp);
            lastNumber=temp%10;
            System.out.println("Son basamak=> "+reverseNumber);
            reverseNumber=(reverseNumber*10)+lastNumber;
            System.out.println("Yeni sayı => "+reverseNumber);
            temp /=10;
        }
        if(number==reverseNumber){
            return true;
        }
        else {
            return false;
        }
    }



    public static void main(String[] args) {
        System.out.println(isPalindrom(101));
    }
}
