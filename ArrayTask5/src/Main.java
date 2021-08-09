import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int row,col;
        System.out.println("Satır sayısı giriniz");
        row=scanner.nextInt();
        System.out.println("Sütun sayısı giriniz");
        col=scanner.nextInt();

        int[][] matris=new int[row][col];
        int[][] transpoze=new int[col][row];

        for(int i=0;i<matris.length;i++){
            for(int j=0;j<matris[i].length;j++){
                System.out.println(i+" . satır "+j+" . kolon ");
                matris[i][j]=scanner.nextInt();
            }

        }
        for(int i=0;i<matris.length;i++){
            for(int j=0;j<matris[i].length;j++){
                System.out.print(matris[i][j]);
            }
            System.out.println();
        }
        for(int i=0;i<matris.length;i++){
            for(int j=0;j<matris[i].length;j++){
                transpoze[j][i]=matris[i][j];
            }
        }
        for(int i=0;i<transpoze.length;i++){
            for(int j=0;j<transpoze[i].length;j++){
                System.out.print(transpoze[i][j]);
            }
            System.out.println();
        }
    }
}