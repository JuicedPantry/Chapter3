package Chapter3;


import java.util.Scanner;
import java.text.NumberFormat;
 
public class ChargeAccount
{
   public static void main (String[] args)
   {
           double previousBalance;  // employee's current  salary
           double additionalCharges;              // amount of the raise
           double interest;          // new salary for the employee
           double newBalance;
           double minimumPayment;
           String payment;             // performance rating
 
           Scanner scan = new Scanner(System.in);
 
           System.out.print ("Enter the previous balance: ");
           previousBalance = scan.nextDouble();
           System.out.print ("Enter the additional charges: ");
           additionalCharges = scan.nextDouble();
           
           if(previousBalance==0){
               interest=0;
            }
           else{
               interest=(0.02)*(previousBalance+additionalCharges);
            }
 
           // Compute the raise using if ...
 
           newBalance = previousBalance + additionalCharges + interest;
           
           if(newBalance<50){
               minimumPayment=newBalance;
            }
           else if(newBalance>=50 && newBalance<=300){
               minimumPayment=50.00;
            }
           else{
               minimumPayment=(newBalance*0.2);
            }
 
           // Print the results
           NumberFormat money = NumberFormat.getCurrencyInstance();
           System.out.println();
           System.out.println("Previous Balance:           " + money.format(previousBalance));
           System.out.println("Additional Charges: " + money.format(additionalCharges));
           System.out.println("Interest:          " + money.format(interest));
           System.out.println();
           System.out.println("New Balance: " + money.format(newBalance));
           System.out.println();
           System.out.println("Minimum Payment: " + money.format(minimumPayment));
        }
}
