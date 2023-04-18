import java.util.Scanner;

public class Exerc03 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numero;

    System.out.println("Digite um numero");
    numero = input.nextInt();
    for (int i = 0; i <= numero; i++) {
      System.out.println(i);
    }
    input.close();
  }
}
