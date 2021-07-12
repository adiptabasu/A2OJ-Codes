package ladder.less1300;

import java.util.Scanner;

public class HQ9Plus96A 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		boolean willPrint=false;
		for(int i=0;i<input.length();i++)
		{
			if((input.charAt(i)=='H')||(input.charAt(i)=='Q')||(input.charAt(i)=='9'))
			{
				willPrint=true;
				break;
			}
		}
		System.out.println(willPrint?"YES":"NO");
		sc.close();
	}
}