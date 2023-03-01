/*
 *
 * Purpose: This program will help users compute the number of
 * months needed to pay off credit card debt and provide additional
 * information regarding total amount paid, interest paid, and overpayments
 *
 */

import java.util.Scanner;

public class PayoffDebt {

	public static void main(String[] args) {
		
		// initialize and declare three components
		double principal = 0.0;
		double annualInterestRate = 0.0;
		double monthlyPayment = 0.0;
		
		// Scanner and user inputs
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Principal:\t\t\t");
		principal = keyboard.nextDouble();
		
		System.out.print("Annual Interest Rate (%):\t");
		annualInterestRate = keyboard.nextDouble();
		
		System.out.print("Monthly Payment:\t\t");
		monthlyPayment = keyboard.nextDouble();
		System.out.print("\n");
		
		// Number of months needed to payoff debt formula
		// Four separate components of a,b,c, and d (months)
		double a = Math.log(monthlyPayment);
		double b = Math.log(monthlyPayment - (annualInterestRate/1200) * principal);
		double c = Math.log((annualInterestRate/1200)+1.0);
		double d = Math.ceil((a - b) / c);
		
		// Solutions for amount paid, interest paid, and overpayment
		double totalAmountPaid = d * monthlyPayment;
		double totalInterestPaid = totalAmountPaid - principal;
		double overpayment = totalAmountPaid - (((a - b) / c) * monthlyPayment);
		
		// Used "printf" to convert "d" as whole number
		System.out.print("Monthly Needed To Pay Off:\t");
		System.out.printf("%.0f", d);
		System.out.println("");
		// Used "printf" to round 2 decimal places and rest are spacing configuration
		System.out.print("Total Amount Paid:\t\t$");
		System.out.printf("%.2f", totalAmountPaid);
		System.out.println("");
		System.out.print("Total Interest Paid:\t\t$");
		System.out.printf("%.2f", totalInterestPaid);
		System.out.println("");
		System.out.print("Overpayment:\t\t\t$");
		System.out.printf("%.2f", overpayment);

	}

}
