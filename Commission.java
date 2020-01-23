public class Commission extends Hourly 
{
	private double commissionRate;
	private double totalSales;

	// copy-and-pasted the parameters from Hourly class and added commRate
	public Commission(String eName, String eAddress, String ePhone, 
		String socSecNumber, double rate, double commRate)
	{
		super(eName, eAddress, ePhone, socSecNumber, rate);
		commissionRate = commRate;
		totalSales = 0;
	}

	// increase the totalSales instance variable by the given amount 'sales'
	public void addSales(double sales)
	{
		totalSales += sales;
	}

	public double pay() 
	{
		// similar to Executive class, but calculating extra pay instead of using 'bonus'
		double payment = super.pay() + totalSales * commissionRate;
		// reset total sales, just like in Executive
		totalSales = 0;
		// assignment question: 
		// don't need to set hoursWorked back to 0 because super.pay()
		// does that already for us. See pay() in Hourly class.
		return payment;
	}

	public String toString()
	{
		String result = super.toString();
		result += "\nTotal Sales: " + totalSales;
		return result;
	}


} 