package test1;

public class Account {
	private int id;                           //˽���˻�������
	private double balance;                   //˽���˻�������
	private double annualInterestRate;        //���浱ǰ����
	private Date dateCreated;                 //�����˻��Ŀ�������
	
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
	
	double getMonthlyInterestRate() { return annualInterestRate/12; }      //����������
	void withDraw ( double m ) { balance = balance - m; }
	void deposit ( double m ) { balance = balance + m; }
	
	public static void main(String[] args) {
		Account yxx = new Account( 1122, 20000 );
		yxx.setdateCreated(2014, 3, 24);                		           //���ÿ�������
		yxx.setannualInterestRate(0.045);
		yxx.withDraw(2500);                       			               //ȡ��2500��Ԫ
		yxx.deposit(3000);                       		                   //���3000��Ԫ
		System.out.println("��     ��:" + yxx.getbalance());                  //��ӡ���
		System.out.println("������:" + yxx.getMonthlyInterestRate()*100 + "%");   //��ӡ������
		yxx.dateCreated.print();                                           //��������
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
		System.out.print("�������ڣ�" + year + "." + month + "."  + day);
	}
}
