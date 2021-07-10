package ladder.less1300;

import java.util.Scanner;

public class Drinks126B 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int noOfDrinks=Integer.parseInt(sc.nextLine());
		String drinkPerc[]=sc.nextLine().split(" ");
		double perc=0f;
		for(int i=0;i<noOfDrinks;i++)
		{
			perc+=Integer.parseInt(drinkPerc[i]);
		}
		perc/=noOfDrinks;
		System.out.println(perc);
		sc.close();
	}
}