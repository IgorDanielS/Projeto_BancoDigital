package program;	

public class ContaPoupanca extends Conta
{	
	public ContaPoupanca(Cliente cliente, Banco banco) 
	{
		super(cliente, banco);
	}
	@Override
	public void imprimirExtrato() 
	{
		System.out.print("Extrato da conta poupança: ");
		super.imprimirInfosComuns();
		
	}
}
