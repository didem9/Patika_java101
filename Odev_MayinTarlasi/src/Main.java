import java.util.Scanner;

// çapraz kontroller eklenmedi
// bazı hatalar mevcut, güncellenecek

public class Main {
    public static void main(String[] args) {

        System.out.println("Mayin Tarlasına hoş geldiniz !");

        int row, column;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen oynamak istediğiniz boyutları giriniz");
        System.out.print("Satır sayısı: ");
        row = scan.nextInt();
        System.out.print("Sütun sayısı: ");
        column = scan.nextInt();

        MayinTarlasi mayin = new MayinTarlasi(row,column);
        mayin.run();

    }
}