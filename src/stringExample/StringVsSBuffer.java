package stringExample;

public class StringVsSBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("durga");
		s.concat("Software");
		System.out.println(s);
		
		StringBuffer sb=new StringBuffer("durga");
		sb.append("Software");
		System.out.println(sb);

	}

}
