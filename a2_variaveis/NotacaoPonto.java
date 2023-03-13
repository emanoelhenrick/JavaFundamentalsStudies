package a2_variaveis;

public class NotacaoPonto {
  
  public static void main(String[] args) {

    String s = "Bom dia X";

    s = s.replace("X", "Senhora");
    s = s.toUpperCase();
    s = s.concat("!!!");

    String y = "Bom dia X"
            .replace("X", "Manel")
            .toUpperCase()
            .concat("!!!");

    System.out.println(y);
  }
}
