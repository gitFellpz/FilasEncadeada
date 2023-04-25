package filas;

import entidade.Paciente;

public class FilaPaciente {
	
	private class NO{
		Paciente dado;
		NO prox;
	}
	
	private NO ini, fim;
	
	public void init() {
		ini = fim = null;
	}
	
	public boolean isEmpty() {
		if(ini == fim && fim==null) 
			return true;
		else
			return false;
	}
	
	public void enqueue(Paciente elem) {
		//Alocando NO na variável novo
		NO novo = new  NO();
		novo.dado = elem;
		novo.prox = null;
		
		if(isEmpty())
			ini = novo;
		else
			fim.prox = novo;
		
		fim = novo;
	}
	
	public Paciente dequeue() {
		Paciente valor = ini.dado;
		ini = ini.prox;
		
		if(ini == null)
			fim = null;
		
		return valor;
	}
	
	public Paciente first() {
		return ini.dado;
	}
}
