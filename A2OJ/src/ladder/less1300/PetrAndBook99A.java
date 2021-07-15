package ladder.less1300;

import java.util.Scanner;

public class PetrAndBook99A 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=Integer.parseInt(sc.nextLine());
		int dayRead[]=new int[7];
		int total=0;
		int output=0;
		for(int i=0;i<7;i++)
		{
			dayRead[i]=sc.nextInt();
			total+=dayRead[i];
		}
		if(num>total)
		{
			if(num%total==0)
			{
				num=total;
			}
			else
			{
				num=num%total;
			}
		}
		for(int i=0;i<7;i++)
		{
			num-=dayRead[i];
			if(num<=0)
			{
				output=i+1;
				break;
			}
		}
		System.out.println(output);
		sc.close();
	}
}