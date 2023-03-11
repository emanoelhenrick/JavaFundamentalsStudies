package a4_controle_de_fluxo;

import java.util.Scanner;

public class ExemploScanner {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite sua idade: ");
    int idade = scanner.nextInt();
    System.out.println("Voce tem " + idade + " anos.");
  }
}
