package ladder.less1300;

import java.util.Scanner;

public class Reconnaissance234A 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String junk=sc.nextLine();
		if(!(junk==null))
		{
			System.out.println(getPos(sc.nextLine().split(" ")));
		}
		sc.close();
	}
	public static String getPos(String[] input)
	{
		String output="";
		int pos=0;
		int absdiff=Math.abs(Integer.parseInt(input[0])-Integer.parseInt(input[input.length-1]));
		for(int i=1;i<input.length;i++)
		{
			int currDiff=Math.abs(Integer.parseInt(input[i])-Integer.parseInt(input[i-1]));
			if(currDiff<absdiff)
			{
				pos=i;
				absdiff=currDiff;
			}
		}
		if(pos==0)
		{
			output=String.valueOf(input.length)+" "+String.valueOf(pos+1);
		}
		else
		{
			output=String.valueOf(pos)+" "+String.valueOf(pos+1);
		}
		return output;
	}
}