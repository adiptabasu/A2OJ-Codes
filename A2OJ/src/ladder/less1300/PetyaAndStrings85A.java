package ladder.less1300;

import java.util.Scanner;

public class PetyaAndStrings85A 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1=sc.nextLine();
		int output=str1.compareToIgnoreCase(str);
		if(output>0)
			output=-1;
		else if(output<0)
			output=1;
		else
			output=0;
		System.out.println(output);
		sc.close();
	}
}