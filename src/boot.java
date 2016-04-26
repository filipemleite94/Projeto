import java.util.Scanner;

public class boot {
	static int i;
	static Scanner entrada= new Scanner(System.in);
	static String s = new String();
	static String s2 = new String();
	static String s3 = new String();
	static Agenda agenda = new Agenda();
	static String[] lista;
	
	public static void main(String[] args) {
		do{
			System.out.println("Seja bem vindo a sua agenda, o que deseja fazer?");
			System.out.println("(1) Ver anotacao antiga");
			System.out.println("(2) Fazer uma nova anotacao");
			System.out.println("(3) Editar anotacao antiga");
			System.out.println("(4) Excluir anotacao antiga");
			System.out.println("(5) Encerrar");
			System.out.print("Digite o numero equivalente a opcao que voce quer: ");
			i = entrada.nextInt();
			
			switch(i)
			{
		    	case 1:
		    		System.out.print("Digite o que esta buscando: ");
		    		s=entrada.nextLine();
		    		lista=agenda.search(s);
		    		s=agenda.select(lista);
		            agenda.ler(s);
		    		break;
		    
		    	case 2:
		            System.out.print("Digite o nome da sua anotacao: ");
		            s=entrada.nextLine();
		            System.out.print("Digite tags de busca da sua anotacao: ");
		            s2=entrada.nextLine();
		            System.out.println("Digite a sua anotacao: ");
		            s3=entrada.nextLine();
		            agenda.criar(s,s2,s3);
		            break;
		    
		    	case 3:
		    		System.out.print("Digite o que esta buscando: ");
		    		s=entrada.nextLine();
		    		lista = agenda.search(s);
		    		s=agenda.select(lista);
		    		agenda.editar(s);
		    		break;
		    
		    	case 4:
		    		System.out.print("Digite o que esta buscando: ");
		    		s=entrada.nextLine();
		    		lista = agenda.search(s);
		    		s=agenda.select(lista);
		    		agenda.remover(s);
		    		break;
		    	
		    	case 5:
		    		System.out.print("Agenda encerrada!");
		    		agenda.close();
		    		break;
		    	
		    	default:
		            System.out.println("Digite um numero valido!");
			}
		}while (i!=5);
	}

}
