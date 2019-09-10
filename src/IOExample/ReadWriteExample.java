package IOExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Write a file
		String insert="Hi \n this is a new message";
		
		FileWriter fw=new FileWriter("D:\\output.txt",false);
		File f=new File("D:\\output.txt");
		System.out.println(f.length());
		for(int i=0;i<insert.length();i++) {
			
			fw.write(insert.charAt(i));
		}
		
		System.out.println("Data inserted into \n the file Sucessfully");
		fw.append(" bye bye");
		//Close the file
		fw.close();
		
		//Read a file
		int ch;
		FileReader fr=null;
		try {
		fr=new FileReader("D:\\output.txt");
		
		}
		catch(FileNotFoundException e) {
			e.getStackTrace();
		}
		
		while((ch=fr.read())!=-1) {
			System.out.print((char)ch);
		}
		System.out.println(f.length());
		fr.close();
	}

}
