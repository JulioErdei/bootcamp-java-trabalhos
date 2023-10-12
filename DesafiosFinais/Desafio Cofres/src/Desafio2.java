import java.util.Scanner;

abstract class Cofre {
  protected String tipo;
  protected String metodoAbertura;

  public Cofre(String tipo, String metodoAbertura) {
    this.tipo = tipo;
    this.metodoAbertura = metodoAbertura;
  }

  public void imprimirInformacoes() {
    System.out.println("Tipo: " + this.tipo);
    System.out.println("Metodo de abertura: " + this.metodoAbertura);
  }
}

class CofreDigital extends Cofre {

  private int senha;

  public CofreDigital(int senha) {
    super("Cofre Digital", "Senha");
    this.senha = senha;
  }

  public boolean validarSenha(int confirmacaoSenha) {
    return confirmacaoSenha == this.senha;
  }
}

class CofreFisico extends Cofre {

  public CofreFisico() {
    super("Cofre Fisico", "Chave");
  }

}

public class Desafio2 {
  public static void main(String[] args) {
    // Lê o tipo de cofre (primeira linha da entrada)
    Scanner scanner = new Scanner(System.in);
    String tipoCofre = scanner.nextLine();
    
    // TODO: Implemente a condição necessário para a verificação dos cofres seguros:
    if (tipoCofre.equalsIgnoreCase("digital")) {
      int senha = scanner.nextInt();
      CofreDigital cofre = new CofreDigital(senha);
      senha = scanner.nextInt();
      cofre.imprimirInformacoes();
      if(cofre.validarSenha(senha) == false){
        System.out.println("Senha incorreta!"); 
      } else { System.out.println("Cofre aberto!");  }
    } else {
      CofreFisico cofre = new CofreFisico();
      cofre.imprimirInformacoes();
    }
  }
}