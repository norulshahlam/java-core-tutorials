package com.shah.javacoretutorials.beginner.VariableArgs;
/*
variable arguments: Var args methods accept zero or more arguments (args) of a given type. Such methods can have a variable number of arguments and thus useful for passing of dynamic data.
*/
public class intro1 
{
	public static void main(String[] args) 
	{
    //user can input any number of arguments
		average(1,2,3,4,5,6,7,8,9); 
	}
  //how to use var arg
	public static void average(int...numbers)
	{
		int total=0;
		for(int x:numbers)
		total=total+x;
		System.out.println("total sum of number:"+total+", total element: "+numbers.length);
	}
}

