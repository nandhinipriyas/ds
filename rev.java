package activity;

import java.util.Scanner;

public class Rev {
public static void main(String[] args) {
         int num;
     Scanner in=new Scanner()System.in;
     num=in.nextInt();
                int revnum = 0;
                int temp = 0;
               
                while(num > 0)
                {
                  temp = num%10;
                  revnum = revnum * 10 + temp;
                  num = num/10;
                         
                }
            System.out.println("Reversed Number is: " + revnum);
        

}
}