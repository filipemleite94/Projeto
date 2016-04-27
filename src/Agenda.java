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
			File file = new File(name + data + "temp5454.txt");
			File file2 = new File(name + ".txt");
			path= file2.getName();
			if (file2.exists()) {
				file.createNewFile();
				FileWriter fw = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(name + "\r\n" + data + "\r\n" + name + " " + data + " " + meta + "\r\n"+text);
				bw.flush();
				bw.close();
				file2.delete();
				file2=new File(name + ".txt");
				file.renameTo(file2);
			}
			else{
				file2.createNewFile();
				FileWriter fw = new FileWriter(file2);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(name + "\r\n" + data + "\r\n" + " " + meta + "\r\n"+text);
				bw.flush();
				bw.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	return path;
	}
	
	public String open(String name){
		int i=0, b;
		char[] a;
		String n=null;
		try {
		File file = new File(name);
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		for(;i<3;i++)
			br.readLine();
		for(i=0, b=br.read();b!=-1;i++, b=br.read());
		br.close();
		file=new File(name);
		fr=new FileReader(file);
		br=new BufferedReader(fr);
		a=new char[i];
		for(i=0;i<3;i++)
			br.readLine();
		for(i=0, b=br.read();b!=-1;i++, b=br.read())
			a[i]=(char) b;
		String s = new String(a);
		br.close();
		return s;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return n;
	}
}