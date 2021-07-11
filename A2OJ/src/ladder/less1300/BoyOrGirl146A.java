package ladder.less1300;

import java.util.Scanner;

public class BoyOrGirl146A {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String input=sc.nextLine();
		String temp=input;
		int uniqueCount=0;
		while(temp.length()>0)
		{
			temp=temp.replace(Character.toString(temp.charAt(0)), "");
			uniqueCount+=1;
		}
		System.out.println(uniqueCount%2==0?"CHAT WITH HER!":"IGNORE HIM!");
		sc.close();
	}

}
