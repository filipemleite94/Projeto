import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Agenda {
	String s;
	String[] lista;
	Scanner entrada = new Scanner(System.in);

	public String[] search(String meta) {
		int i = 0, tamanho = 0;
		String[] S = null;
		StringTokenizer stmeta, stfilenome, stfiledata, stfilemeta;
		FileReader fr;
		BufferedReader br;
		String s2;
		boolean match = false;
		try {
			File file = new File("temp42523322323.txt");
			try {
				file.createNewFile();
				s = file.getAbsoluteFile().getParentFile().getAbsolutePath();
			} catch (IOException e) {
				e.printStackTrace();
			}
			file.delete();
			File dir = new File(s);
			File[] lista = dir.listFiles(new FilenameFilter() {
				public boolean accept(File dir, String filename) {
					return filename.endsWith(".txt");
				}
			});
			tamanho = lista.length;
			ArrayList<String> pathlista = new ArrayList<String>();
			for (i = 0; i < tamanho; i++) {
				pathlista.add(lista[i].getName());
			}
			if (meta != "") {
				for (i = 0; i < pathlista.size(); i++, br.close()) {
					match = true;
					file = new File(pathlista.get(i));
					fr = new FileReader(file);
					br = new BufferedReader(fr);

					for (stmeta = new StringTokenizer(meta); stmeta.hasMoreElements() && match == true;) {
						if (match == true) {
							fr = new FileReader(file);
							br = new BufferedReader(fr);
						}
						match = false;
						s = stmeta.nextToken();
						try {
							for (stfilenome = new StringTokenizer(br.readLine()); stfilenome.hasMoreElements()
									&& match == false;) {
								s2 = stfilenome.nextToken();
								if (s.equals(s2))
									match = true;
							}
							for (stfiledata = new StringTokenizer(br.readLine()); stfiledata.hasMoreElements()
									&& match == false;) {
								s2 = stfiledata.nextToken();
								if (s.equals(s2))
									match = true;
							}
							for (stfilemeta = new StringTokenizer(br.readLine()); stfilemeta.hasMoreElements()
									&& match == false;) {
								s2 = stfilemeta.nextToken();
								if (s.equals(s2))
									match = true;
							}
						} catch (java.lang.NullPointerException e) {
							System.out.println();
						}
						;
						if (match == false) {
							pathlista.remove(i);
							i--;
						}
					}
				}
			}
			S = pathlista.toArray(new String[pathlista.size()]);
			return S;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return S;
	}

	public String save(String name, String meta, String text, String data) {
		String path = null;
		try {
			File file = new File(name + data + "temp5454asdadasdfsdfdgfgfhjhjfghjfgkghfg.txt");
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
	
	public String[] open(String name) {
		int i = 0, b;
		char[] a;
		String[] S = new String[4], n= null;
		try {
			File file = new File(name);
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			for (i=0; i < 3; i++){
				try{
					S[i]=br.readLine();
				}catch(java.lang.NullPointerException e){
					S[i]="";
				}
			}
			for (i = 0, b = br.read(); b != -1; i++, b = br.read())
				;
			br.close();
			file = new File(name);
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			a = new char[i];
			for (i = 0; i < 3; i++)
				br.readLine();
			for (i = 0, b = br.read(); b != -1; i++, b = br.read())
				a[i] = (char) b;
			String s = new String(a);
			br.close();
			S[3]= ""+s;
			return S;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return n;
	}
	
	public void remover (String name){
		File file = new File(name);
		file.delete();
	}
}