package ladder.less1300;

import java.util.Scanner;

public class WayTooLongWords65A 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=Integer.parseInt(sc.nextLine());
		for(int i=0;i<num;i++)
		{
			System.out.println(smallWord(sc.nextLine()));
		}
		sc.close();
	}
	public static String smallWord(String input)
	{
		String output="";
		if(input.length()<=10)
		{
			output=input;
		}
		else
		{
			output=Character.toString(input.charAt(0))+String.valueOf(input.substring(1, input.length()-1).length())+Character.toString(input.charAt(input.length()-1));
		}
		return output;
	}
}