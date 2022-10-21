package testcom.ineuron;

public class patternassignment01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Program to print Name + Ineuron 
		
int n=20;

System.out.println("Program to print GAURAV+ INEURON  ");
System.out.println();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				
				if((i==n-1 && j <=n/4) || (i==0) || (j==0) || (i==0 && j<=n/4) || (j==n/4 && i>=n/2 && i<=n-1) || (i==n/2 && j>=n/4 && j<=n-1) || (j==n-1 && i>=n/2 && i<=n-1))
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
				
			}
		
		
			
			for(int j=0;j<n;j++) {
//				
				if(j==0 && i!=0 || (i==0 && j>0 && j<n/2) || (j==n/2 && i>0) || (i==n/2 && j>=0 && j<=n/2))
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			
			
		
	
			
				for(int j=0;j<n;j++) {
//					
					if(j==0 && i<(n-1) || (i==(n-1) && j>0 && j<n/2) || (j==n/2 && i!=(n-1)))
					{
						System.out.print("*");
					}
					else 
					{
						System.out.print(" ");
					}
				}
			
			
			
				for (int j=0;j<n;j++) {
					if (j==0 || (i==0 && j>0 && j<n/2) 
						|| (j==n/2 && i>0 && i<n/2) 
						|| (i==n/2 && j<n/2) ||((i-j)==n/2)) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				
		
			for(int j=0;j<n;j++) {
//				
				if(j==0 && i!=0 || (i==0 && j>0 && j<n/2) || (j==n/2 && i>0) || (i==n/2 && j>=0 && j<=n/2))
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			
		
		
			for(int j=0;j<40;j++) {
//	V			
				if(i==j && j<=20 || i+j==(40-1) && j>=20)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			
		
		
			for(int j=0;j<n;j++) {
				if (i==0 || i==(n-1) || j==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			
		
		
			for (int j=0;j<n;j++) {
				if (j==0 || j==(n-1) ||i==j)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				}
			
		
		
			for (int j=0;j<n;j++) {
				if (j==0 || i==0 || i==(n-1) || i==n/2)
					System.out.print("*");
				else System.out.print(" ");
			}
			
		
		
			for(int j=0;j<n;j++) {
				if((j==0 && i!=(n-1)) || (j==(n-1) && i!=(n-1)) || (i==(n-1) && j>0 && j<n-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
		
	
		
			for (int j=0;j<n;j++) {
				if (j==0 || (i==0 && j>0 && j<n/2) 
					|| (j==n/2 && i>0 && i<n/2) 
					|| (i==n/2 && j<n/2) ||((i-j)==n/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
		
		
			for(int j=0;j<n;j++) {
				if (j==0 && i>0 && i<(n-1) ||(j==(n-1) && i>0 && i<(n-1)) || (i==0 && j>0 && j<(n-1)) || (i==(n-1) && j>0 && j<(n-1))) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			
		
	
			for (int j=0;j<n;j++) {
				if (j==0 || j==(n-1) ||i==j)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
				}
			System.out.println();
			
		}

	}

}
