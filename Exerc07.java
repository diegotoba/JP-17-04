import java.io.InputStream;
import java.util.Scanner;

public class Exerc07 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n;

    System.out.println("digite um numero");
    n = input.nextInt();
    System.out.println("Os numeros  primos menores que " + n + " são:");
    for (int i = 1; i <= n; i++) {
      Boolean primo = true;
      for (int j = 2; j <= i / 2; j++) {
        if (i % j == 0) {
          primo = false;
          break;

        }
      }
      if (primo) {
        System.out.println(i);
      }
    }
  }
}
