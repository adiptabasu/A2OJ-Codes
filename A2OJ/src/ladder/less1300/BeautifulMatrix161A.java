package ladder.less1300;

import java.util.Scanner;

public class BeautifulMatrix161A 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[5][5];
		int x,y;
		x=y=0;
		for(int i=0;i<arr.length;i++)
		{
			String data[]=sc.nextLine().split(" ");
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=Integer.parseInt(data[j]);
				if(arr[i][j]>0)
				{
					x=i;
					y=j;
				}
			}
		}
		int colMove=Math.abs(2-x);
		int rowMove=Math.abs(2-y);
		System.out.println(colMove+rowMove);
		sc.close();
	}
	public static String pointCoordinates(int arr[][])
	{
		String output="";
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				if(arr[i][j]>0)
				{
					output=i+" "+j;
					break;
				}
			}
			if(output.length()>0)
				break;
		}
		return output;
	}
}