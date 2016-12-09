package com.assignment01;

 class MyBook extends Book
{


	@Override
	void setTitle(String s) {
		// TODO Auto-generated method stub
		System.out.println("The title is : "+s);
		this.title=s;
	}
	

}
