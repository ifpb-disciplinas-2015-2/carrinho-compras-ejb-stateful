package io.github.jass2125.sessionbeans;

import java.util.HashSet;
import java.util.Set;

import javax.ejb.Stateful;

@Stateful
public class CarrinhoBean {
	private Set<String> listaDeProdutos = new HashSet<String>();
	
	public void add(String produto){
		listaDeProdutos.add(produto);
	}
	
	public void remove(String produto){
		listaDeProdutos.remove(produto);
	}
	
	public Set<String> getProdutos(){
		return listaDeProdutos;
	}
	
	

}
