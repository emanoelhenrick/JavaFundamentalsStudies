public class PrimeiraClasse {

  public static void main(String[] args) {
    System.out.println("Ola Manel");

    Cliente cliente = new Cliente();
    cliente.cadastrarEndereco("Rua 1");
    cliente.setCodigo(7);

    String end = cliente.retornarEnderecoCliente();
    System.out.println(end);
    
    System.out.println(cliente.getValorTotal());
  }
}