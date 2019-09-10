package IOExample;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;

public class ExampleBufferedReadWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("D:\\output.txt"));
		System.out.println("bytes available "+bis.available());
		
		if(bis.markSupported()) {
			System.out.println("hi");
		}
		
		bis.close();
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
		}
	}

}
