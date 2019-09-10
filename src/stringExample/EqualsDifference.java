package stringExample;

public class EqualsDifference {

	void comparisonString(){
		String s1= new String("saumya");
		String s2= new String("saumya");
		
		System.out.println("String value: \n"+(s1==s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.length());
	}
	
	void comparisonStringBuffer(){
		StringBuffer s1= new StringBuffer("saumya");
		StringBuffer s2= new StringBuffer("saumya");
		
		System.out.println("StringBuffer value: \n"+(s1==s2));
		
		//In string buffer .equals is not overriden hence we will get false as output
		System.out.println(s1.equals(s2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EqualsDifference ed=new EqualsDifference();
		ed.comparisonString();
		ed.comparisonStringBuffer();
	}

}
