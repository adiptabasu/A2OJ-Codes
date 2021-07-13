package ladder.less1300;

import java.util.HashMap;
import java.util.Scanner;

public class EffectiveApproach140B 
{
	public static void main(String[] args) 
	{
		HashMap<String, Integer> inputMap=new HashMap<String, Integer>();
		Scanner sc=new Scanner(System.in);
		long v,p;
		v=p=0;
		int num=Integer.parseInt(sc.nextLine());
		if(num==0)
		{
			
		}
		String data[]=sc.nextLine().split(" ");
		updateDataMap(inputMap, data);
		num=Integer.parseInt(sc.nextLine());
		String searchQuery[]=sc.nextLine().split(" ");
		for(int i=0;i<searchQuery.length;i++)
		{
			int pos=inputMap.get(searchQuery[i]);
			v+=pos+1;
			p+=inputMap.size()-pos;
		}
		System.out.println(v+" "+p);
		sc.close();

	}
	public static void updateDataMap(HashMap<String, Integer>inputMap,String data[])
	{
		for(int i=0;i<data.length;i++)
		{
			if(!(inputMap.containsKey(data[i])))
			{
				inputMap.put(data[i], i);
			}
		}
	}
	public static void printHashMap(HashMap<String, Integer>inputMap)
	{
		inputMap.forEach((key,val)->System.out.println(key+" "+val));
	}
}