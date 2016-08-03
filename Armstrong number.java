package activity;

import java.util.Scanner;

public class power {

	public static void main(String[] args) {
		int num;
		int sum=0;
		int count=0;
		Scanner in=new Scanner(System.in);
		num=in.nextInt();
		int n=num;
		while(n!=0)
		{
		n=n/10;	
		count++;
		}
		while(num!=0)
		{	
		     
		    int  a=num%10;
			sum=sum+(int)Math.pow(a,count);
			num=num/10;
		}
		System.out.println(sum);
        if(sum==num)
       {
        System.out.println("armstrong no");

          }
}