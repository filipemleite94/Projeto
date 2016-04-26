import java.util.Scanner;

public class Agenda {
	String s;
	String[] lista;
	Scanner entrada = new Scanner(System.in);
	
	public String searchcompleto(){
		System.out.print("Digite o que esta buscando: ");
		s=entrada.nextLine();
		lista=agenda.search(s);
		s=agenda.select(lista);
		return s;
	}
	
	public String[] search(String s){	
		
	}
	
	public String select(String[] lista){	
		
	}
}