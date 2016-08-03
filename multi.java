package activity;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		int num;
		int a;
		Scanner in=new Scanner(System.in);
		num=in.nextInt();
		for(int i=0;i<=100;i++)
        {
             a=num*i;
             System.out.println(a);
        }
}
}