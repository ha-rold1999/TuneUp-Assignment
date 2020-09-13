import java.util.*;
import java.text.DecimalFormat;

public class TuneUp_Assignment
{
   private static DecimalFormat df = new DecimalFormat("0.00");
   public static void main(String[] args)
   {  
      Scanner con=new Scanner(System.in);    
      /*===================================================================
            A : A program that given three integers, returns the smallest value.
      ======================================================================*/
     
      System.out.println("------------------------------------------------------------ A ----------------------------------------------------------");
      System.out.println("Enter 3 integers and find the smallest number.");
      System.out.println("");

      /*=========================================================================
         This program accepts the input from the method checker() and type casting it from float to int
      =============================================================================*/    
      System.out.print("Enter first number: ");
      int a=(int)checker();
      System.out.print("Enter second number: ");
      int b=(int)checker();
      System.out.print("Enter third number: ");
      int c=(int)checker();
      /*=================================================================================
         This program compares the number from the 3 numbers and ouputs the smallest number
      ==================================================================================*/
      if(a<b&&a<c)
      {
         System.out.println("The smallest number is: "+a);
      }
      else if(b<a&&b<c)
      {
         System.out.println("The smallest number is: "+b);
      }
      else
      {
         System.out.println("The smallest number is: "+c);
      }
      /*=====================================================================================================
             B : A program that given an integer between 0 and 6, prints the corresponding day of the week. 
             Assume that the first day of the week (0) is Sunday.
      ========================================================================================================*/
      System.out.println("------------------------------------------------------------ B ----------------------------------------------------------");
      System.out.println("Enter an integer from 0-6 to find the corresponding day of the week assuming that the first day of the week (0) is Sunday");
      System.out.println("");
      /*==============================================================================================
         This program accepts the input from the method checker() and type casting it from float to int   
      ===========================================================================================*/
      System.out.print("Enter an integer: ");
      int day=(int)checker();
      /*============================================================================================================================
         This program checks the input if it is betwen 0-6 if not it will continue to ask for the valid input needed for the program
      ======================================================================================================================*/
      while(day>6&&day<0)
      {
         System.out.print("Please enter an integer from 0-6: ");
         day=(int)checker();
      }
      /*============================================
         This program checks and outputs what day the user inputs
      ===============================================*/
      if(day==6)
      {
         System.out.println("Today is Saturday!");
      }
      else if(day==5)
      {
         System.out.println("Today is Friday!");
      }
      else if(day==4)
      {
         System.out.println("Today is Thursday!");
      }
      else if(day==3)
      {
         System.out.println("Today is Wednesday!");
      }
      else if(day==2)
      {
         System.out.println("Today is Tuesday!");
      }
      else if(day==1)
      {
         System.out.println("Today is Monday!");
      }
      else
      {
         System.out.println("Today is Sunday!");
      }
      /*=====================================================================================================================================
         C : A program that given the type of vehicle (c for car, b for bus, t for truck) and the hours a vehicle spent in the parking lot,
         returns the parking charge based on the rates shown below:
	      car - PHP20.00 per hr
	      bus - PHP35.00 per hr
	      truck- PHP50.00 per hr
      =======================================================================================================================================*/
      System.out.println("------------------------------------------------------------ C ----------------------------------------------------------");
      System.out.println("Enter the vehicel type and the hours they parked to calculate the charge");
      System.out.println("(c for car, b for bus, t for truck)");
      System.out.println("car - PHP20.00 per hr");
      System.out.println("bus - PHP35.00 per hr");
      System.out.println("truck- PHP50.00 per hr");
      System.out.println("");
      /*=============================================================================
         This program allows the user to input a valid character for the type of vehicle 
      ================================================================================*/
      System.out.print("Enter vehicle type: ");
      char type=con.next().toUpperCase().charAt(0);
      /*================================================================================================================================================
         This program checks if the input from the user is valid if not it will continue to ask for a valid character for the program to output the result
      ====================================================================================================================================================*/
      while(type!='C'&&type!='B'&&type!='T')
      {
         System.out.print("Error! Please enter the right vehicle type: ");
         type=con.next().toUpperCase().charAt(0);
      }
      /*======================================================================================================================
         This program will call the method checker() to input the hours of the vehicle was parked and store it to tha varible hr.
      ======================================================================================================================*/
      System.out.print("Enter the hour/s the vehicle spent in the parking lot: ");
      float hr=checker();
      float charge;
      /*==========================================================================================================
         This program will check what type of vehicle was parked and computes and outputs its total parking charge
      ==========================================================================================================*/
      if(type=='C')
      {
         charge=20*hr;
         System.out.println("Total parking charge: PHP"+df.format(charge));
      }
      else if(type=='B')
      {
         charge=35*hr;
         System.out.println("Total parking charge: PHP"+df.format(charge));
      }
      else if(type=='T')
      {
         charge=50*hr;
         System.out.println("Total parking charge: PHP"+df.format(charge));
      }
   }
   /*===============================================================================
      Function checker - accpets and checks if the input of the user if it contains an non-number input  
   ==================================================================================*/
   public static float checker()
   {
      Scanner con=new Scanner(System.in);
      int x=1; 
      float a=0;
      while(x==1)
      {
         try
         {
            a=con.nextFloat();
            x=2;
         }
         catch(Exception e)
         {
            System.out.print("Error! Please enter a number: ");
            con.nextLine();
         }
      }
      return a;
   }
}