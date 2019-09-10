package CollectionsExample;
import java.util.ArrayList;

public class ArrayListExample {

	void charCount() {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i =0;i<5;i++) {
			al.add(i);
			
		}
		System.out.println(al.isEmpty());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListExample obj=new ArrayListExample();
		obj.charCount();
	}

}
