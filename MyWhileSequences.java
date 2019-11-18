
public class MyWhileSequences 
{

	public static void main(String[] args) 
	{
		// 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
		int x = 1;
		while (x <= 10)
		{
			System.out.print(x+", ");
			x++;
		}
		System.out.println();
		
		// 0, 2, 4, 6, 8, 10, 12, 14, 16,
		x = 0;
		while (x <= 16)
		{
			System.out.print(x+", ");
			x+=2;
		}
		System.out.println();
		
		// 35, 30, 25, 20, 15, 10, 5, 0,
		x = 35;
		while (x >= 0)
		{
			System.out.print(x+", ");
			x-=5;
		}
		System.out.println();
		
		// 1, 4, 9, 16, 25, 36, 49, 64, 81, 100,
		x = 1;
		while (x <= 10)
		{
			System.out.print(x*x+", ");
			x++;
		}
		System.out.println();
		
		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,
		int f = 0;
		int s = 1;
		System.out.print(f+", "+s+", ");
		int t = f + s;
		while (t <= 144)
		{
			System.out.print(t+", ");
			f = s;
			s = t;
			t = f + s;
		}
		System.out.println();
		
	
			

	}

}
