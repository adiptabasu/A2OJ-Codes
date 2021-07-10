package ladder.less1300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NearlyLuckyNumber84A 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input=br.readLine();
		int c=0;
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)=='4'||input.charAt(i)=='7')
				++c;
		}
		System.out.println(String.valueOf(c).replace("4", "").replace("7", "").length()==0?"YES":"NO");
		br.close();
	}
}