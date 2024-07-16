package program;

public class Main {

    public static void main(String[] args) {
        Cliente cl1 = new Cliente("Igor");
        Banco b1 = new Banco("Santander");
        Conta c1 = new ContaCorrente(cl1, b1);
        
        cl1.adicionarContaCliente(c1);
        cl1.exibirContasCliente();
    }
}
