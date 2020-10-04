public class mortgageCalc {
	
	static public double perform(double totalLoan, double interest, int years)
	{
    int n = 12 * years;
    double c = interest / 12.0 / 100.0;
    double payment = totalLoan * c * Math.pow(1 + c, n) /
                     (Math.pow(1 + c, n) - 1);
    return payment;
	}
}
