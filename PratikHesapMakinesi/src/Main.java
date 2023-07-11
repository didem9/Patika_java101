import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float numb1, numb2;
        double result;
        char operation;

        Scanner input = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        numb1 = input.nextFloat();
        System.out.println("İkinci sayıyı giriniz: ");
        numb2 = input.nextFloat();
        System.out.println("Yapmak istediğiniz işlemi giriniz (+, -, *, /): ");
        operation = input.next().charAt(0);

        switch (operation) {
            case '+':
                result = numb1 + numb2;
                System.out.println(numb1 + " + " + numb2 + " = " + result);
                break;
            case '-':
                result = numb1 - numb2;
                System.out.println(numb1 + " - " + numb2 + " = " + result);
                break;
            case '*':
                result = numb1 * numb2;
                System.out.println(numb1 + " * " + numb2 + " = " + result);
                break;
            case '/':
                if(numb2 != 0) {
                    result = numb1 / numb2;
                    System.out.println(numb1 + " / " + numb2 + " = " + result);
                }
                else {
                    System.out.println("Bir sayı 0'a bölünemez.");
                }
                break;
            default:
                System.out.println("Geçersiz işlem! Tekrar deneyin");
                break;
        }
    }
}