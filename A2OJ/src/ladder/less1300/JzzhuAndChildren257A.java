package ladder.less1300;

import java.util.Scanner;

public class JzzhuAndChildren257A 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,m;
		n=m=0;
		String datamn[]=sc.nextLine().split(" ");
		n=Integer.parseInt(datamn[0]);
		m=Integer.parseInt(datamn[1]);
		int highestPass=0;
		int highestPos=0;
		for(int i=0;i<n;i++)
		{
			int currNeed=sc.nextInt();
			double currPass=Math.ceil(currNeed/m);
			if(i==0)
			{
				highestPass=(int) currPass;
				highestPos=i;
			}
			else
			{
				System.out.println((double)highestPass==currPass);
//				System.out.print(highestPass<=currPass);
//				System.out.println(" "+(highestPos<i));
				if((highestPass<=currPass) &&(highestPos<i))
				{
					highestPass=(int) currPass;
					highestPos=i;
				}
			}
			System.out.println(currNeed+" -> "+currPass+" ^ "+highestPass+" "+highestPos);
		}
		System.out.println(highestPos+1);
		sc.close();
	}
}