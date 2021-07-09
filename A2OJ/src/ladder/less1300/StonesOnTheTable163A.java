package ladder.less1300;

import java.util.Scanner;

public class StonesOnTheTable163A 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String stones=sc.nextLine();
		long c=0;
		for(int i=1;i<stones.length();i++)
		{
			if(stones.charAt(i)==stones.charAt(i-1))
				++c;
		}
		System.out.println(c);
		sc.close();
	}
}