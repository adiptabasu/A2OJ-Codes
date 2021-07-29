package ladder.less1300;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class HexadecimalsTheorem125A 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Stack<Long> fibo=new Stack<Long>();
		long num=sc.nextLong();
		fibo.add(1l);
		generateStack(fibo, num, 0, 1);
		long tempCount=num;
		boolean firstCheck=true;
		ArrayList<Long> printlist=new ArrayList<Long>();
		while(tempCount>=0 && fibo.size()>0)
		{
			if(fibo.size()>0)
			{
				if(fibo.peek()<=tempCount)
				{
					tempCount-=fibo.peek();
					printlist.add(fibo.peek());
					if(firstCheck)
					{
						if(fibo.size()>0 && tempCount<fibo.peek())
						{
							fibo.pop();
						}
						firstCheck=false;
					}
					if(fibo.size()>0 && tempCount<fibo.peek())
					{
						fibo.pop();
					}
				}
				else
				{
					fibo.pop();
				}
			}
			else
			{
				break;
			}
		}
		for(Long data:printlist)
		{
			System.out.print(data+" ");
		}
		if(printlist.size()<3)
		{
			System.out.println("0 ".repeat(3-printlist.size()));
		}
		System.out.println();
		sc.close();
	}
	public static void generateStack(Stack<Long> fibo,long number,long start1,long start2)
	{
		long thirdNum=start1+start2;
		if(thirdNum>=number)
		{
			return;
		}
		else
		{
			fibo.push(thirdNum);
			generateStack(fibo, number, start2, thirdNum);
		}
	}
}