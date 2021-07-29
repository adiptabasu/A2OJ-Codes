package ladder.less1300;

import java.util.Scanner;

public class LittleElephantAndRozdil129A 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		boolean isDouble=false;
		long value=Long.MAX_VALUE,pos=0;
		for(long i=0;i<n;i++)
		{
			long temp=sc.nextLong();
			if(temp<value)
			{
				value=temp;
				pos=i;
				isDouble=false;
			}
			else if(temp==value)
			{
				isDouble=true;
			}
		}
		if(isDouble)
		{
			System.out.println("Still Rozdil");
		}
		else
		{
			System.out.println(pos+1);
		}
		sc.close();
	}
}