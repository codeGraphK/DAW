
public class mayor {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a, b, c;
		a = Integer.parseInt(args[0]);
		b = Integer.parseInt(args[1]);
		c = Integer.parseInt(args[2]);
		
		if (a > b && a > c){
			
			System.out.println(a + "es el mayor");
			
		}else {
			
			if(b > c){
				
				System.out.println(b + "es el mayor");
				
			}else {
				
				System.out.println(c + "es el mayor");
				
			}//fin else
		}//fin else
	
	}//fin main

}//fin class