package test1;

import java.util.Scanner;

public class Stock {
	private String symbol;                          //��Ʊ�Ĵ���
	private String name;                            //��Ʊ������
	private double previousClosingPrice = 4.5 ;     //ǰһ�չ�Ʊֵ
	private double currentPrice;                    //��ʱ��Ʊֵ
	
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
