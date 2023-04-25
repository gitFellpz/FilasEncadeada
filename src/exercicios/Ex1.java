package exercicios;
import java.util.Scanner;

import filas.FilaInt;

public class Ex1 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		FilaInt fila = new FilaInt();
		
		fila.init();
		
		System.out.print("Informe o valor: ");
		int valor = input.nextInt();
		
		while(valor >= 0) {
			fila.enqueue(valor);
			System.out.print("Informe valor positivo(negativo para encerrar): ");
			
			valor = input.nextInt();
		}
		
		while(!fila.isEmpty()) {
			System.out.println("Valor retirado: " + fila.dequeue());
		}
		
		input.close();
	}
}
