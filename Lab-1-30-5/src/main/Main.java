package main;
import java.util.Scanner;

import org.apache.poi.ss.formula.functions.Finance;
import org.apache.poi.ss.formula.functions.FinanceLib;


public class Main {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the number of years you plan to work");
	int numYearsWorking = input.nextInt();
	
	System.out.println("Enter the current rate of annual return");
	int CurrAnnualReturn = input.nextInt();
	
	System.out.println("Enter the number of years after retirement");
	int numYearsAfterRetirement = input.nextInt();
	
	System.out.println("Enter the future rate of annual return");
	int FutAnnualReturn = input.nextInt();
	
	System.out.println("Enter your required income");
	int ReqIncome = input.nextInt();
	
	System.out.println("Enter your monthly Social Security Reimbursement");
	int SSIPay = input.nextInt();
	
	/*FinanceLib.pv(CurrAnnualReturn/(100*12), arg1, arg2, arg3, arg4)
	Finance.pmt;*/
	
	
}	
}