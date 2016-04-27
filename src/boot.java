import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class boot extends JFrame implements ActionListener {
	
	/*  Declare TextAreas, JList, Buttons, etc  */
	JTextArea jtSearch, jtName, jtText, jtMetaTag;
	JList jlList;
	JButton jbSearch, jbRemove, jbOpen, jbNew, jbSave, jbErase;
	JLabel jlSearch, jlName, jlTag, jlNote;
	JScrollPane jsText;
	
	
	/*static int i;
	static Scanner entrada = new Scanner(System.in);
	static String s = new String();
	static String s2 = new String();
	static String s3 = new String();
	static Agenda agenda = new Agenda();
	static String[] lista;*/
	
	
	public boot(){
		setSize(800,600);
		setTitle("Notes"); 
		setDefaultCloseOperation(EXIT_ON_CLOSE); //Ends process when closed
        //setResizable(false); //It is not allowed to resize the Layout
        
        jtSearch = new JTextArea(20,180);
        jtName = new JTextArea(20,450);
        jtText = new JTextArea(180,500);
        jtMetaTag = new JTextArea(20,180);
        
        jlList = new JList();
        jlList.setSize(new Dimension(80,180));
        
        jlSearch = new JLabel("Search",Label.LEFT);
        jlSearch.setBounds(1, 1, jlSearch.getWidth(), jlSearch.getHeight());
        jlName = new JLabel("Nome",Label.LEFT);
        jlName.setBounds(1, 100, 100,100);
        jlTag = new JLabel("Tag",Label.LEFT);
        jlNote = new JLabel("Note",Label.LEFT);
        jlSearch.setFont(new Font("SansSerif",Font.BOLD, 20));
        jlName.setFont(new Font("SansSerif",Font.BOLD, 20));
        jlTag.setFont(new Font("SansSerif",Font.BOLD, 20));
        jlNote.setFont(new Font("SansSerif",Font.BOLD, 20));
        
        jbSearch = new JButton("Search");
        jbSearch.addActionListener(this);
        jbRemove = new JButton("Remove");
        jbRemove.addActionListener(this);
        jbOpen = new JButton("Open");
        jbOpen.addActionListener(this);
        jbNew = new JButton("New");
        jbNew.addActionListener(this);
        jbSave = new JButton("Save");
        jbSave.addActionListener(this);
        jbErase = new JButton("Erase");
        jbErase.addActionListener(this);
        
        jsText = new JScrollPane(jtText);
        
        getContentPane().setLayout(new GridLayout(5,5));
        
        //getContentPane().setLayout(new FlowLayout(FlowLayout.RIGHT));
        getContentPane().add(jlSearch);
        //jlSearch.setBounds(1, 1, jlSearch.getWidth(), jlSearch.getHeight());
        
        getContentPane().add(jlName);
        //jlName.setBounds(100, 1, jlName.getWidth(), jlName.getHeight());
        
        getContentPane().add(jtName);
        jtName.setBounds(150, 1, jtName.getWidth(), jtName.getHeight());
        
        getContentPane().add(jtSearch);
        jtSearch.setBounds(1, 30, jtSearch.getWidth(), jtSearch.getHeight());
        
        getContentPane().add(jbSearch);
        jbSearch.setBounds(30, 30, jbSearch.getWidth(), jbSearch.getHeight());
        
        getContentPane().add(jlNote);
        jlNote.setBounds(100, 30, jlNote.getWidth(), jlNote.getHeight());
        
        getContentPane().add(jlList);
        jlList.setBounds(1, 60, jlList.getWidth(), jlList.getHeight());
        
        getContentPane().add(jsText);
        jsText.setBounds(100, 60, jsText.getWidth(), jsText.getHeight());
        
        getContentPane().add(jbRemove);
        jbRemove.setBounds(1, 250, jbRemove.getWidth(), jbRemove.getHeight());
        
        getContentPane().add(jbOpen);
        jbOpen.setBounds(30, 270, jbOpen.getWidth(), jbOpen.getHeight());
        
        getContentPane().add(jlTag);
        jlTag.setBounds(200, 250, jlTag.getWidth(), jlTag.getHeight());
        
        getContentPane().add(jtMetaTag);
        jtMetaTag.setBounds(230, 250, jtMetaTag.getWidth(), jtMetaTag.getHeight());
        
        getContentPane().add(jbNew);
        jbNew.setBounds(230, 270, jbNew.getWidth(), jbNew.getHeight());
        
        getContentPane().add(jbSave);
        jbSave.setBounds(230, 270, jbSave.getWidth(), jbSave.getHeight());
        
	}
	
	
	
	

	public static void main(String[] args){
		boot b = new boot();
		b.setVisible(true);
		
		/*do {
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
		} while (i != 5);*/
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

	}

}
