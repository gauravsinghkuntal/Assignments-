package com.ineuron.ai;

public class Tester {

	public static void main(String[] args) {
//		pattern program to print characters from a to c 
		
		int n=10;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i==0) || (j==n/2) || (i==(n-1) && j<=n/2))
				{
					System.out.print("*");
				}
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((j==0) || (i==n/2 ) || (j==(n-1)))
				{
					System.out.print("*");
				}
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i==0 && j>0 && j<(n-1)) || (j==0 && i!=0) ||   (j==(n-1) && i!=0) || (i==n/2))
				{
					System.out.print("*");
				}
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i==0 && j>0 && j<(n-1)) || (j==0 && i!=0) ||   (j==(n-1) && i!=0) || (i==n/2))
				{
					System.out.print("*");
				}
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
