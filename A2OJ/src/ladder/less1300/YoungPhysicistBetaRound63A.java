package ladder.less1300;

import java.util.Scanner;

public class YoungPhysicistBetaRound63A 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=Integer.parseInt(sc.nextLine());
		long x,y,z;
		x=y=z=0l;
		for(int i=0;i<num;i++)
		{
			String arr[]=sc.nextLine().split(" ");
			x+=Integer.parseInt(arr[0]);
			y+=Integer.parseInt(arr[1]);
			z+=Integer.parseInt(arr[2]);
		}
		if((x==0)&&(y==0)&&(z==0))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		sc.close();
	}
}