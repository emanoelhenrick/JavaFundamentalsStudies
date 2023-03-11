package a0_compile_and_run;
public class HelloWorld {
  
  public static void main(String[] args) {
    String ambiente = args[0];
    if (ambiente.equals("DEV")) {
      System.out.println("Executando em DEV");
    } else if (ambiente.equals("TEST")) {
      System.out.println("Executando de TEST");
    } else {
      System.out.println(ambiente);
    }
  }
}