package program;

public class ContaCorrente extends Conta {
		
	public ContaCorrente(Cliente cliente, Banco banco) {
		super(cliente, banco);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("Extrato da conta Corrente: ");
		super.imprimirInfosComuns();
	}
}
