package lista.ligada;

public class testaListaLigada {

	public static void main(String[] args) {
		
     	ListaLigada lista = new ListaLigada();
	
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
		
		
		lista.adicionaNoFim("Paulo");
		System.out.println(lista);
				
		
//		Adicionar no Meio
		
		lista.adicionaPosicao(2, "Gabriel");
		System.out.println(lista);
		
		Object x = lista.pega(2);
		System.out.println(x);
		
		System.out.println(lista.tamanho());
		
			

	}

}
