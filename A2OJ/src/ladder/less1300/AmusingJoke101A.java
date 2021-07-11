package ladder.less1300;

import java.util.HashMap;
import java.util.Scanner;

public class AmusingJoke101A 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		HashMap<Character, Integer> mainCheck=new HashMap<Character, Integer>();
		HashMap<Character, Integer> testCheck=new HashMap<Character, Integer>();
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		String str3=sc.nextLine();
		updateCount(mainCheck, str1);
		updateCount(mainCheck, str2);
		updateCount(testCheck, str3);
		System.out.println(conditionCheck(mainCheck, testCheck)?"YES":"NO");
		sc.close();
	}
	public static void printHashMap(HashMap<Character, Integer> hm)
	{
		for(char i='a';i<='z';i++)
		{
			if(hm.containsKey(i))
				System.out.println(i+"->"+hm.get(i));
		}
	}
	public static void updateCount(HashMap<Character, Integer> hm,String input)
	{
		input=input.toLowerCase().trim();
		for(int i=0;i<input.length();i++)
		{
			char ch=input.charAt(i);
			if(hm.containsKey(ch))
			{
				hm.replace(ch, hm.get(ch)+1);
			}
			else
			{
				hm.put(ch, 1);
			}
		}
	}
	public static boolean conditionCheck(HashMap<Character, Integer> mainCheck ,HashMap<Character, Integer> testCheck)
	{
		boolean condition=true;
		for(char i='a';i<='z';i++)
		{
			if(!(mainCheck.get(i)==testCheck.get(i)))
			{
				condition=false;
				break;
			}
		}
		return condition;
	}
}
