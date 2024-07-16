package program;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Cliente {
	
    private String nome;
    private List<Conta> contas;
    
    public Cliente(String nome) 
    {
    	this.nome = nome;
    	contas = new ArrayList<>();
    }
    
    void adicionarContaCliente(Conta conta) 
    {
    	contas.add(conta);
    }
    
    void exibirContasCliente() 
    {
    	for(Conta e : contas)
    	{
    		e.imprimirInfosComuns();
    	}
    }
}
