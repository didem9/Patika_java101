import java.util.Scanner;
//Girilen gün ve aya göre burcunuzu hesaplar.

public class Main {
    public static void main(String[] args) {
        int birthDay, birthMonth;
        boolean isFalse = true;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğdunuz günü girin: ");
        birthDay = input.nextInt();
        System.out.print("Kaçıncı ayda doğduğunuzu girin: ");
        birthMonth = input.nextInt();

        if (birthMonth == 4) {
            if (birthDay >= 1 && birthDay <= 30) {
                if (birthDay <= 20)
                    System.out.println("Burcunuz: Koç");
                else
                    System.out.println("Burcunuz: Boğa");
            } else {
                isFalse = true;
                System.out.println("Hatalı veri girdiniz.");
            }
        }
        if (birthMonth == 5) {
            if (birthDay >= 1 && birthDay <= 31) {
                if (birthDay <= 21)
                    System.out.println("Burcunuz: Boğa");
                else
                    System.out.println("Burcunuz: İkizler");
            } else {
                isFalse = true;
                System.out.println("Hatalı veri girdiniz.");
            }
        }
        if(birthMonth == 6){
            if (birthDay >= 1 && birthDay <= 30){
                if(birthDay <= 22)
                    System.out.println("Burcunuz: İkizler");
                else
                    System.out.println("Burcunuz: Yengeç");
            }else {
                isFalse = true;
                System.out.println("Hatalı veri girdiniz.");
            }
        }
        if(birthMonth == 7){
            if (birthDay >= 1 && birthDay <= 31){
                if(birthDay <= 22)
                    System.out.println("Burcunuz: Yengeç");
                else
                    System.out.println("Burcunuz: Aslan");
            }else {
                isFalse = true;
                System.out.println("Hatalı veri girdiniz.");
            }
        }
        if(birthMonth == 8){
            if (birthDay >= 1 && birthDay <= 31){
                if(birthDay <= 22)
                    System.out.println("Burcunuz: Aslan");
                else
                    System.out.println("Burcunuz: Başak");
            }else {
                isFalse = true;
                System.out.println("Hatalı veri girdiniz.");
            }
        }
        if(birthMonth == 9){
            if (birthDay >= 1 && birthDay <= 30){
                if(birthDay <= 22)
                    System.out.println("Burcunuz: Başak");
                else
                    System.out.println("Burcunuz: Terazi");
            }else {
                isFalse = true;
                System.out.println("Hatalı veri girdiniz.");
            }
        }
        if(birthMonth == 10){
            if (birthDay >= 1 && birthDay <= 31){
                if(birthDay <= 22)
                    System.out.println("Burcunuz: Terazi");
                else
                    System.out.println("Burcunuz: Akrep");
            }else {
                isFalse = true;
                System.out.println("Hatalı veri girdiniz.");
            }
        }
        if(birthMonth == 11){
            if (birthDay >= 1 && birthDay <= 30){
                if(birthDay <= 21)
                    System.out.println("Burcunuz: Akrep");
                else
                    System.out.println("Burcunuz: Yay");
            }else {
                isFalse = true;
                System.out.println("Hatalı veri girdiniz.");
            }
        }
        if(birthMonth == 12){
            if (birthDay >= 1 && birthDay <= 31){
                if(birthDay <= 21)
                    System.out.println("Burcunuz: Yay");
                else
                    System.out.println("Burcunuz: Oğlak");
            }else {
                isFalse = true;
                System.out.println("Hatalı veri girdiniz.");
            }
        }
        if(birthMonth == 1){
            if (birthDay >= 1 && birthDay <= 31){
                if(birthDay <= 21)
                    System.out.println("Burcunuz: Oğlak");
                else
                    System.out.println("Burcunuz: Kova");
            }else {
                isFalse = true;
                System.out.println("Hatalı veri girdiniz.");
            }
        }
        if(birthMonth == 2){
            if (birthDay >= 1 && birthDay <= 29){
                if(birthDay <= 19)
                    System.out.println("Burcunuz: Kova");
                else
                    System.out.println("Burcunuz: Balık");
            }else {
                isFalse = true;
                System.out.println("Hatalı veri girdiniz.");
            }
        }
        if(birthMonth == 3){
            if (birthDay >= 1 && birthDay <= 31){
                if(birthDay <= 20)
                    System.out.println("Burcunuz: Balık");
                else
                    System.out.println("Burcunuz: Koç");
            }else {
                isFalse = true;
                System.out.println("Hatalı veri girdiniz.");
            }
        }
    }
}