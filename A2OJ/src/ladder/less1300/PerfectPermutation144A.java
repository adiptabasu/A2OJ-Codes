package ladder.less1300;

import java.util.Scanner;

public class PerfectPermutation144A 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String permutationSize=sc.nextLine();
		String output="";
		if(!(Integer.parseInt(permutationSize)%2==0))
		{
			output="-1";
		}
		else
		{
			int arr[]=new int[Integer.parseInt(permutationSize)];
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=i+1;
			}
			for(int i=0;i<arr.length;i+=2)
			{
				arr[i]+=arr[i+1];
				arr[i+1]=arr[i]-arr[i+1];
				arr[i]=arr[i]-arr[i+1];
			}
			for(int i=0;i<arr.length;i++)
			{
				output+=arr[i]+" ";
			}
		}
		System.out.println(output.trim());;
		sc.close();
	}
}