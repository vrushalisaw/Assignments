package com.assignment02;

import java.text.*;
import java.util.*;

public class Test {
	public static void main(String args[]) {
	
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	double price =sc.nextDouble();
	NumberFormat vv0=NumberFormat.getCurrencyInstance(Locale.US);
	System.out.println("US : "+vv0.format(price*1));
	NumberFormat vv1=NumberFormat.getCurrencyInstance( new Locale("en", "IN"));
	System.out.println("INDIA : "+vv1.format(price*67.48));
	NumberFormat vv2=NumberFormat.getCurrencyInstance(Locale.CHINA);
	System.out.println("CHINA : "+vv2.format(price*6.88));
	NumberFormat vv3=NumberFormat.getCurrencyInstance(Locale.FRANCE);
	System.out.println("FRANCE : "+vv3.format(price*0.93));

	} 
} 


