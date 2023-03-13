package a2_variaveis;

public class TiposPrimitivos {
  
  public static void main(String[] args) {

    // TIPOS NUMÉRICOS INTEIROS
    byte anosDeEmpresa = 23;
    short numeroDeVoos = 542;
    int id = 56789;
    long pontosAcumulados = 3_234_738_378L;

    // TIPOS NUMÉRICOS REAIS
    float salario = 2.45F;
    double vendasAcumuladas = 2.4738;

    // TIPO BOOLEANO
    boolean estaDeFerias = false;

    // TIPO CARACTERE
    char status = 'a';

    // DIAS DE EMPRESA
    System.out.println(anosDeEmpresa * 365);

    // NUMERO DE VIAGENS
    System.out.println(numeroDeVoos / 2);

    // PONTOS POR REAL
    System.out.println(pontosAcumulados / vendasAcumuladas);

    System.out.println(id + ": ganha -> " + salario);
    System.out.println("Ferias? " + estaDeFerias);
    System.out.println("Status: " + status);
  }
}
