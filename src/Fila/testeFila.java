package Fila;

import java.util.LinkedList;
import java.util.Queue;

public class testeFila {

	public static void main(String[] args) {

		Fila fila = new Fila();
		
		fila.adiciona("Marcelo");
		fila.adiciona("Beatriz");
		
		System.out.println();
		
		String x1 = fila.remove();
		System.out.println(x1);
		
		System.out.println(fila);
		
		Queue<String> filaDoJava = new LinkedList<>();
		
		filaDoJava.add("Matheus");
		String x2 = filaDoJava.poll();
		
		System.out.println(x2);
		System.out.println(filaDoJava);
		
	}

}
