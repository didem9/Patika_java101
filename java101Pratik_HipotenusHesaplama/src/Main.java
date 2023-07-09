import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float birinciKenar, ikinciKenar;
        double hipotenus;

        Scanner kenarUzunlugu = new Scanner(System.in);

        System.out.println("Birinci kenarın uzunluğunu giriniz: ");
        birinciKenar = kenarUzunlugu.nextFloat();
        System.out.println("İkinci kenarın uzunluğunu giriniz: ");
        ikinciKenar = kenarUzunlugu.nextFloat();

        hipotenus = Math.sqrt((Math.pow(birinciKenar,2)) + (Math.pow(ikinciKenar,2)));

        System.out.printf("Dik kenarın uzunluğu: " + "%.2f", hipotenus);
    }
}