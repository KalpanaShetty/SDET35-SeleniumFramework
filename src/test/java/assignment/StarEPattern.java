package assignment;

public class StarEPattern {

	public static void main(String[] args) {
		
		for (int i = 0; i < 3; i++) 
		{
			for (int j = i; j < 3; j++) 
			{
				System.out.print("*");
				
			}
			System.out.println();
			
		}
		
   for (int i = 3; i >0; i--) 
   {
	for (int j = i; j >= 2; j--) 
	{
		System.out.println("* ");
	}
	System.out.println("");
  }
	}

}
