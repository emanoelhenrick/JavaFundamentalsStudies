package a3_tipos_complexos;

import java.util.Scanner;

public class DesafioConversao {
  
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o primeiro salario: ");
    double salario1 = Double.parseDouble(scanner.nextLine().replace(",", "."));

    System.out.print("Digite o segundo salario: ");
    double salario2 = Double.parseDouble(scanner.nextLine().replace(",", "."));

    System.out.print("Digite o terceiro salario: ");
    double salario3 = Double.parseDouble(scanner.nextLine().replace(",", "."));

    Double media = (salario1 + salario2 + salario3)/3;
    System.out.printf("A media salarial eh %s", media.toString());

    scanner.close();
  }
}
