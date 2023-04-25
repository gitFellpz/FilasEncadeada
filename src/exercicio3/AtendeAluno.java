package exercicio3;

import java.util.Scanner;
import filas.FilaString;

public class AtendeAluno {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		FilaString filaAlunos = new FilaString();
		filaAlunos.init();
		int opcao;
		do {
			System.out.println(" 0 - Encerrar atendimento");
			System.out.println(" 1 - Inserir aluno na fila");
			System.out.println(" 2 - Atender aluno");
			System.out.print("Opcao: ");
			opcao = input.nextInt();
			switch (opcao) {
			case 0:
				//encerra se fila estiver vazia
				if (filaAlunos.isEmpty())
					System.out.println("Encerrado o atendimento!");
				else {
					System.out.println("Ainda ha alunos aguardando atendimento");
					opcao = -1;
				}
				break;
			case 1:
				input.nextLine();
				//insere RM do aluno que entra na fila
				System.out.print("Rm: ");
				String rm = input.nextLine();
				filaAlunos.enqueue(rm);
				break;
			case 2:
				//retira o proximo aluno a ser atendido da fila
				if (filaAlunos.isEmpty())
					System.out.println("Nao ha alunos aguardando na fila");
				else
					System.out.println("Proximo aluna a ser atendido "+ filaAlunos.dequeue());
				break;
			default:
				System.out.println("Opcao Invalida!\n");
			}
		} while (opcao != 0);

		input.close();
	}

}
