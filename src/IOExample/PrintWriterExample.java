package IOExample;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=new PrintWriter("C:\\sashukla\\pw.txt");
		
		pw.write("saumya ");
		pw.println(100);
		pw.write(100);
		pw.println(true);
		
		pw.flush();
		pw.close();
	}

}
