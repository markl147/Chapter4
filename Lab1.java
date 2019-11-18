
public class Lab1
{

	public static void main(String[] args) 
	{
		//1
		int x = 1;
		while(x <= 10)
		{
			System.out.print(x + ", ");
			x++;
		}

		//2
		System.out.println();
		int y = 0;
		while(y <= 16)
		{
			
			if(y%2 == 0)
			{
				System.out.print(y + ", ");
			}
			
			y++;
		}
		
		//3
		System.out.println();
		int z = 35;
		while(z >= 0)
		{
			if(z%5 == 0)
			{
				System.out.print(z + ", ");
			}
			
			z--;
		}
		
		//4
		System.out.println();
		int a = 1;
		while(a >= 1 && a <= 10)
		{
			System.out.print((a*a) + ", ");
			a++;
		}
		
		//5
		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,
		System.out.println();
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