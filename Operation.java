//Write a programme to perform the following operation ?

    //1:Accept age and check eligible for voting or not
	//2:Accept 3 no from the user and find out the greatest
	//3:write a programme to accept a no from the user and check it is even or odd


import java.util.Scanner;    // import Scanner class

public class Operation {    // defining class

	public static void main(String[] args) {
		
		//decleration of variable
	     int age,choice,num1,num2,num3;
	     Scanner sc=new Scanner(System.in);
	     
	     // Taking input from user 
	     System.out.println("1: To check voting eligibility\n2: To check greatest number\n3: To check even and odd number");
         choice=sc.nextInt();
	     switch(choice) {
	     
	    //condition 1
	     case 1:
	    	  System.out.println(" Enter your age ");
	    		 age=sc.nextInt();
	    		 
	    		 // using if else
	    		 
	    		 if (age>=18) {
	    			 System.out.println("you are eligible for voting ");
	    		 }
	    	
	  	 else {
	    		 System.out.println("You are not eligible for voting");
	            }
	    		 
	    		 //using break keyword for breaking programme 
	    		 break;
	    		 
	    		 //for case 2 condition
	     case 2:
	    	 
	    	 //Taking input from the user
	    	 
	    	 System.out.print("Enter Three Number ");
	    	 num1=sc.nextInt();
	    	 num2=sc.nextInt();
	    	 num3=sc.nextInt();
	    	 if (num1>num2&& num1>num3) {
	    		 System.out.println("Greater number is : " +num1);
	    	 }
	    	 if(num2>num1 && num2>num3) {
	    		 System.out.println("Greater number is : "+num2);
	    	    }
	    	 else 
	    	 {
	    		System.out.println("Greater number is : "+num3 ); 
	         }
	    	 
	    	 break;
	    	 
	    	 // for case 3 condition 
	     case 3:
	    	 System.out.println("Enter your number");
	    	 num1=sc.nextInt();
	    	 if(num1%2==0)
	    	 {
	    		 System.out.println("This is even number : "+num1);
	    	 }
	    	 else
	    	 {
	    		 System.out.println("This is ODD number : "+num1);
	    	 }
	    	 break;
	        }
	    	 
	     }
	    	 
 }
