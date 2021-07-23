package ladder.less1300;

import java.util.Scanner;

public class EvenOdds188A 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long k=sc.nextLong();
		System.out.println(getNum(n, k-1));
		sc.close();
	}
	public static long getNum(long n,long k)
	{
		long output=0;
		long mid=n/2;
		if(n%2==0)
		{
			mid--;
		}
		if(k<=mid)
		{
			output=1+(2*k);
		}
		else
		{
			output=2*(k-mid);
		}
		return output;
	}
}