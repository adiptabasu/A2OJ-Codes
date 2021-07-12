package ladder.less1300;

import java.util.Scanner;

public class Team143A 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int number=Integer.parseInt(sc.nextLine());
		int count=0;
		for(int i=0;i<number;i++)
		{
			String input=sc.nextLine();
			input=input.replace(" ", "");
			if((input.length()-input.replace("1", "").length())>1)
			{
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}