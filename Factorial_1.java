//Write a programme to accept a no from the user and find out the factorial


// importing Scanner class
import java.util.Scanner;

// Decleration of class

public class Factorial_1 {

	public static void main(String[] args) {
// Decleration of variable
		
		int i,num,fact;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter your number");//Taking input from the user
	    num=sc.nextInt();
	    fact=1;
	    
	    for (i=1;i<=num;i++) {
	    	fact=fact*i;
	    	
	    }
	    System.out.println(" Factorial of " +num+ " is = 5"+fact);
	}

}
