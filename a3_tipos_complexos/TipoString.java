package a3_tipos_complexos;

public class TipoString {
  
  public static void main(String[] args) {
    System.out.println("Ola pessoal".charAt(0));

    String s = "Boa tarde";
    System.out.println(s.concat("!!!"));
    System.out.println(s.toLowerCase().startsWith("boa"));
    System.out.println(s.toUpperCase().endsWith("TARDE"));
    System.out.println(s.length());
    System.out.println(s.equals("boa tarde"));
    System.out.println(s.equalsIgnoreCase("boa tade"));

    var nome = "Pedro";
    var sobrenome = "Santos";
    var idade = 33;
    var salario = 123.543F;

    // System.out.printf("Nome: %s %s tem %d e ganha R$%.2f.", nome, sobrenome, idade, salario);

    String frase = String.format("Nome: %s %s tem %d e ganha R$%.2f.", nome, sobrenome, idade, salario);

    System.out.println(frase);
  }
}
