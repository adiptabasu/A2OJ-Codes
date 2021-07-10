package ladder.less1300;

import java.util.Scanner;

public class ArrivalOfTheGeneral 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int sizeOfTroops=Integer.parseInt(sc.nextLine());
		int arr[]= new int[sizeOfTroops];
		int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		for(int i=0;i<sizeOfTroops;i++)
		{
			arr[i]=sc.nextInt();
			if(i==0)
			{
				min=arr[i];
				max=arr[i];
			}
			else
			{
				if(arr[i]>max)
				{
					max=arr[i];
				}
				if(arr[i]<min)
				{
					min=arr[i];
				}
			}
		}
		int lowestPos=getLowestPosition(arr, min);
		int highestPos=getHighestPosition(arr, max);
		int swapsToLow=arr.length-1-lowestPos;
		int swapsToHigh=highestPos;
		int totalSwaps=swapsToHigh+swapsToLow;
		if(lowestPos<highestPos)
			totalSwaps-=1;
		System.out.println(totalSwaps);
		sc.close();
	}
	public static int getHighestPosition(int arr[],int max)
	{
		int pos=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==max)
			{
				pos=i;
				break;
			}
		}
		return pos;
	}
	public static int getLowestPosition(int arr[],int min)
	{
		int pos=-1;
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]==min)
			{
				pos=i;
				break;
			}
		}
		return pos;
	}
}