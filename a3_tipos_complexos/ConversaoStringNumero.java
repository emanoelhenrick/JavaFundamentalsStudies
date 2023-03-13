package a3_tipos_complexos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
  public static void main(String[] args) {
    String valor1 = JOptionPane.showInputDialog(
      "Digite o primeiro numero");

      String valor2 = JOptionPane.showInputDialog(
      "Digite o primeiro numero");

    System.out.println(valor1 + valor2);

    double num1 = Double.parseDouble(valor1);
    double num2 = Double.parseDouble(valor2);
    double soma = num1 + num2;

    System.out.println("A media eh: " + soma/2);
  }
}
