package test1;

import java.util.Scanner;

public class Stock {
	private String symbol;                          //股票的代码
	private String name;                            //股票的名字
	private double previousClosingPrice = 4.5 ;     //前一日股票值
	private double currentPrice;                    //当时股票值
	
	Stock ( String m, String n ) {
		symbol = m;
		name = n;
	}
	
	String getsymbol() { return symbol; }
	String getname() { return name; }
	double getpreviousClosingPrice() { return previousClosingPrice; }
	double getcurrentPrice() { return currentPrice; }
	void setcurrentPrice( double n ) { currentPrice = n; }
	double getChangePercent() {
		double chazhi;
		if( currentPrice > previousClosingPrice ) {
			chazhi = currentPrice - previousClosingPrice;
		} else chazhi = previousClosingPrice - currentPrice;
		return chazhi/previousClosingPrice;
	}

public static void main(String[] args) {
	String n;
	Scanner Input = new Scanner(System.in);
	Stock yxx = new Stock( "Java", "Sun Microsystems Inc" );
	System.out.println("previousClosingPrice: " + yxx.getpreviousClosingPrice());
	System.out.print("set today price: ");
	yxx.setcurrentPrice( Input.nextDouble() ); 
	if( yxx.getcurrentPrice() > yxx.getpreviousClosingPrice()) {
		n = "rise";
	} else { n = "fall"; }
	System.out.println("today Percent: " + n + " " + yxx.getChangePercent()*100 + "%");
}

}
