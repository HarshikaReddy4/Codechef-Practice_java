// Chef has invented 1 1-minute Instant Noodles.
// As the name suggests, each packet takes exactly 1 1 minute to cook. 
 //Chef's restaurant has X stoves and only 1 1 packet can be cooked in a single stove at any minute.
 // How many customers can Chef serve in  Y minutes if each customer orders exactly 1 1 packet of noodles? 

 

import java.util.*;
import java.lang.*;
import java.io.*;


class Chef_noodles
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println(x*y);
	}
}
