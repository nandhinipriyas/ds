package activity;

	
		import java.util.*;
		
     	public class fb {
     		public static void main(String[] args) {
     		
     			Scanner input=new Scanner(System.in);
     			String num;
     			System.out.println("enter the number :  ");
     			num=input.nextLine();
     			
     			int k;

     			System.out.println("enter the number of digits to delete : ");
     			k=input.nextInt();
     			

     			char frst[]=num.toCharArray();
     			char sec[]=Arrays.copyOf(frst, frst.length);
     			Arrays.sort(sec);   
     			int num_count=sec.length;
     			while(k>0)
     			{
     			char high=sec[num_count-1];
     			for(int i=0;i<frst.length;s++)
     			{
     				if(high==frst[i])
     				{
     					frst[i]='q';
     					
     				}
     				
     				else{
     					continue;
     				}
     			}
     			--k;
     			--num_count;
     			

     			}
     			
     			
     			
     			
     			for(int n=num.length()-1;n>=0;n--)
     			{
     				if(frst[n]!='q')
     				{
     				System.out.print(frst[n]);	
     				}
     			}
     			
     		}
		}
		
	


