package program;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Banco {

	private String nome;
	private List<Conta> contas;
	
	public Banco(String nome) 
	{
		this.nome = nome;
		contas = new ArrayList<>();
	}
	
	void adicionaContaBanco(Conta e) 
	{
		contas.add(e);
	}
	
	void exibirContasBanco() {
	    for (Conta conta : contas) {
	        System.out.println(conta.toString());
	    }
	}

}
