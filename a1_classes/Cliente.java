package a1_classes;
import a1_classes.pacote1.Classe1;

/**
 * @version 1.0
 * @deprecated
 * @see Classe1
 */
public class Cliente {
  
  private int codigo;
  private String nome;
  private String endereco;

  public int getCodigo() {
    return codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public void cadastrarEndereco(String endereco) {
    setEndereco(endereco); 
  }

  public void imprimirEndereco() {
    System.out.println(endereco);
  }

  public String retornarEnderecoCliente() {
    return "endereco do manel";
  }

  public int getValorTotal() {
    return 20;
  }
}
