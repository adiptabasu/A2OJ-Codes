package ladder.less1300;

import java.util.Scanner;

public class WordCapitalization172A 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String data[]=sc.nextLine().split("");
		data[0]=data[0].toUpperCase();
		for(int i=0;i<data.length;i++)
		{
			System.out.print(data[i]);
		}
		sc.close();
	}

}