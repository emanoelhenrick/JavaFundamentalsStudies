public class PrimeiraClasse {

  /**
   * -- JAVADOC --
   * @author -> especifica o autor do elemento
   * @deprecated -> identifica elementos obsoletos
   * @link -> auto explicativo
   * @param exemplo ->  mostra um parâmetro que sera passado para um método
   * @return -> identifica qual o tipo de retorno de um método
   * @see -> referencia a um elemento
   * @since -> indica desde quando um elemento foi adicionado
   * @throws exemplo -> indica os tipos de exceções que podem ser lançadas por um método
   * @version -> informa a versão da classe
   * 
   */

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