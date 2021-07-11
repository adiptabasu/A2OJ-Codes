package ladder.less1300;

import java.util.Scanner;

public class I_love_username109A {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n =Integer.parseInt(sc.nextLine());
		int arr[]=new int[n];
		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		int count=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			if(i==0)
			{
				min=arr[i];
				max=arr[i];
			}
			else
			{
				if(arr[i]<min)
				{
					min=arr[i];
					++count;
				}
				if(arr[i]>max)
				{
					max=arr[i];
					++count;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}

}
