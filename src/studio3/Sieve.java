package studio3;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number [greater than or equal to 2]: ");
		int n = in.nextInt();
		
		boolean[] array = new boolean[n];


		// filling in with trues
		boolean x = true;
		for(int i = 0; i<array.length-1; i++)
		{
			array[i] = x;
		}
		
		
		// setting notPrimes to false
		for(int i = 2; i<Math.sqrt(n); i++)
		{
			if(array[i]==true)
			{
				for(int j = i*i; j<n; j+=i)
				{
					System.out.println("i: " + i);
					System.out.println("j: " + j);
					array[j] = false;
				}
			}
		}
		
		//printing
		for(int i = 2; i<array.length-1; i++)
		{
			if (array[i]==true)
			{
				System.out.print(i + ", ");
			}
		}
		System.out.println();
		

	}

}
