package pilha;

import java.util.LinkedList;
import java.util.List;

public class Pilhas {

		private List<String> nomes = new LinkedList<String>();
		
		public void insere (String nome) {
		nomes.add(nome);
		}
	
		public String remove() {
			return nomes.remove(nomes.size()-1);
		}

		public boolean vazio() {
			return nomes.isEmpty();
		}
		
		@Override
		public String toString() {
		// TODO Auto-generated method stub
		return nomes.toString();
		}
}
