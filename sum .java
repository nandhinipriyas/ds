import java.io.InputStream;
import java.util.Scanner;

public class Factorial {
public static void main(String[] args){
	int num;
        int sum=0;
	
	Scanner ac= new Scanner(System.in);
	 num=ac.nextInt();
	for (i = 1; i <= num; i++)
         sum = sum + i;
	System.out.println("sum of num:"+sum);
}



}