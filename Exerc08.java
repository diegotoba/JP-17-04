import java.util.ArrayList;
import java.util.Scanner;

public class Exerc08 {
  public static void main(String[] args) {
    int n, somaDivisores = 0;
    Scanner input = new Scanner(System.in);
    ArrayList<Integer> divisores = new ArrayList<Integer>();
    System.out.println("Digite um numero para analisar");
    n = input.nextInt();

    for (int i = 1; i <= n / 2; i++) {
      if (n % i == 0) {
        divisores.add(i);

      }
    }
    for (int j : divisores) {
      somaDivisores += j;
    }
    if (somaDivisores == n) {
      System.out.println("o numero " + n + " é um numero perfeito");
    } else {
      System.out.println("o numero " + n + " não é perfeito");
    }
    input.close();
  }
}
