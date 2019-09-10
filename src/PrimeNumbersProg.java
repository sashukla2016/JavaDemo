import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbersProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms to be printed");
		int terms=sc.nextInt();
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		Integer []arr=new Integer[terms];
		for(int i=2,j=0;i<terms;i++,j++) {
			
			if(i==2||i==3||i==5||i==7) {
				//System.out.println(i);
				arr[j]=i;
				al.add(arr[j]);
			}
			else
			if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0) {
				//System.out.println(i);
				arr[j]=i;
				//al.add(arr[j]);
			}
			
		}
		
		System.out.println("prime numbers are "+al);
		
	}

}
