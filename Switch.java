//Write a programme using switch case which will display the option of all operators

// importing Scanner class
import java.util.*;

 // decleration of class
public class Switch {

	public static void main(String[] args) {       // Decleration of main function

		// Decleration of variable
		
		int num1,num2,choice,sum,sub,mult,div,a,b,c,res;
		 Scanner sc=new Scanner(System.in);
		
		 // Taking input from the user for choice
		 System.out.println("Enter your choice\n1 is for Arithmatic operator\n2 is for assignment operator \n3 is for logical operator\n4 is for comparison operator\n5 is for Bitwise operator\n6 is for ternary operator ");
		 choice=sc.nextInt();
		 switch(choice)
		 {
		 case 1 : 
			 // Input from the user
			 
			 System.out.println("Enter number");
			 num1=sc.nextInt();
			
			 System.out.println("Enter number");
			 num2=sc.nextInt();
			 sum=num1+num2;
			 sub=num1-num2;
			 mult=num1*num2;
			 div=num1/num2;
			 
			 System.out.println("Addition of 2 number is "+sum);       //Addition of two numbers
			 System.out.println("Substraction of 2 number is "+sub);   // substraction of two numbers
			 System.out.println("Multiplication of 2 number is "+mult);// multiplication of two numbers 
			 System.out.println("division of 2 number is "+div);       // division of two numbers 
			  
			 break;
			 
		 case 2: //assignment operator
			 
			 //Taking input from the user for assignment operator
			 System.out.println("Enter a two numbers");
			 a=sc.nextInt();
			 b=sc.nextInt();
			 
			 a = a;
		      System.out.println(" = Operator : a = " + a);            // simple assignment operator
		      a += b;
		      System.out.println(" += Operator : a += b is : " + a);   // add assignment operator
		      a -= b;
		      System.out.println(" -= Operator : a -= b is : " + a);   // subtract assignment operator
		      a *= b;
		      System.out.println(" *= Operator : a *= b is : " + a);   // multiply assignment operator
		      a /= b;
		      System.out.println(" /= Operator : a /= b is : " + a);   // division assignment operator
		      a %= b;
		      System.out.println(" %= Operator : a %=b is : " + a);    // modulus assignment operator
		      a <<= b;
		      System.out.println(" <<= Operator : a <<= 2 is : " + a); // Left shift assignment operator
		      a >>= b;
		      System.out.println(" >>= Operator : a >>= 2 is : " + a); // Right shift assignment operator
		      a &= b;
		      System.out.println(" &= Operator : a &= b is : " + a);   // Bitwise AND assignment operator
		      a |= b;
		      System.out.println(" |= Operator : a |= 2 is : " + a);   // Bitwise OR assignment operator
		      a ^= b;
		      System.out.println(" ^= Operator : a ^= 2 is : " + a);   // Bitwise OR assignment operator
		      
		      break;
		      
		      // Logical operator
		 case 3 : 
			  System.out.println("Enter numbers");
			  a=sc.nextInt();
			  b=sc.nextInt();
			  c=sc.nextInt();
			  System.out.println(" AND logical operator && : "+(a>b && a>c) );
			  System.out.println(" OR logical operator || : "+(a>b || a>c) );
			  System.out.println(" NOT logical operator ! : "+(!(a==b || a==c)) );
			  break;
			  
			  // comparison operator
		 case 4 :
			  System.out.println("Enter two numbers");
			  num1=sc.nextInt();
			  num2=sc.nextInt();
			 
			  System.out.println("(==)equal operator is = " +(num1==num2)); // equal operator
			  System.out.println("(!=) non equality operator is = "+(num1!=num2)); // non equal operator
			  System.out.println("(<) less than operator is = "+(num1<num2)); // less than operator
			  System.out.println("(>) greater than operator is = "+(num1>num2));// Greater than operator
			  System.out.println("(<=) Less than equal to is = "+(num1<=num2)); // less than or equal to operator
			  System.out.println("(>=) greater than equal to is = "+(num1>=num2)); // greater than equal to operator
			  
			  break;
			  
		 case 5 :
			 System.out.println(" Enter Two number ");
		     num1=sc.nextInt();
		     num2=sc.nextInt();
		     
		     System.out.println("Number 1 | Number 2 = " + (num1 | num2));
		     System.out.println("Number 1 & Number 2 = " + (num1 & num2));
		     System.out.println("Number 1 ^ Number 2 = " + (num1 ^ num2));
		     
		     break;
		     // Ternary operator
		 case 6 :
			 System.out.print( "Enter number 1 : ");
			 num1=sc.nextInt();
			 System.out.print( "Enter number 2 : ");
			 num2=sc.nextInt();
			
		   	res=(num1>num2)?(num1+num2):(num2-num1);
			 System.out.println("If number 1 is greater performing addition otherwise performing substraction : "+res);
			 
		 }
	}

}
