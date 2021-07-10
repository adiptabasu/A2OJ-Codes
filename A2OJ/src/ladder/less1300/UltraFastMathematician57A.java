package ladder.less1300;

import java.util.Scanner;

public class UltraFastMathematician57A 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		String out="";
		for(int i=0;i<str1.length();i++)
		{
			out+=str1.charAt(i)^str2.charAt(i);
		}
		System.out.println(out);
		sc.close();
	}
}