package ladder.less1300;

import java.util.Scanner;

public class Word55A 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
//		String input="HoUseEE";
		if(toLowerCase(input))
			System.out.println(input.toLowerCase());
		else
			System.out.println(input.toUpperCase());
		sc.close();
	}
	public static boolean toLowerCase(String input)
	{
		boolean lowerCase=true;
		int lc,uc;
		lc=uc=0;
		int i=0,j=input.length()-1;
		while(i<j)
		{
			if(input.charAt(i)==input.toUpperCase().charAt(i))
			{
				uc++;
			}
			else
			{
				lc++;
			}
			if(input.charAt(j)==input.toUpperCase().charAt(j))
			{
				uc++;
			}
			else
			{
				lc++;
			}
			++i;
			--j;
		}
		if(!(input.length()%2==0))
		{
			if(input.charAt(input.length()/2)==input.toUpperCase().charAt(input.length()/2))
			{
				uc++;
			}
			else
			{
				lc++;
			}
		}
		if(uc>lc)
			lowerCase=false;
		return lowerCase;
	}
}