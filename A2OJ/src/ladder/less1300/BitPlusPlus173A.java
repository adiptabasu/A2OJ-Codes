package ladder.less1300;

import java.util.Scanner;

public class BitPlusPlus173A 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x=0;
		int num=Integer.parseInt(sc.nextLine());
		for(int i=0;i<num;i++)
		{
			String inp=sc.nextLine();
			if(inp.contains("++"))
				x+=1;
			else
				x-=1;
		}
		System.out.print(x);
		sc.close();
	}
}