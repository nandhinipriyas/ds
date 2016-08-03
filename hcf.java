package activity;

import java.util.Scanner;

public class Sum {
	
		 public static void main(String Args[])
		    {
		        System.out.println("Enter 2 numbers");
		        Scanner sc=new Scanner(System.in);
		        int m=sc.nextInt();
		        int n=sc.nextInt();

		        int r=1;
		        int p=m*n;
		        for(int i=2;i<p;i++)
		        {
		            if((m%i==0)&&(n%i==0))
		            {
		                r=i;
		            }
		        }
		        System.out.println("HCF="+r);
		    }}