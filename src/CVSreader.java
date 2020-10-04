import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CVSreader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "C:\\Users\\simon\\Desktop\\prospects.txt";
		String line = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			line = br.readLine();
			while((line = br.readLine()) != null) {
				String[] values = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)");
				if(values.length<4) {
					break;
				}
				String Names = values[0];
				double Loan = Double.valueOf(values[1]);
				double interest = Double.valueOf(values[2]);
				int years = Integer.valueOf(values[3]);
				double monthlyPayment = mortgageCalc.perform(Loan, interest, years);
				System.out.println(Names+" wants to borrow "+Loan+"€ for a period of "+years+" years and pay "+monthlyPayment+"€ each month");

		//Prospect 1: CustomerName wants to borrow X € for a period of Z years and pay E € each month		

			}
			br.close();
			
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			}
}
}