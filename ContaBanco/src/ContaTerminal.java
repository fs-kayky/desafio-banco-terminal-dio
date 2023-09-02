import java.util.Scanner;

public class ContaTerminal {

    Scanner sc = new Scanner(System.in);

    int numero;
    int agencia;
    String nome;
    float saldo;

    public void ReceberNome() {
        System.out.println("Por Favor, Insira seu nome! -> ");
        nome = sc.nextLine();
    }
    
    public void ReceberAgencia() {
        System.out.println("Por Favor, Digite o numero da Agencia! -> ");
        agencia = sc.nextInt();
    }

    public void ReceberNumeroConta() {
        System.out.println("Por Favor, Insira o numero da sua conta! -> ");
        numero = sc.nextInt();
    }

    public void ReceberSaldo() {
        System.out.println("Por Favor, Insira seu saldo! ->");
        saldo = sc.nextFloat();
    }

    public void ExibirInformacoes(){
        System.out.printf("Ola %s, obrigado por criar uma conta em nosso banco, sua agencia: %d, conta: %d, e seu saldo R$:%.2f ja está disponivel para saque.", nome, agencia, numero, saldo);
    }
}
