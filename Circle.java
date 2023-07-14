//Write a program to accept radius from the user and find out area of circle and circumstances of circle

//importing Scanner class

import java.util.*;
public class Circle {

	public static void main(String[] args) // Decleration of main function
	{
		//creating variable
		int rad;
		
		//Defining pi value
		float pi =3.14f;
		Scanner sc=new Scanner(System.in);
		
		//taking input from the user
		System.out.println("Enter radius of circle");
		 rad=sc.nextInt();
		 
		 // formula of area of circle= area=pi*(rad*rad)
		 float area =pi*rad*rad;
		System.out.println("Area of circle = "+area);
		
		// circumstances of circle 
		
		float circum = 2*pi*rad;
		System.out.println("circumstances of a circle =" +circum);
		
    

	}

}
