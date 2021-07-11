package ladder.less1300;

import java.util.HashMap;
import java.util.Scanner;

public class IsYourHorseshoeOnTheOtherHoof414A 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();
		for(int i=0;i<4;i++)
		{
			int temp=sc.nextInt();
			if(!(hm.containsKey(temp)))
			{
				hm.put(temp, temp);
			}
		}
		System.out.println(4-hm.size());
		sc.close();
	}
}