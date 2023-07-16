package week1.day1;

public class BasicMaths {
	
	public int add(int a,int b) {
		
		return a+b;
	
	}
	private int sub(int a,int b) {
		return a-b;
	
	}
	public int div(int a,int b) {
		return a/b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BasicMaths bm=new BasicMaths();
		//Method 1
		    
		    int add=bm.add(10,10);
			
		    System.out.println(add);
			
		    
		//Method2
		   
		    System.out.println(bm.sub(20,5));
			System.out.println(bm.div(10,2));
	}

}
