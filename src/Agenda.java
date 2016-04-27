import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

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
	
	public String save(String name, String meta, String text, String data) {
		String path = null;
		try {
			String verify, putData;
			File file = new File(name + data + "temp5454.txt");
			File file2 = new File(name + ".txt");
			if (file2.exists()) {
				file.createNewFile();
				FileWriter fw = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(name + "\n" + data + "\n" + name + " " + data + " " + meta + "\n"+text);
				bw.flush();
				bw.close();
				file2.delete();
				file.renameTo(file2);
				path= file.getName();
			}
			else{
				file2.createNewFile();
				FileWriter fw = new FileWriter(file2);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(name + "\n" + data + "\n" + name + " " + data + " " + meta + "\n"+text);
				bw.flush();
				bw.close();
				path= file.getName();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	return path;
	}
}