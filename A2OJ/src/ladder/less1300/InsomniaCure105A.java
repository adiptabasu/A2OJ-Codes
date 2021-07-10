package ladder.less1300;

import java.util.Scanner;

public class InsomniaCure105A 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int iter[]=new int[4];
		int count =0;
		boolean isOneThere=false;
		for(int i=0;i<4;i++)
		{
			iter[i]=Integer.parseInt(sc.nextLine());
			if(iter[i]==1)
				isOneThere=true;
		}
		int num=Integer.parseInt(sc.nextLine());
		if(isOneThere)
		{
			count=num;
		}
		else
		{
			boolean arr[]=new boolean[num];
			for(int i=0;i<iter.length;i++)
			{
				slieveOfEratosthenesModified(arr, iter[i]);
			}
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]==true)
					count+=1;
			}
		}
		System.out.println(count);
		sc.close();
	}
	public static void slieveOfEratosthenesModified(boolean arr[],int n)
	{
		for(int i=n-1;i<arr.length;i+=n)
		{
			if(arr[i]==false)
				arr[i]=true;
		}
	}
}
