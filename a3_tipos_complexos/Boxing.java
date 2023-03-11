package a3_tipos_complexos;
public class Boxing {
  
  public static void main(String[] args) {

    // --- BOXING ---
    Boolean status = true;
    Boolean status1 = Boolean.TRUE;
    Character c = 'A';
    Integer idade = 10;
    Long cpf = 1234l;

    // --- UNBOXING ---
    boolean status2 = Boolean.TRUE;
    char letra = Character.valueOf('b');
    int idade2 = Integer.valueOf(12);

  }
}
