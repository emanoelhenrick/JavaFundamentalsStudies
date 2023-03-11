package a4_controle_de_fluxo;

import java.util.Scanner;

public class Ifelse {
  
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.println("Digite sua idade: ");
    int result = s.nextInt();
    System.out.println(getIdade(result));
  }

  public static String getIdade(int idade) {
    if(idade >= 0 && idade <= 5) {
      return "voce e um bebe";
    } else if (idade >= 6 && idade <= 10) {
      return "voce e uma crianca";
    } else if (idade >= 11 && idade <= 18) {
      return "voce e adolescente";
    } else {
      return "voce e adulto";
    }
  }
}
