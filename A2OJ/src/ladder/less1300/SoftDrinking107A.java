package ladder.less1300;

import java.util.Scanner;

public class SoftDrinking107A 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n, k, l, c, d, p, nl, np;
		n=k=l=c=d=p=nl=np=0;
		String data[]=sc.nextLine().split(" ");
		n=Integer.parseInt(data[0]);
		k=Integer.parseInt(data[1]);
		l=Integer.parseInt(data[2]);
		c=Integer.parseInt(data[3]);
		d=Integer.parseInt(data[4]);
		p=Integer.parseInt(data[5]);
		nl=Integer.parseInt(data[6]);
		np=Integer.parseInt(data[7]);
		int noOfDrinks=(k*l)/(nl*n);
		int noOfLimes=(c*d)/n;
		int noChaser=p/(np*n);
		int min=noOfDrinks<=noOfLimes?noOfDrinks:noOfLimes;
		min=min<=noChaser?min:noChaser;
		System.out.println(min);
		sc.close();
	}
}