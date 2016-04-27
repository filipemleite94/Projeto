<<<<<<< HEAD
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
=======
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
>>>>>>> 858628135b7e2f66774318459cd5f38a1a95adce

public class boot extends JFrame implements ActionListener {
	
	/*  Declare TextAreas, JList, Buttons, etc  */
	JTextArea jtSearch, jtName, jtText, jtMetaTag;
	JList jlList;
	JButton jbSearch, jbRemove, jbOpen, jbNew, jbSave;
	JLabel jlSearch, jlName, jlTag, jlNote;
	JScrollPane jsText;
	
	
	/*static int i;
	static Scanner entrada = new Scanner(System.in);
	static String s = new String();
	static String s2 = new String();
	static String s3 = new String();
	static Agenda agenda = new Agenda();
<<<<<<< HEAD
	static String[] S;
=======
	static String[] lista;*/
	
	
	public boot(){
		setSize(1250,750);
		setTitle("Notes"); 
		setDefaultCloseOperation(EXIT_ON_CLOSE); //Ends process when closed
        setResizable(false); //It is not allowed to resize the Layout
        
        jtSearch = new JTextArea(20,180);
        jtSearch.setBounds(20, 40, 320, 25);
        jtSearch.setFont(new Font("SansSerif",Font.BOLD, 20));
        jtName = new JTextArea(20,350);
        jtName.setBounds(600, 10, 350, 25);
        jtName.setFont(new Font("SansSerif",Font.BOLD, 20));
        jtText = new JTextArea(50,20);
        jtText.setFont(new Font("SansSerif",Font.BOLD, 20));
        jtMetaTag = new JTextArea(20,180);
        jtMetaTag.setBounds(850, 600, 350, 25);
        
        jlList = new JList();
        jlList.setSize(new Dimension(80,180));
        jlList.setBounds(20, 80, 420, 495);
        jlList.setAutoscrolls(true);
        
        jlSearch = new JLabel("Search");
        jlSearch.setAlignmentX(LEFT_ALIGNMENT);
        jlSearch.setBounds(20, 10, 80, 25);
        jlName = new JLabel("Name",Label.LEFT);
        jlName.setBounds(510, 10, 70, 25);
        jlTag = new JLabel("Tag",Label.LEFT);
        jlTag.setBounds(750, 600, 80, 25);
        jlNote = new JLabel("Note",Label.LEFT);
        jlNote.setBounds(505, 40, 70, 25);
        jlSearch.setFont(new Font("SansSerif",Font.BOLD, 20));
        jlName.setFont(new Font("SansSerif",Font.BOLD, 20));
        jlTag.setFont(new Font("SansSerif",Font.BOLD, 20));
        jlNote.setFont(new Font("SansSerif",Font.BOLD, 20));
        
        jbSearch = new JButton("Search");
        jbSearch.setBounds(350, 40, 90, 25);
        jbSearch.addActionListener(this);
        jbRemove = new JButton("Remove");
        jbRemove.setBounds(20, 600, 90, 25);
        jbRemove.addActionListener(this);
        jbOpen = new JButton("Open");
        jbOpen.setBounds(350, 600, 90, 25);
        jbOpen.addActionListener(this);
        jbNew = new JButton("New");
        jbNew.setBounds(1000, 650, 80, 25);
        jbNew.addActionListener(this);
        jbSave = new JButton("Save");
        jbSave.setBounds(1100, 650, 80, 25);
        jbSave.addActionListener(this);

        
        jsText = new JScrollPane(jtText);
        jsText.setBounds(515, 75, 700, 500);
        
        getContentPane().setLayout(null);
        
        getContentPane().add(jlSearch);
        getContentPane().add(jlName);
        getContentPane().add(jtName);
        getContentPane().add(jtSearch);
        getContentPane().add(jbSearch);
        getContentPane().add(jlNote);
        getContentPane().add(jlList);
        getContentPane().add(jsText);
        getContentPane().add(jbRemove);
        getContentPane().add(jbOpen);
        getContentPane().add(jlTag);
        getContentPane().add(jtMetaTag);
        getContentPane().add(jbNew);
        getContentPane().add(jbSave);
	}
	
	
>>>>>>> 858628135b7e2f66774318459cd5f38a1a95adce
	
	

	public static void main(String[] args){
		boot b = new boot();
		b.setVisible(true);
		
		/*do {
=======
	public static void main(String[] args) {
/*		do{
>>>>>>> 352e3648e9698ce022ce064ad851ba037bcf72c8
			System.out.println("Seja bem vindo a sua agenda, o que deseja fazer?");
			System.out.println("(1) Ver anotacao antiga");
			System.out.println("(2) Fazer uma nova anotacao");
			System.out.println("(3) Editar anotacao antiga");
			System.out.println("(4) Excluir anotacao antiga");
			System.out.println("(5) Encerrar");
			System.out.print("Digite o numero equivalente a opcao que voce quer: ");
			i = entrada.nextInt();

			switch (i) {
			case 1:
				s = agenda.searchcompleto();
				agenda.ler(s);
				break;

			case 2:
				System.out.print("Digite o nome da sua anotacao: ");
				s = entrada.nextLine();
				System.out.print("Digite tags de busca da sua anotacao: ");
				s2 = entrada.nextLine();
				System.out.println("Digite a sua anotacao: ");
				s3 = entrada.nextLine();
				agenda.criar(s, s2, s3);
				break;

			case 3:
				s = agenda.searchcompleto();
				agenda.editar(s);
				break;

			case 4:
				s = agenda.searchcompleto();
				agenda.remover(s);
				break;

			case 5:
				System.out.print("Agenda encerrada!");
				agenda.close();
				break;

			default:
				System.out.println("Digite um numero valido!");
			}
<<<<<<< HEAD
		}while (i!=5);
	}*/
		s2=agenda.save("Spider", "aran nha subindo na parede", "Spiderdate with spiders girlfriend\r\nlalalalas2s2s2\r\nlalala","Spider-Aranha");
		s=agenda.open(s2);
		System.out.print(s);
		S=agenda.search("aran");
		System.out.println("Tamanho: " + S.length + " Nome: " + S[0] );
	}
=======
<<<<<<< HEAD
		} while (i != 5);*/
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

	}

>>>>>>> 858628135b7e2f66774318459cd5f38a1a95adce
}
