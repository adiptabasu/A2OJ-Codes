package ladder.less1300;

import java.util.ArrayList;
import java.util.Scanner;

public class SupercentralPoint112A 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num=Integer.parseInt(sc.nextLine());
		String points[]=new String[num];
		for(int i=0;i<num;i++)
		{
			points[i]=sc.nextLine();
		}
		ArrayList<ArrayList<String>> adjList= new ArrayList<ArrayList<String>>();
		populateAdjList(adjList, points);
//		printAdjList(adjList, points);
		System.out.println(getSuperCentralPoints(adjList, points));
		sc.close();
	}
	public static void populateAdjList(ArrayList<ArrayList<String>> adjList,String points[])
	{
		for(int i=0;i<points.length;i++)
		{
			ArrayList<String> adjPoints=new ArrayList<String>();
			String currPoint[]=points[i].split(" ");
			for(int j=0;j<points.length;j++)
			{
				if(!(i==j))
				{
					String otherPoint[]=points[j].split(" ");
					if((currPoint[0].equalsIgnoreCase(otherPoint[0]))||(currPoint[1].equalsIgnoreCase(otherPoint[1])))
					{
						adjPoints.add(points[j]);
					}
				}
			}
			adjList.add(adjPoints);
		}
	}
	public static void printAdjList(ArrayList<ArrayList<String>> adjList,String points[])
	{
		for(int i=0;i<points.length;i++)
		{
			ArrayList<String> local=adjList.get(i);
			System.out.println("Point in Question is: "+points[i]+ "with size:"+local.size());
			
			for(String data:local)
			{
				System.out.print(data+" -> ");
			}
			System.out.println();
		}
	}
	public static int getSuperCentralPoints(ArrayList<ArrayList<String>> adjList,String points[])
	{
		int noOfPoints=0;
		for(int i=0;i<points.length;i++)
		{
			ArrayList<String> local=adjList.get(i);
			String mainPoint[]=points[i].split(" ");
			if(local.size()>3) 
			{
				boolean xgy,xly,ygx,ylx;
				xgy=xly=ygx=ylx=false;
				for(String adjPoint:local)
				{
					String localPts[]=adjPoint.split(" ");
					if(localPts[0].equals(mainPoint[0]))
					{
						if(Integer.parseInt(localPts[1])>Integer.parseInt(mainPoint[1]))
						{
							xgy=true;
						}
						else if(Integer.parseInt(localPts[1])<Integer.parseInt(mainPoint[1]))
						{
							xly=true;
						}
					}
					if(localPts[1].equals(mainPoint[1]))
					{
						if(Integer.parseInt(localPts[0])>Integer.parseInt(mainPoint[0]))
						{
							ygx=true;
						}
						else if(Integer.parseInt(localPts[0])<Integer.parseInt(mainPoint[0]))
						{
							ylx=true;
						}
					}
					if(xgy && xly && ygx && ylx)
					{
						break;
					}
				}
				if(xgy && xly && ygx && ylx)
				{
					noOfPoints++;
				}
			}
		}
		return noOfPoints;
	}
}