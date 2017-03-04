package test1;

public class Account {
	private int id;                           //私有账户数据域
	private double balance;                   //私有账户数据域
	private double annualInterestRate;        //储存当前利率
	private Date dateCreated;                 //储存账户的开户日期
	
	Account () {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date();
	}
	
	Account ( int m, double n ) {
		id = m;
		balance = n;
	}
	
	void setdateCreated( int a, int b, int c) {
		dateCreated = new Date( a, b, c );
	}
	
	void setid( int m ) { id = m; }
	int getid() { return id; }
	void setbalance( double m ) { balance = m; }
	double getbalance() { return balance; }
	void setannualInterestRate( double m ) { annualInterestRate = m; }
	double getannualInterestRate() { return annualInterestRate; }
	
	double getMonthlyInterestRate() { return annualInterestRate/12; }      //返回月利率
	void withDraw ( double m ) { balance = balance - m; }
	void deposit ( double m ) { balance = balance + m; }
	
	public static void main(String[] args) {
		Account yxx = new Account( 1122, 20000 );
		yxx.setdateCreated(2014, 3, 24);                		           //设置开户日期
		yxx.setannualInterestRate(0.045);
		yxx.withDraw(2500);                       			               //取款2500美元
		yxx.deposit(3000);                       		                   //存款3000美元
		System.out.println("余     额:" + yxx.getbalance());                  //打印余额
		System.out.println("月利率:" + yxx.getMonthlyInterestRate()*100 + "%");   //打印月利率
		yxx.dateCreated.print();                                           //开户日期
	}  

}

class Date {
	private int year;
	private int month;
	private int day;
	
	Date() {
		year = 0; month = 0; day = 0;
	}
	Date( int a, int b, int c ) {
		year = a; month = b; day = c;
	}
	
	void print() {
		System.out.print("开户日期：" + year + "." + month + "."  + day);
	}
}
