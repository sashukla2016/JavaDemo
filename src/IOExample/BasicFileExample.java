package IOExample;

import java.io.File;
import java.io.IOException;

public class BasicFileExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("abc.txt");
		System.out.println(f.exists());
		f.createNewFile();
		
		System.out.println(f.exists());
		
		
		//-----------File creation using different constructors-----------//
		System.out.println("Directory Creation");
		File dir=new File("C:\\sashukla");
		dir.mkdir();
		System.out.println(dir.exists());
		
		File f1= new File(dir,"ss.txt");
		f1.createNewFile();
		
		if(dir.isDirectory()) {
			System.out.println("yes");
		}
		/*This will give an exception 
		 * File f2= new File("C:\\saaaaa","ss.txt"); f2.createNewFile();
		 * System.out.println(f2.exists());
		 */
	}

}
