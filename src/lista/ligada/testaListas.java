package lista.ligada;

import lista.duplamente.ligada.ListaDuplamenteLigada;

public class testaListas {

	public static void main(String[] args) {
		
		
		System.out.println("Lista ligada");
		System.out.println("");
     	ListaLigada lista = new ListaLigada();
     	
     	System.out.println("");
		System.out.println("Adicionando no Começo");
		System.out.println("");
	
//		Adicionando no Começo
	    lista.adicionaNoComeco("Paulo");
		System.out.println(lista);
		lista.adicionaNoComeco("João");
		System.out.println(lista);
		lista.adicionaNoComeco("Marcelo");
		System.out.println(lista);
		lista.adicionaNoComeco("Pedro");
		
		System.out.println(lista);
		
//		// Adicionando no fim
		
	 	System.out.println("");
		System.out.println("Adicionando no Fim");
		System.out.println("");
		
		lista.adicionaNoFim("Paulo");
		System.out.println(lista);
				
		
		System.out.println("");
		System.out.println("Adicionando ao Meio");
		System.out.println("");
//		Adicionar no Meio
		
		lista.adicionaPosicao(2, "Gabriel");
		System.out.println(lista);
		
		Object x = lista.pega(2);
		System.out.println(x);
		
		System.out.println(lista.tamanho());
		
		System.out.println("");
		System.out.println("Lista Duplamente ligada");
		System.out.println("Adicionando no começo");
		System.out.println("");
		
		ListaDuplamenteLigada dLigada = new ListaDuplamenteLigada();
		
		dLigada.adicionaNoComeco("Felipe");
		dLigada.adicionaNoComeco("Gabriela");
		dLigada.adicionaNoComeco("Claudia");
		
		System.out.println(dLigada);
		
		System.out.println("");
		System.out.println("Adicionando no meio");
		System.out.println("");
		
		dLigada.adicionaPosicao(2, "Claudia");
		
		System.out.println(dLigada);
		
			

	}

}
