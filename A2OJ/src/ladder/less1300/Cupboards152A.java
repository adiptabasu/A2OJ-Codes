package ladder.less1300;

import java.util.Scanner;

public class Cupboards152A 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int inputNumber=Integer.parseInt(sc.nextLine());
		int arr[][]=new int[inputNumber][2];
		int leftOpen,leftClose,rightOpen,rightClose;
		leftOpen=rightOpen=leftClose=rightClose=0;
		for(int i=0;i<inputNumber;i++)
		{
			String data[]=sc.nextLine().split(" ");
			for(int j=0;j<data.length;j++)
			{
				arr[i][j]=Integer.parseInt(data[j]);
				if(j==0)
				{
					if(arr[i][j]==0)
					{
						leftClose+=1;
					}
					else
					{
						leftOpen+=1;
					}
				}
				else
				{
					if(arr[i][j]==0)
					{
						rightClose+=1;
					}
					else
					{
						rightOpen+=1;
					}
				}
			}
		}
		int moves=leftClose>=leftOpen?leftOpen:leftClose;
		moves+=rightClose>=rightOpen?rightOpen:rightClose;
		System.out.println(moves);
		sc.close();
	}
}
