import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class MayinTarlasi {

    int rowNum, colNum, size;
    String[][] map;
    String[][] board;
    boolean game = true;
    int mineNum;

    Random rand = new Random(); // mayınları rastgele yerleştirmek için
    Scanner scan = new Scanner(System.in);

    MayinTarlasi(int rowNum, int colNum){
        this.rowNum = rowNum;
        this.colNum = colNum;
        this.map = new String[rowNum][colNum];
        this.board = new String[rowNum][colNum];
        this.size = rowNum * colNum;
        this.mineNum = size / 4;

    }
    public void run(){
        int row, col, success = 0; // kullanıcınn girdiği değer
        prepareGame();
        print(map);

        System.out.println("Oyun Başladı !");
        while (game){
            print(board);
            System.out.print("Satır: ");
            row = scan.nextInt();
            System.out.print("Sütun: ");
            col = scan.nextInt();

            if (row < 0 || row >= rowNum - 1){
                System.out.println("Geçersiz koordinat");
                continue;
            }

            if (col < 0 || col >= colNum - 1){
                System.out.println("Geçersiz koordinat");
                continue;
            }

            if (!map[row][col].equals("*")){
                checkMine(row, col);
                success++;
                if (success == (size - (size / 4))){
                    System.out.println("Hiç mayına basmadınız! Tebrikler");
                    break;
                }
            }else{
                game = false;
                System.out.println( "Game Over" );
            }
        }
    }

    public void checkMine(int r, int c){
        if (map[r][c].equals("-")) {
            if ((c < colNum - 1) && (map[r][c + 1].equals("*"))) {
                mineNum++;
            }
            if ((r < rowNum - 1) && map[r + 1][c].equals("*")) {
                mineNum++;
            }
            if ((r > 0) && map[r - 1][c].equals("*")) {
                mineNum++;
            }
            if ((c > 0) && map[r][c - 1].equals("*")) {
                mineNum++;
            }
            if (board[r][c].equals("*")){
                mineNum = -2;
            }
        }
    }

    public void prepareGame(){       // önce haritada rastgele mayın yerleştiriyoruz
        int randRow, randCol, count = 0;
        while(count != mineNum ){
            randRow = rand.nextInt(rowNum);
            randCol = rand.nextInt(colNum);
            if (!map[randRow][randCol].equals("*")){           // mayınlar
                map[randRow][randCol] = "*";
                count++;
            }
        }
    }

    public void print(String[][] arr){

        arr = new String[rowNum][colNum];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (!Objects.equals(arr[i][j], "-")) {
                    System.out.print(" ");
                }
                System.out.print("-");
                }
            System.out.println();
            }
        }
}
