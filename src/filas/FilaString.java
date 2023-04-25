package filas;

public class FilaString {
	
	private class NO{
		//Alteração
		String dado;
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
						//ALteração
	public void enqueue(String elem) {
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
		//ALteração
	public String dequeue() {
		//ALteração
		String valor = ini.dado;
		ini = ini.prox;
		
		if(ini == null)
			fim = null;
		
		return valor;
	}
	
	//ALteração
	public String first() {
		return ini.dado;
	}
}
