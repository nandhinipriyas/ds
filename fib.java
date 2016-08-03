import java.io.InputStream;
import java.util.Scanner;

public class F {

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int a=1,b=-1,output;
		int input=s.nextInt();
	                for(int i=1;i<=input;++i)   
 			{    
				  c=a+b;    
				  output=c ;    
				  a=b;
                                  b=c;
                         System.out.print(" "+output);
			}
	}



}