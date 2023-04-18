import java.util.Scanner;

public class Exerc06 {
  public static void main(String[] args) {
    int i = 0;
    int a = 0, b = 1;
    int n;
    Scanner input = new Scanner(System.in);
    System.out.println("digite um  numero");
    n = input.nextInt();
    System.out.println(0);
    System.out.println(1);
    while (i <= n - 3) {

      i = a + b;
      a = b;
      b = i;
      System.out.println(i);
    }
    input.close();
  }
}
