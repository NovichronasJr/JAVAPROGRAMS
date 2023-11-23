

import java.util.*;

class A extends Thread
{
	public void run()
	{
		int i;
		for(i = 1 ; i<101;i++)
		{
			if(i == 1)
			{
				System.out.println("i :  "+i);
			} 
			
			else if(i%2 != 0)
			{
			 	System.out.println("i :  "+i);
			}
			
			else
			{
				continue;
			}
		}
	
	}


}


class B extends Thread
{
	public void run()
	{
		int k;
		
		for(k = 1 ; k<101;k++)
		{
			if(k == 1)
			{
				continue;
			}
			
			else if(k%2 == 0)
			{
				System.out.println("k :  "+k);
			}
		}
	
	
	}

}

class Multithread
{
	public static void main(String args[])
	{
		A obj1 = new A();
		B obj2 = new B();
		obj1.start();
		obj2.start();
	
	}


}

