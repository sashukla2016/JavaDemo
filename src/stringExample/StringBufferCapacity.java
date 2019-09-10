package stringExample;

public class StringBufferCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		
		sb.append("abcdefghijklmnop");
		System.out.println(sb.capacity());
		
		sb.append("q");
		System.out.println(sb.capacity());
		
		StringBuffer sb1=new StringBuffer("ps");
		System.out.println(sb1.capacity());
		System.out.println(sb1.charAt(3));
	}

}
