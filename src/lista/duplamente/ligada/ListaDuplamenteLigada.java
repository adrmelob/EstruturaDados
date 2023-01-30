package lista.duplamente.ligada;

import lista.ligada.Celula;

public class ListaDuplamenteLigada {

	private Celula ultima;
	private Celula primeira;
	private int totalDeElementos;
	
	public void adicionaNoComeco (Object elemento) {
		if (this.totalDeElementos == 0) {
			Celula nova = new Celula(elemento);
			this.primeira = nova;
			this.ultima = nova;
		} else {
			Celula nova = new Celula (this.primeira, elemento);
			this.primeira.setAnterior(nova);
			this.primeira = nova;
			
		}
				
		this.totalDeElementos ++;
		
		
	}
	
	public void adicionaNoFim (Object elemento) {
		
		if (this.totalDeElementos ==0) {
			adicionaNoComeco(elemento);
		} else {

			//criamos uma nova celula
			Celula nova = new Celula(elemento);
			//Apontamos a seta do proximo da ultima celula para a nova
			this.ultima.setProximo(nova);
			//apontamos a seta do anterior para a ultima celula
			nova.setAnterior(this.ultima);
			//apontamos a seta da ultima celula para a nova
			this.ultima = nova;
			
			this.totalDeElementos ++;
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
		if (this.totalDeElementos == 0) {
			adicionaNoComeco(elemento);
		}else if (posicao == this.totalDeElementos) {
			this.adicionaNoFim(elemento);
		} else {
			
			//Essa celula faz referencia a anterior subtraindo - 1 da posição
			Celula anterior = pegaCelula (posicao -1);
			
			//aqui pegamos a proxima da anterior
			Celula proxima = anterior.getProximo();
			
			//Criamos uma nova célula passando com parâmetro o proximo e o elemento
			//Aqui o próximo é o proximo do anterior
			Celula nova = new Celula (anterior.getProximo(), elemento);
			//setamos o anterior da nova celula como a celula anterior
			nova.setAnterior(anterior);
			//setamos o proximo da celula anterior com a celula nova
			anterior.setProximo(nova);
			//setamos o anterior da proxima celula com a nova
			proxima.setAnterior(nova);
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
