import javax.swing.JOptionPane;

public class HotelBilling {
	
	final static float SALES_TAXS = 0.13f;

	public static void main(String[] args) {
		//Declaring Variables
		double roomRate = 95.00;
		double coupon = 0.10;
		int numberOfRooms = 2;
		double totalBill = calculateBill(roomRate, coupon, numberOfRooms);
		
		//System Output
		JOptionPane.showMessageDialog(null, "Your Total is $" +totalBill);
	}

	public static double calculateBill(double rate) {
		//Calculations
		double tax = rate * SALES_TAXS;
		double finalRate = rate + tax;
		return finalRate;
	}
	
	public static double calculateBill(double rate, double coupon) {
		//Calculations
		double tax = rate * SALES_TAXS;
		double finalRate = rate + tax;
		finalRate = finalRate * (1 - coupon);
		return finalRate;
	}
	
	public static double calculateBill(double rate, int numberOfRooms) {
		//Calculations
		double tax = rate * SALES_TAXS;
		double finalRate = rate + tax;
		finalRate = finalRate * numberOfRooms ;
		return finalRate;
	
	}
	public static double calculateBill(double rate, double coupon, int numberOfRooms) {
		//More Calculations
		double tax = rate * SALES_TAXS;
		double finalRate = rate + tax;
		finalRate = finalRate * numberOfRooms * (1 - coupon);
		return finalRate;
	}
}
