package ladder.less1300;

import java.util.Scanner;

public class LightsOut168A 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int arr[][]= {{1,1,1},{1,1,1},{1,1,1}};
		for(int i=0;i<3;i++)
		{
			String data[]=sc.nextLine().split(" ");
			for(int j=0;j<data.length;j++)
			{
				if(!(Integer.parseInt(data[j])%2==0))
				{
					changeState(arr, i, j);
				}
			}
		}
		displayArray(arr);
		sc.close();
	}
	public static void changeState(int arr[][],int i,int j)
	{
		try 
		{
			arr[i][j]=arr[i][j]==0?1:0;
		}catch (Exception e) {}
		try 
		{
			arr[i+1][j]=arr[i+1][j]==0?1:0;
		}catch (Exception e) {}
		try 
		{
			arr[i-1][j]=arr[i-1][j]==0?1:0;
		}catch (Exception e) {}
		try 
		{
			arr[i][j+1]=arr[i][j+1]==0?1:0;
		}catch (Exception e) {}
		try 
		{
			arr[i][j-1]=arr[i][j-1]==0?1:0;
		}catch (Exception e) {}
	}
	public static void displayArray(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
