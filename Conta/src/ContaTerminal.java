import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner read = new Scanner(System.in);

        System.out.println("Olá, bem-vindo ao banco Alpha!\nPara começar precisamos que insira seus dados:");
        System.out.println("\n Por favor digite a agencia: ");
        agencia = read.next();
        agencia = agencia.substring(0,3) + "-" + agencia.substring(3,4);
        System.out.println("\n Por favor digite o numero da conta: ");
        numero = read.nextInt();
        System.out.println("\n Por favor digite o seu nome: ");
        nomeCliente = read.next();
        System.out.println("\n Por favor digite o valor de saldo: ");
        saldo = read.nextDouble();
    
        System.out.println("Olá "+ nomeCliente + " , obrigado por criar uma conta em nosso banco, s'ua agência é " + agencia + ", o número da sua conta é " + numero);
        System.out.printf("E seu saldo de %.2f já está disponível para saque", saldo);
    }
}
