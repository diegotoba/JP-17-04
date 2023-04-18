import java.util.Scanner;

public class Exerc02 {
  public static void main(String[] args) {
    Scanner numero = new Scanner(System.in);
    int variavel;

    System.out.println("Digite um numero");
    variavel = numero.nextInt();
    if (variavel % 2 == 0) {
      variavel += 5;
    } else {
      variavel += 8;
    }
    ;
    System.out.println("o resultado da operação é: " + variavel);
  }
}
