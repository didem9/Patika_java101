import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numb1, numb2, numb3;

        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayıyı girin: ");
        numb1 = input.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        numb2 = input.nextInt();

        System.out.print("Üçüncü sayıyı girin: ");
        numb3 = input.nextInt();

        if (numb1 < numb2 && numb1 < numb3){
            if (numb2 < numb3){
                System.out.println("numb1 < numb2 < numb3");
            }
            else {
                System.out.println("numb1 < numb3 < numb2");
            }
        }
        else if (numb2 < numb1 && numb2 < numb3) {
            if (numb1 < numb3) {
                System.out.println("numb2 < numb1 < numb3");
            }
            else {
                System.out.println("numb2 < numb3 < numb1");
            }
        }
        else{
            if (numb2 < numb1) {
                System.out.println("numb3 < numb2 < numb1");
            }
            else {
                System.out.println("numb3 < numb1 < numb2");
            }
        }
    }
}