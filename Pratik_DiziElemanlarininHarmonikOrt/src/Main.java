// Dizideki sayıların harmonik ortalamasını hesaplayan program
// Elemanların harmonik serisi = 1+ 1/2 + 1/3 +...+ 1/n
// Harmonik Ortalama formülü : N(eleman sayısı) / elemanların harmonik serisi

public class Main {
    public static void main(String[] args) {
      double[] array = {1,2,3,4,5};
      double sum = 0;

        for (double v : array) {
            sum += 1 / v;          // int / int = double olmaz o yüzden array tipi double
        }
      double harmAvg = array.length / sum;
      System.out.printf("Dizinin harmonik ortalaması: "+ "%.2f", harmAvg);
    }
}