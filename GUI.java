/*
 * Filename: PayrollWithGUI.java
 * Created: 10/28/2017 by Symuel Gaynor
 * 
 * Purpose: Calculates employee earnings using GUI's for input and output
 */

import javax.swing.*;

public class PayrollWithGUI 
{
	
	// main method
	public static void main(String[] args )
	{
		
		// declare and initialize variables
		String empName, openingMessage, nameInputMessage, hoursInputMessage,
		       wageInputMessage, nameOutputMessage, hoursOutputMessage, wageOutputMessage,
		       grossEarningsMessage, taxRateMessage, taxMessage, netEarningsMessage, 
		       outputMessage, empHoursString, hourlyWageString;
		double empHours, hourlyWage, grossEarnings, tax, netEarnings;
		final double TAX_RATE = .15;
		
		// display opening message
		openingMessage = "Welcome to the payroll application.";
		JOptionPane.showMessageDialog( null, openingMessage );
		
		// get required input using dialog boxes
		nameInputMessage  = "Enter employee name";
		empName           = JOptionPane.showInputDialog( nameInputMessage );
		
		hoursInputMessage = "Enter total hours for this employee.";
		empHoursString    = JOptionPane.showInputDialog( hoursInputMessage );
		empHours          = Double.parseDouble( empHoursString );// convert string to double
		
		wageInputMessage  = "Enter hourly wage for this employee.";
		hourlyWageString  = JOptionPane.showInputDialog(wageInputMessage);
		hourlyWage        = Double.parseDouble(hourlyWageString);//convert string to double
		
		// perform calculations
		grossEarnings = empHours * hourlyWage;
		tax           = grossEarnings * TAX_RATE;
		netEarnings   = grossEarnings - tax;
		
		// build output strings
		nameOutputMessage    = "Employee name:    " + empName       + "\n";
		hoursOutputMessage   = "Hours worked:     " + empHours      + "\n";
		wageOutputMessage    = "Hourly wage:    $ " + hourlyWage    + "\n";
		grossEarningsMessage = "Gross earnings: $ " + grossEarnings + "\n";
		taxRateMessage       ="Tax rate:        "   + TAX_RATE      + "\n";
		taxMessage           ="Tax:             $ " + tax           + "\n";
		netEarningsMessage   ="Net earnings:    $ " + netEarnings   + "\n";
		
		// create output String
		outputMessage = nameOutputMessage + hoursOutputMessage + wageOutputMessage
				        + grossEarningsMessage + taxRateMessage + taxMessage
				        + netEarningsMessage;
		
		// print output
		JOptionPane.showMessageDialog( null, outputMessage );
		
		System.exit(0);
		
	} // end main

} // end class
