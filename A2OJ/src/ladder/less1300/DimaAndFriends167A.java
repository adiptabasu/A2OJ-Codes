package ladder.less1300;

import java.util.Scanner;

public class DimaAndFriends167A 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int numOfFriends=Integer.parseInt(sc.nextLine());
		long sum=0;
		for(int i=0;i<numOfFriends;i++)
		{
			sum+=sc.nextInt();
		}
		int c=0;
		for(int i=1;i<=5;i++)
		{
			if(!((sum+i)%(numOfFriends+1)==1))
			{
				++c;
			}
		}
		System.out.println(c);
		sc.close();
	}
}