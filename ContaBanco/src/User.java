public class User {
    
    public static void main(String[] args) throws Exception {
    ContaTerminal novaConta = new ContaTerminal();

    novaConta.ReceberNome();
    novaConta.ReceberAgencia();
    novaConta.ReceberNumeroConta();
    novaConta.ReceberSaldo();
    novaConta.ExibirInformacoes();
    }
}
