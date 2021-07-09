package ladder.less1300;

import java.util.Scanner;

public class QueueAtTheSchool163B 
{
	public static int count=0;
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s1[]=sc.nextLine().split(" ");
		String s2=sc.nextLine();
//		for(int i=1;i<=Integer.parseInt(s1[1]);i++)
//		{
//			s2=s2.replace("BG", "GB");
//		}
//		System.out.println(s2);
		System.out.println(getAfterSwap(s2,Integer.parseInt(s1[1])));
		sc.close();
	}
	public static String getAfterSwap(String str,int n)
	{
		String output="";
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)=='B'&&str.charAt(i+1)=='G')
			{
				output+=str.charAt(i+1);
				output+=str.charAt(i);
				++i;
			}
			else
			{
				output+=str.charAt(i);
			}
		}
		++count;
		if(count <n)
			getAfterSwap(output, n);
		return output;
	}
}
