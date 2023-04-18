import java.util.Scanner;

public class Exerc01 {
  public static void main(String[] args) {
    Scanner nota = new Scanner(System.in);
    double nota1, nota2, nota3;
    double media;

    System.out.println("Digite a primeira nota");
    nota1 = nota.nextDouble();
    System.out.println("Digite a segunda nota");
    nota2 = nota.nextDouble();
    System.out.println("Digite a terceira nota");
    nota3 = nota.nextDouble();

    media = (nota1 + nota2 + nota3) / 3;
    if (media >= 7) {
      System.out.println("Aluno aprovado");
    } else {
      System.out.println("Aluno reprovado");
    }
  }

}