import java.util.Scanner;

public class Exerc04 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numero;

    System.out.println("Digite um numero");
    numero = input.nextInt();
    for (int i = 0; i <= numero; i += 2) {
      System.out.println(i);
    }
  }
}
