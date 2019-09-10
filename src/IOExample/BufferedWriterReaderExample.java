package IOExample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterReaderExample {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		File f=new File("C:\\sashukla\\fw.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Hi I am a new buffered witer");
		bw.newLine();
		bw.write("~saumya");
		bw.flush();
		bw.close();
		
		
		//Read File
		int ch;
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		
		/*System.out.println("First way to read");
		while((ch=br.read())!=-1) {
			System.out.print((char)ch);
			
		}*/
		
		System.out.println("Second way");
		String line=br.readLine();
		while(line!=null) {
			System.out.println(line);
			line=br.readLine();
		}
		
		br.close();
		
		
	}

}
