import java.util.Scanner;

// Bu program doğum yılınıza göre Çin burcunuzu hesaplar. Çin burcunda 12 burç 10 derece genişliğinde eşit aralıklarla sıralanır.
// Bu yüzden kişinin doğum yılının 12 ile bölümünde kalanı bulunur.

public class Main {
    public static void main(String[] args) {
        int birthYear, remain;

        Scanner year = new Scanner(System.in);
        System.out.print("Lütfen doğum yılınızı girin: ");
        birthYear = year.nextInt();

        remain = birthYear % 12;

        switch (remain) {
            case 0:
                System.out.println("Çin burcunuz: Maymun");
                break;
            case 1:
                System.out.println("Çin burcunuz: Horoz");
                break;
            case 2:
                System.out.println("Çin burcunuz: Köpek");
                break;
            case 3:
                System.out.println("Çin burcunuz: Domuz");
                break;
            case 4:
                System.out.println("Çin burcunuz: Fare");
                break;
            case 5:
                System.out.println("Çin burcunuz: Öküz");
                break;
            case 6:
                System.out.println("Çin burcunuz: Kaplan");
                break;
            case 7:
                System.out.println("Çin burcunuz: Tavşan");
                break;
            case 8:
                System.out.println("Çin burcunuz: Ejderha");
                break;
            case 9:
                System.out.println("Çin burcunuz: Yılan");
                break;
            case 10:
                System.out.println("Çin burcunuz: At");
                break;
            case 11:
                System.out.println("Çin burcunuz: Koyun");
                break;
        }
    }
}
