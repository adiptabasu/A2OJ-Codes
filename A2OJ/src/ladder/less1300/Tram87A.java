package ladder.less1300;

import java.util.Scanner;

public class Tram87A 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		int maxPassCount=0,currPassCount=0;
		for(int i=0;i<n;i++)
		{
			String pass[]=sc.nextLine().split(" ");
			currPassCount+=Integer.parseInt(pass[1])-Integer.parseInt(pass[0]);
			if(currPassCount>maxPassCount)
			{
				maxPassCount=currPassCount;
			}
		}
		System.out.println(maxPassCount);
		sc.close();
	}
}