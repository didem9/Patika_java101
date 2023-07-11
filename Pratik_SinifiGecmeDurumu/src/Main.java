import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       float math, physics, turkish, chemistry, music;
       double average;

       Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        math = input.nextFloat();
        if(math<0 || math>100)
        {
            do {
                System.out.println("Girilen not 0 ile 100 arasında olmalıdır.");
                System.out.println("Notunuzu tekrar giriniz.\nMatematik notunuzu giriniz: ");
                math = input.nextFloat();
            }while(math<0 || math>100);
        }

        System.out.print("Fizik notunuzu giriniz: ");
        physics = input.nextFloat();
        if(physics<0 || physics>100)
        {
            do {
                System.out.println("Girilen not 0 ile 100 arasında olmalıdır.");
                System.out.println("Notunuzu tekrar giriniz.\nFizik notunuzu giriniz: ");
                physics = input.nextFloat();
            }while(physics<0 || physics>100);
        }

        System.out.print("Türkçe notunuzu giriniz: ");
        turkish = input.nextFloat();
        if(turkish<0 || turkish>100)
        {
            do {
                System.out.println("Girilen not 0 ile 100 arasında olmalıdır.");
                System.out.println("Notunuzu tekrar giriniz.\nTürkçe notunuzu giriniz: ");
                turkish = input.nextFloat();
            }while(turkish<0 || turkish>100);
        }

        System.out.print("Kimya notunuzu giriniz: ");
        chemistry = input.nextFloat();
        if(chemistry<0 || chemistry>100)
        {
            do {
                System.out.println("Girilen not 0 ile 100 arasında olmalıdır.");
                System.out.println("Notunuzu tekrar giriniz.\nKimya notunuzu giriniz: ");
                chemistry = input.nextFloat();
            }while(chemistry<0 || chemistry>100);
        }

        System.out.print("Müzik notunuzu giriniz: ");
        music = input.nextFloat();
        if(music<0 || music>100)
        {
            do {
                System.out.println("Girilen not 0 ile 100 arasında olmalıdır.");
                System.out.println("Notunuzu tekrar giriniz.\nMüzik notunuzu giriniz: ");
                music = input.nextFloat();
            }while(music<0 || music>100);
        }
        average = (math + physics + turkish + chemistry + music) / 5;
        System.out.printf("\nNot ortalamanız: " + "%.2f",average);

            if( average >= 55 )
            {
                System.out.println("\nTebrikler sınıfı geçtiniz!");
            }
            else
            {
                System.out.println("\nSınıfta kaldınız");
            }
    }
}

