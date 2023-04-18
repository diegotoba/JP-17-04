import java.util.Scanner;

public class Exerc05 {
  public static void main(String[] args) {
    Scanner nome = new Scanner(System.in);
    Scanner idade = new Scanner(System.in);
    String novoNome, nomeMaisNovo = "Joe";
    int novaIdade, idadeMaisNovo = 99;

    for (int i = 0; i <= 9; i++) {
      System.out.println("Digite o nome");
      novoNome = nome.nextLine();
      System.out.println("Digite a idade de " + novoNome);
      novaIdade = idade.nextInt();
      if (novaIdade < idadeMaisNovo) {
        idadeMaisNovo = novaIdade;
        nomeMaisNovo = novoNome;
      }

    }

    System.out.println("A pessoa  mais nova se chama " + nomeMaisNovo);
    nome.close();idade.close();
  }
}
