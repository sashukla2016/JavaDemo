package IOExample;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileSecondApproach {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("C:\\sashukla\\abc.txt");
		//int len=(int)f.length();
		char []ch=new char[(int)f.length()];
		FileReader fr=new FileReader(f);
		
		fr.read(ch);
		
		for(char ch1:ch) {
			System.out.print(ch1);
			
		}
		fr.close();
		
	}

}
