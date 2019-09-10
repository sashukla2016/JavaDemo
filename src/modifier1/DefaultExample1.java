package modifier1;

/*class ModifierExmpl{
	
protected void setInfo(String name, int id) {
		
		System.out.println("Information is set \nName is "+name+" Id is "+id);
	}

}*/
public class DefaultExample1 {
public void setInfo(String name, int id) {
	
	try {
		int a=2/0;
		System.out.println("Information is set \nName is "+name+" Id is "+id);
		
		//system.exit used to terminate JVM
		System.exit(0);
	}
	catch (Exception e) {
		System.out.println("error:"+e.getMessage());
	}finally {
		System.out.println("yahin hu");
	}
	
	}
public static void main(String args[]) {
		
	DefaultExample1 obj=new DefaultExample1();
		obj.setInfo("Saumya", 404);
	}
}


