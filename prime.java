package assignment01;
import java.util.*;

public class jhk {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int s1, s2, s3, flag = 0, i, j,check,nOD=0;
		System.out.println ("Enter the number to check :"); 
        check= s.nextInt();
       // Scanner s = new Scanner(System.in);
        System.out.println ("Enter the lower limit :"); 
        s1 = s.nextInt();
        System.out.println ("Enter the upper limit :"); 
        s2 = s.nextInt();
        System.out.println ("The prime numbers in between the entered limits are :");
        int[] arr=new int[1000];
        int k=0;
                
        for(i = s1; i <= s2; i++)
        {
        	 
             if(i==2)
             {
            	 flag =1;
             }
            for( j = 2; j < i; j++)
            {
                if(i % j == 0)
                {
                    flag = 0;
                    break;
                }
               
                else
                {
                    flag = 1;
                }
                         }
         
            if(flag==1)
            {
            	
            	arr[k]=i;
            	System.out.println("arr[k]="+arr[k]);
            	k++; 
            }
           
            }
             for(int p=0;p<k;p++)
             {
            	int t=arr[p];
             
            	
            	while(t!=0)
            	{
            		if(t%10==check)
            		{
            			nOD++;
            		}
            		t=t/10;
            	}
             }
             System.out.println(+nOD);
	}}
