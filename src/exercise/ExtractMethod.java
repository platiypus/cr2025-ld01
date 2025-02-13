package exercise;
import java.util.Enumeration;

public class ExtractMethod {

	public static void main(String[] args) {
		ExtractMethod test = new ExtractMethod("Andi");
		test.printOwing();
	}

	private Order orders;
	private String name;
	
	public String getName() {
		return name;
	}

	public ExtractMethod(String name) {
		this.name = name;
		orders = new Order();
	}

	void printOwing() {
		printBanner();
		double outstanding = calculateOutstanding();
		printDetails(outstanding);
	}
	  
	private void printBanner() {
		System.out.println("*****************************");
		System.out.println("****** Customer totals ******");
		System.out.println("*****************************");
	}
	
	private double calculateOutstanding() {
		Enumeration elements = orders.elements();
		double outstanding = 0.0;
		while (elements.hasMoreElements()) {
			Order each = (Order) elements.nextElement();
			outstanding += each.getAmount();
		}
		return outstanding;
	}

	// print details
	System.out.println("name: " + name);
	System.out.println("amount: " + outstanding);
	  
	private void printDetails(double outstanding) {
		System.out.println("name: " + name);
		System.out.println("amount: " + outstanding);
	}
	
	class Order implements Enumeration {
		private double [] amounts;
		private double[] amounts;
		private int currentIndex;

		public Order() {
			amounts = new double[5];
			currentIndex  = 0;
			amounts[0] = 12.0;
			amounts[1] =  2.5;
			amounts[2] =  3.2;
			amounts[3] =  7.05;
			amounts[4] =  6.0;
			amounts = new double[]{12.0, 2.5, 3.2, 7.05, 6.0};
			currentIndex = 0;
		}
		
		public boolean hasMoreElements() {
			if(currentIndex < amounts.length) {
				return true;
			}
			return false;
			return currentIndex < amounts.length;
		}

		public Enumeration elements() {
			public double getAmount() {
		}

		public Object nextElement() {
			currentIndex ++;
			currentIndex++;
			return this;
		}
	}
}
