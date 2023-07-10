import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      float kgPear = 2.14f;
      float kgApple = 3.67f;
      float kgTomato = 1.11f;
      float kgBanana = 0.95f;
      float kgEggP = 5.00f;
      float pear, apple, tomato, banana, eggP;

      Scanner input = new Scanner(System.in);
      System.out.println("Kaç kilogram armut aldığınızı girin: ");
      pear = input.nextFloat();
      System.out.println("Kaç kilogram elma aldığınızı girin: ");
      apple = input.nextFloat();
      System.out.println("Kaç kilogram domates aldığınızı girin: ");
      tomato = input.nextFloat();
      System.out.println("Kaç kilogram muz aldığınızı girin: ");
      banana = input.nextFloat();
      System.out.println("Kaç kilogram patlıcan aldığınızı girin: ");
      eggP = input.nextFloat();

      double price = ((kgPear * pear) + (kgApple * apple) + (kgTomato * tomato) + (kgBanana * banana) + (kgEggP * eggP));
      System.out.printf("Ödemeniz gereken tutar: "+"%.2f" + "TL'dir",price);
    }
}