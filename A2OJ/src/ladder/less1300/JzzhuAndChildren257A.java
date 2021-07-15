package ladder.less1300;

import java.util.Scanner;

public class JzzhuAndChildren257A 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String firstLine=sc.nextLine();
		String secondLString=sc.nextLine();
		System.out.println(lastPos(firstLine, secondLString));
		sc.close();
	}
	public static int lastPos(String firstLine,String secondLine)
	{
		int pos=0;
		int candyPerPass=Integer.parseInt(firstLine.split(" ")[1]);
		double highestPass=0d;
		int higestPos=0;
		String temp[]=secondLine.split(" ");
		for(int i=0;i<temp.length;i++)
		{
			int candyNeeded=Integer.parseInt(temp[i]);
			double checkPrec=(double)candyNeeded/candyPerPass;
			double currPass=Math.ceil(checkPrec);
			if(i==0)
			{
				highestPass=currPass;
				higestPos=i;
			}
			else
			{
				if((highestPass<=currPass)&&(higestPos<i))
				{
					highestPass=currPass;
					higestPos=i;
				}
			}
		}
		pos=higestPos+1;
		return pos;
	}
}