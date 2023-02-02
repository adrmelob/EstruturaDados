package pilha;

public class testaPilha {

	public static void main(String[] args) {

		Pilhas pilha = new Pilhas();
		
		System.out.println("Inserção na Pilha");
		System.out.println("");
		
		pilha.insere("Matheus");
		
		System.out.println(pilha);
		
		pilha.insere("Eduardo");
		
		System.out.println(pilha);
		
		System.out.println("Remoção na Pilha");
		System.out.println("");
		
		String r1 = pilha.remove();
		System.out.println(pilha);
		
		
		System.out.println("Verificando se a pilha ta vazia");
		System.out.println(pilha.vazio());
		
		
	}

}
