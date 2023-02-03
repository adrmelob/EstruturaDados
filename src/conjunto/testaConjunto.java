package conjunto;

public class testaConjunto {

	public static void main(String[] args) {

		Conjunto conjunto = new Conjunto();
		
		conjunto.adiciona("Miguel");
		conjunto.adiciona("Andre");
		conjunto.adiciona("Marcelo");
		System.out.println(conjunto);
		
		
		conjunto.remove("Marcelo");
		
		System.out.println(conjunto);
		
	}
	
		

}
