import java.util.HashMap;
import java.util.Scanner;

public class Exerc09 {
  public static void main(String[] args) {
    Scanner fraseNova = new Scanner(System.in);
    String frase;

    System.out.println("Digite uma  frase");
    frase = fraseNova.nextLine();

    String[] palavras = frase.split(" ");
    HashMap<String, Integer> repetidas = new HashMap<String, Integer>();

    /*
     * for(String palavra:palavras){
     * if (repetidas.containsKey(palavra)){repetidas.put(palavra,
     * repetidas.get(palavra)+1)} else {repetidas.put(palavras,1);}
     * }
     */
    for (String n : palavras) {
      int contador = 0;
      for (int i = 0; i <= palavras.length - 1; i++) {
        if (n.equals(palavras[i])) {
          contador = contador + 1;

        }

      }
      Integer vezes = Integer.valueOf(contador);
      if (repetidas.containsKey(n)) {
        repetidas.put(n, vezes);
      } else {
        repetidas.put(n, 1);
      }

    }
    for (String d : repetidas.keySet()) {
      if (repetidas.get(d) != 1) {
        System.out.println("palavra: " + d + " vezes: " + repetidas.get(d));
      }
    }
    fraseNova.close();
  }
}
