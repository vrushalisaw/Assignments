package com.assignment04;

public class Add {

	public void add(int...n) /*variable arguments*/
	{
		/*{
        int sum=0;
                for(int i=0;i<n.length;i++)
                {
                System.out.print(n[i]+"+");	
                sum+=n[i];
                }
        System.out.print("="+sum+"\n");
        }
		*/
		{
		        int sum=0;
		 
		                for(int i: n)	
		                {
		                System.out.print(i+"+");	
		                sum+=i;
		                }
		        System.out.print("="+sum+"\n");
		        
			}

		
		

		
	}

}
