package ladder.less1300;

import java.util.Scanner;

public class BeautifulYear166A 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String thatYear=sc.nextLine();
		for(long i=Long.parseLong(thatYear)+1;;i++)
		{
			if(allDifferent(String.valueOf(i)))
			{
				System.out.println(i);
				break;
			}
		}
		sc.close();
	}
	public static boolean allDifferent(String year)
	{
		boolean result=false;
		String temp=year;
		long count=0;
		for(long i=0;i<year.length();i++)
		{
			temp=temp.replace(Character.toString(temp.charAt(0)), "");
			++count;
			if(temp.length()<=0)
				break;
		}
		if(count==year.length())
			result=true;
		else
			result=false;
		return result;
	}
}