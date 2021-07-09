package ladder.less1300;

import java.util.Scanner;

public class NearlyLuckyNumber84A 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String num=sc.nextLine();
		String temp=num;
		temp=temp.replace("4", "");
		temp=temp.replace("7", "");
		String output;
		if(temp.length()==0)
		{
			temp=String.valueOf(num.length());
			temp=temp.replace("4", "");
			temp=temp.replace("7", "");
			if(temp.length()==0)
				output="YES";
			else
				output="NO";
		}
		else
		{
			output="NO";
		}
		System.out.println(output);
		sc.close();
	}
}