package a2_variaveis.exercicios;

public class Temperatura {
  
  public static void main(String[] args) {
    
    int F = 102;
    final int CONST_F = 32;
    final double DIV_F = 5/9.0;
    double result = (F - CONST_F) * DIV_F;

    System.out.println(F + " graus fahrenheit em celsius é " + result);
  }
}
