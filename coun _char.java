package activity;

import java.util.Scanner;

public class countchar {
	public static void main(String[] args)

	{
	Scanner input=new Scanner(System.in);
	System.out.println("ENTER THE STRING");
	//java.lang.String str =input.next();
	String str=input.next();
	char[] ch = str.toCharArray();

	int len=ch.length;

	for (int i = 0; i < len; i++) {

	int counter = 0;

	char c=str.charAt(i);

	for (int j = 0; j < len; j++) {

	if (c==ch[j]){

	counter++;

	ch[j]='\u0000';//System.out.println(ch);

	}

	}

	if(counter>0)System.out.println(c+ "="+counter);

	}

	}

		}