import java.util.ArrayList;
import java.util.Scanner;

public class Exerc10 {
  public static void main(String[] args) {
    ArrayList<Integer> sequencia = new ArrayList<Integer>();
    ArrayList<Integer> subSeq = new ArrayList<Integer>();
    Scanner inserirNumero = new Scanner(System.in);
    System.out.println("Quantos numeros voce quer comparar?");
    int numeroElementos = inserirNumero.nextInt();

    for (int i = 0; i < numeroElementos; i++) {
      System.out.println("Digite um número para adicionar");
      Integer novoNumero = inserirNumero.nextInt();
      sequencia.add(novoNumero);
    }
    for (int j = 0; j < sequencia.size(); j++) {
      if (sequencia.get(j) < sequencia.get(j + 1)) {
        subSeq.add(sequencia.get(j));
      } else {
        subSeq.add(sequencia.get(j));
        break;
      }
    }
    System.out.println(subSeq);
    inserirNumero.close();
  }
}
