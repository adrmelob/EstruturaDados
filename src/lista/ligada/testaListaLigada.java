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
		lista.adicionaNoFim("João");
		System.out.println(lista);
		lista.adicionaNoFim("Marcelo");
		System.out.println(lista);
		lista.adicionaNoFim("Pedro");
		System.out.println(lista);

	}

}
