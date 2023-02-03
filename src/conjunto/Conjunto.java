package conjunto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Conjunto {
	
	//Uma linkedilist de String dentro de uma ArrayList
	private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();
	
	//Criação de construtor para a classe de conjuntos
	public Conjunto() {
		//Criação de 26 listas para divisão de itens
		for (int i = 0; i < 26; i++) {
		//adicionando a lista a cada inserção	
			tabela.add(new LinkedList<String>());
		}
	}
	
	//adicionando a palavra na lista 
	public void adiciona (String palavra) {
		//verificando se contém a palavra
		if (!contem(palavra)) {
			//caso não tenha, calcular o índice da palavra (método escrito no final da página)
			int indice = calculaIndiceDaTabela(palavra);
			//calculado o índice, é criado uma lista de acordo com o valor de referência
			List <String> lista = tabela.get(indice);
			//adicionando uma palavra na lista
			lista.add(palavra);
		}
	}
	
	//método para saber se contem a palavra
	public boolean contem (String palavra) {
		
		int indice = calculaIndiceDaTabela(palavra);
		
		return tabela.get(indice).contains(palavra);
		
	}
	
	
	//método auxiliar para calcular o resto do código da primeira letra da palavra
	//adicionada.
	public int calculaIndiceDaTabela (String palavra) {
		//aqui é calculado o resto do valor do código ascII para usarmos como referência 
		return palavra.toLowerCase().charAt(0) % 26;
	}
	
	
	public void remove (String palavra) {
		
	//Verificar se há a palavra
		if(contem(palavra)) {
	//calcular o indice na tabela		
		int indice = calculaIndiceDaTabela (palavra);
		// Pegar o índice da lista	
		List<String> lista = tabela.get(indice);
	//remover a palavra
		lista.remove (palavra);
		}
			
	}
	
	
	@Override
	public String toString() {
		return tabela.toString();
	}
	
	
	

}
