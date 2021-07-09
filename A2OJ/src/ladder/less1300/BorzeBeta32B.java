package ladder.less1300;

import java.util.Scanner;

public class BorzeBeta32B 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		str=str.replace("--", "2");
		str=str.replace("-.", "1");
		str=str.replace(".", "0");
		System.out.println(str);
		sc.close();
	}

}
