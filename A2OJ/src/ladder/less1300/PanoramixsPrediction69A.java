package ladder.less1300;

import java.util.Scanner;

public class PanoramixsPrediction69A {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String inputs[]=sc.nextLine().split(" ");
//		String inputs[]= {"5","11"};
		boolean anotherPrime=false;
		for(int i=Integer.parseInt(inputs[0])+1;i<Integer.parseInt(inputs[1]);i++)
		{
			if(isPrime(i))
			{
				anotherPrime=true;
				break;
			}
		}
		String output="NO";
		if(anotherPrime || !(isPrime(Integer.parseInt(inputs[1]))))
		{
			output="NO";
		}
		else
		{
			output="YES";
		}
		System.out.println(output);
		sc.close();
	}
	private static boolean isPrime(long n)
	{
		boolean prime=false;
		long count=0;
		for(long i=2;i<=(n/2);i++)
		{
			if(n%i==0)
			{
				++count;
				break;
			}
		}
		if(count ==0)
			prime=true;
		else
			prime=false;
		return prime;
	}
}
