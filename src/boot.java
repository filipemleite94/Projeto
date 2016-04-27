import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class boot {
	static int i;
	static Scanner entrada= new Scanner(System.in);
	static String s = new String();
	static String s2 = new String();
	static String s3 = new String();
	static Agenda agenda = new Agenda();
	static String[] S;
	
	public static void main(String[] args) {
/*		do{
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
		    		s=agenda.searchcompleto();
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
		    		s=agenda.searchcompleto();
		    		agenda.editar(s);
		    		break;
		    
		    	case 4:
		    		s=agenda.searchcompleto();
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
	}*/
		s2=agenda.save("Spider", "aran nha subindo na parede", "Spiderdate with spiders girlfriend\r\nlalalalas2s2s2\r\nlalala","Spider-Aranha");
		s=agenda.open(s2);
		System.out.print(s);
		S=agenda.search("aran");
		System.out.println("Tamanho: " + S.length + " Nome: " + S[0] );
	}
}
