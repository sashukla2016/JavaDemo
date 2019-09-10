package IOExample;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class FileMergeWithoutDuplicate {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br1=new BufferedReader(new FileReader("C:\\sashukla\\file1.txt"));
		BufferedReader br2=new BufferedReader(new FileReader("C:\\sashukla\\file2.txt"));
		PrintWriter pw=new PrintWriter("C:\\sashukla\\output.txt");
		
		String line=br1.readLine();
		while(line!=null) {
			boolean available=false;
			String target=br2.readLine();
			while(target!=null) {
				if(target.equals(line)) {
					available=true;
					break;			
				}
				target=br2.readLine();
			}
			if(available==false) {
				pw.println(line);
				pw.flush();
			}
			
			line=br1.readLine();
			
		}
		
		pw.close();
		br1.close();
		br2.close();
		
		
	}

}
