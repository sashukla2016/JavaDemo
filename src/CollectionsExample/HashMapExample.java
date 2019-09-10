package CollectionsExample;

import java.util.HashMap;

public class HashMapExample {

	void charCount(String str) {
		
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		char arr[]=str.toCharArray();
		for (char s : arr) {
			
			if(hm.containsKey(s)) {
				hm.put(s, (hm.get(s)+1));
				
			}
			else hm.put(s, 1);
			
		}
		
		//Printing the values
		
		System.out.println(hm.entrySet().toString());
	}
	public static void main(String args[]) {
		
		HashMapExample hme=new HashMapExample();
		
		hme.charCount("aabbcdeff");
	}
}
