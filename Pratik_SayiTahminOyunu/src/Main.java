import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner input = new Scanner(System.in);

        int right = 0;
        int selected;
        int [] wrong = new int[5];
        boolean isWin = false;

        while (right < 5){
            System.out.println("Lütfen tahmininizi girin: ");
            selected = input.nextInt();
            if (selected < 0 || selected >99) {
                System.out.println("Lütfen 0 - 100 arasında değer girin");
                continue;
            }
            if (selected == number){
                System.out.println("Tebrikler doğru tahmin ! Tahmin edilen sayı: " + number);
                isWin = true;
                break;
            }else {
                wrong[right] = selected;

                System.out.println("Hatalı sayı girdiniz");
                if (selected > number){
                    System.out.println(selected + "sayısı, gizli sayıdan büyüktür");
                }else{
                    System.out.println(selected + "sayısı gizli sayıdan küçüktür");
                }
                right++;
                System.out.println("Kalan hakkınız: " + (5 - right));
            }
        }

        if (!isWin){
            System.out.println("Kaybettiniz !");
            System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
        }

    }
}