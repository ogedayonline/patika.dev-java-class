import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber, columnNumber, size;
    int[][] map;
    int[][] board;
    boolean game = true;
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    MineSweeper(int rowNumber, int columnNumber) {
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
        this.map = new int[rowNumber][columnNumber];
        this.board = new int[rowNumber][columnNumber];
        this.size = rowNumber * columnNumber;
    }

    public void run() {
        int row, column, success = 0;
        prepareGame();
        print(map);
        System.out.println("Oyun Başladı");
        while (game) {
            print(board);
            System.out.println("Satır : ");
            row=scanner.nextInt();
            System.out.println("Sütun : ");
            column=scanner.nextInt();
            if(row<0||row>=rowNumber){
                System.out.println("Geçersiz Koordinat");
                continue;
            }
            if(column<0||column>=columnNumber){
                System.out.println("Geçersiz Koordinat");
                continue;
            }
            if (map[row][column] != -1) {
                checkMine(row, column);
                success++;
                if (success == (size - (size / 4))) {
                    System.out.println("Tebrikler Kazandınız.");
                    break;
                }
            } else {
                game = false;
                System.out.println("Game Over !");
            }

        }
    }

    public void checkMine(int r, int c) {
        if (map[r][c] == 0) {
            if ((c < columnNumber - 1) && (map[r][c + 1] == -1)) {
                board[r][c]++;
            }
            if ((r < rowNumber - 1) && (map[r + 1][c] == -1)) {
                board[r][c]++;
            }
            if ((r > 0) && (map[r - 1][c] == -1)) {
                board[r][c]++;
            }
            if ((c > 0) && (map[r][c - 1] == -1)) {
                board[r][c]++;

            }
            if (board[r][c] == 0) {
                board[r][c] = 2;
            }
        }
    }

    public void prepareGame() {
        int randRow, randCol, count = 0;
        while (count != (size / 4)) {
            randRow = random.nextInt(rowNumber);
            randCol = random.nextInt(columnNumber);
            if (map[randRow][randCol] != -1) {
                map[randRow][randCol] = -1;
                count++;
            }

        }
    }

    public void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] >= 0)
                    System.out.print(" ");
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
