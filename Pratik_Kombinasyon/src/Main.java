import java.util.Scanner;
// Kombinasyon hesaplayan program
// C(n,r) = n! / (r! * (n-r)!)

public class Main {
    public static void main(String[] args) {
        int n, r, comb;
        int i, j, k;
        int nFak = 1, rFak = 1, nrFak = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı girin (n): ");
        n = input.nextInt();
        System.out.println("İkinci sayıyı girin (r): ");
        r = input.nextInt();

        if (n >= r) {
            for (i = 1; i <= n; i++) {
                nFak = nFak * i;
            }
            for (j = 1; j <= r; j++) {
                rFak = rFak * j;
            }
            int minus = n - r;
            for (k = 1; k <= minus; k++) {
                nrFak = nrFak * k;
            }
            comb = (nFak) / (rFak * nrFak);
            System.out.println("Sonuc: " + comb);
        } else
            System.out.println("Kombinasyon işleminin yapılması için n > r olmalı");
    }
}


