package lista.ligada;

public class ListaLigada {
	
	private Celula ultima = null;
	private Celula primeira = null;
	private int totalDeElementos = 0;
	
	public void adicionaNoComeco (Object elemento) {
		Celula nova = new Celula(elemento, primeira);
		this.primeira = nova;
		
		if(this.totalDeElementos ==0) {
			this.ultima = this.primeira;
		}
				
		this.totalDeElementos ++;
		
		
	}
	
	public void adicionaNoFim (Object elemento) {
		
		if (this.totalDeElementos ==0) {
			adicionaNoComeco(elemento);
		} else {
					Celula nova = new Celula(elemento, ultima);
					this.ultima.setProximo(nova);
					this.ultima = nova; 
					this.totalDeElementos++;
		}	
	}
	
	
	public boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < totalDeElementos; 
			
				
	}
	
	public Celula pegaCelula (int posicao) {
		if(!posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posicao inexistente");
		}
		
		Celula atual = primeira;
		
		
		for (int i = 0; i < posicao; i++) {
			atual = atual.getProximo();
		}
		return atual;
		
		}

	public void adicionaPosicao (int posicao, Object elemento) {
		if (posicao == 0) {
			adicionaNoComeco(elemento);
		}else if (posicao == this.totalDeElementos) {
			adicionaNoFim(elemento);
					
		}else {
		//Aqui vamos pegar a posição da celular que nos queremos - 1, que indica onde queremos coloca-la
		Celula anterior = this.pegaCelula(posicao -1);
		//Aqui a nova celula vai ter o valor proximo do getProximo da celula anterior 
		Celula nova = new Celula(elemento, anterior.getProximo());
		//E agora vamos setar o valor do setProximo da anterior na Celula nova
		anterior.setProximo(nova);
		this.totalDeElementos++;
		}
	}
	
	
	
	public Object pega (int posicao ) {
		return this.pegaCelula(posicao).getElemento();
	}

	
	public void removeDoComeco () {
		if(this.totalDeElementos==0) {
			
			throw new IllegalArgumentException("lista vazia");
		}
		
		this.primeira = this.primeira.getProximo();
		this.totalDeElementos --;
		
		if (this.totalDeElementos == 0) {
			this.ultima = null;
		}
		
	}
	
	
	public void remove (int posicao) {
		
		
		
		
	}
	
	public int tamanho () {
		return this.totalDeElementos;
	}
	
	public boolean contem (Object o) {
		return false;
	
	}
	
	@Override
	public String toString() {
		if (this.totalDeElementos == 0) {
			return "[]";
		}
		
		Celula atual = primeira;
		
		StringBuilder builder = new StringBuilder("[");
		
		for (int i = 0; i < totalDeElementos; i++) {
			builder.append(atual.getElemento());
			builder.append(",");
			
			atual = atual.getProximo();
		}
		builder.append("]");
		return builder.toString();
		
	}
}
