public class Main {

    public static void main(String[] args) {
        int[] sayilar = {1, 2, 3, 4, 5};
        double harmo=0.0;
        for(int i=0;i<sayilar.length;i++){
            harmo+=1.0/(sayilar[i]);
        }
        double harmonik=0.0;
        harmonik=sayilar.length/harmo;
        System.out.println(harmonik);


    }
}




