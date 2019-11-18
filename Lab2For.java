
public class Lab2For 
{

	public static void main(String[] args) 
	{
		//1
		for(int x = 1; x <= 10; x++)
		{
			System.out.print(x + ", ");
		}
		
		//2
		System.out.println();
		for(int y = 0; y <= 16; y+=2)
		{
			System.out.print(y + ", ");
		}
		
		//3
		System.out.println();
		for(int z = 35; z >= 0 ; z-=5)
		{
			System.out.print(z + ", ");
		}
		
		//4
		System.out.println();
		for(int a = 1; a >= 1 && a <= 10; a++)
		{
			System.out.print((a*a) + ", ");
		}
		
		//5
		System.out.println();
		int f = 0;
		int s = 1;
		System.out.print(f + ", " + s + ", ");
		for(int t = f + s; t <= 144; t = f + s)
		{
			System.out.print(t+", ");
			f = s;
			s = t;
		}

	}

}
