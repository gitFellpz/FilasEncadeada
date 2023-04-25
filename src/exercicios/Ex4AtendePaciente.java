package exercicios;

import java.util.Scanner;

import entidade.Paciente;
import filas.FilaPaciente;

public class Ex4AtendePaciente {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		FilaPaciente filaPacientes = new FilaPaciente();
		filaPacientes.init();
		int opcao;
		do {
			System.out.println(" 0 - Encerrar atendimento");
			System.out.println(" 1 - Inserir paciente na fila");
			System.out.println(" 2 - Atender paciente");
			System.out.print("Opcao: ");
			opcao = input.nextInt();
			switch (opcao) {
			case 0:
				//encerra se fila estiver vazia
				if (filaPacientes.isEmpty())
					System.out.println("Encerrado o atendimento!");
				else {
					System.out.println("Ainda ha pacientes aguardando atendimento");
					opcao = -1;
				}
				break;
			case 1:
				input.nextLine();
				//insere NOME do paciente que entra na fila
				System.out.print("Nome: ");
				String nome = input.nextLine();
				
				//insere IDADE do paciente ''
				System.out.print("Idade: ");
				int idade = input.nextInt();
				
				Paciente pac = new Paciente(nome, idade);
				filaPacientes.enqueue(pac);
				
				break;
			case 2:
				//retira o proximo aluno a ser atendido da fila
				if (filaPacientes.isEmpty())
					System.out.println("Nao ha alunos aguardando na fila");
				else
					System.out.println("Proximo aluna a ser atendido "+ filaPacientes.dequeue());
				break;
			default:
				System.out.println("Opcao Invalida!\n");
			}
		} while (opcao != 0);

		input.close();
	}

}
