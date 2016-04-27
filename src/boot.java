import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.*;


public class boot extends JFrame implements ActionListener {

<<<<<<< HEAD
	/* Declare TextAreas, JList, Buttons, etc */
=======
>>>>>>> 78211b37a381eeb8ac3aa19cf8d55ded5ca55702
	JTextArea jtSearch, jtName, jtText, jtMetaTag;
	JList jlList;
	JButton jbSearch, jbRemove, jbOpen, jbNew, jbSave;
	JLabel jlSearch, jlName, jlTag, jlNote;
	JScrollPane jsText;
<<<<<<< HEAD
	String[] Saux;
	Agenda Ag = new Agenda();

	DefaultListModel files = new DefaultListModel();

=======
	Agenda Ag;
	
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
		
>>>>>>> 78211b37a381eeb8ac3aa19cf8d55ded5ca55702
	public boot() {
		setSize(1250, 750);
		setTitle("Notes");
		setDefaultCloseOperation(EXIT_ON_CLOSE); // Ends process when closed
		setResizable(false); // It is not allowed to resize the Layout
		

		jtSearch = new JTextArea(20, 180);
		jtName = new JTextArea(20, 350);
		jtText = new JTextArea(50, 20);
		jtMetaTag = new JTextArea(20, 180);
		jtName.setBounds(600, 10, 350, 25);
		jtSearch.setBounds(20, 40, 320, 25);
		jtMetaTag.setBounds(850, 600, 350, 25);
		jtSearch.setFont(new Font("SansSerif", Font.BOLD, 20));
		jtName.setFont(new Font("SansSerif", Font.BOLD, 20));
		jtText.setFont(new Font("SansSerif", Font.BOLD, 20));
		jtMetaTag.setFont(new Font("SansSerif", Font.BOLD, 20));

		jlList = new JList(files);
		jlList.setSize(new Dimension(80, 180));
		jlList.setBounds(20, 80, 420, 495);
		jlList.setAutoscrolls(true);

		jlSearch = new JLabel("Search", Label.LEFT);
		jlName = new JLabel("Name", Label.LEFT);
		jlTag = new JLabel("Tag", Label.LEFT);
		jlNote = new JLabel("Note", Label.LEFT);
		jlSearch.setBounds(20, 10, 80, 25);
		jlName.setBounds(510, 10, 70, 25);
		jlTag.setBounds(750, 600, 80, 25);
		jlNote.setBounds(505, 40, 70, 25);
		jlSearch.setFont(new Font("SansSerif", Font.BOLD, 20));
		jlName.setFont(new Font("SansSerif", Font.BOLD, 20));
		jlTag.setFont(new Font("SansSerif", Font.BOLD, 20));
		jlNote.setFont(new Font("SansSerif", Font.BOLD, 20));

		jbSearch = new JButton("Search");
		jbRemove = new JButton("Remove");
		jbOpen = new JButton("Open");
		jbNew = new JButton("New");
		jbSave = new JButton("Save");
		jbSearch.setBounds(350, 40, 90, 25);
		jbRemove.setBounds(20, 600, 90, 25);
		jbOpen.setBounds(350, 600, 90, 25);
		jbNew.setBounds(1000, 650, 80, 25);
		jbSave.setBounds(1100, 650, 80, 25);
		jbSearch.addActionListener(this);
		jbRemove.addActionListener(this);
		jbOpen.addActionListener(this);
		jbNew.addActionListener(this);
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

	public static void main(String[] args) {
<<<<<<< HEAD
=======
		/*		Agenda agenda = new Agenda();;
		String[] S;
		S=agenda.search("");
		System.out.println(S[0]);
		System.out.println(S[1]);
		System.out.println(S[2]);*/ 
>>>>>>> 78211b37a381eeb8ac3aa19cf8d55ded5ca55702
		boot b = new boot();
		b.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == jbSearch) {
<<<<<<< HEAD
			Saux = Ag.search(jtSearch.getText());
			files.clear();
			for(int i = 0; i < Saux.length; i++){
	            files.addElement(Saux[i]);
	        }			
=======

>>>>>>> 78211b37a381eeb8ac3aa19cf8d55ded5ca55702
		}
		if (source == jbRemove) {
			
			
		}
		if (source == jbOpen) {
			Saux = Ag.open(jlList.getSelectedValue().toString());
			jtName.setText(Saux[0]);
			jtMetaTag.setText(Saux[2]);
			jtText.setText(Saux[3]);
		}
		if (source == jbNew) {
			jtName.setText("");
			jtText.setText("");
			jtMetaTag.setText("");
		}
		if (source == jbSave) {
			Ag.save(jtName.getText(), jtMetaTag.getText(), jtText.getText(), new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()));
		}				
	}
}
