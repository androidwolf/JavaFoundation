package test1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame {
	private JPanel p1 = new JPanel();
	private JButton numberButton[] = new JButton[10];
	private String buttonName[] = {"1","2","3","4","5","6","7","8","9","0"};
	private JButton plusButton;
	private JButton calButton;
	private JLabel tf = new JLabel("����:");
	private String add1="";
	private String add2="";
	private String output="";
	private int calResult;
	private boolean plusClicked = false;
	public Calculator() {
		super("���������");                      //���ó��࣬����������
		getContentPane().setLayout(null);     //���ô��ڲ��ֹ�����ΪNULL
		p1.setLayout(new GridLayout(3,4,15,10));  //3��4��
		p1.setBounds(10,10,230,120);
		for(int i = 0; i < 10 ; i ++ ) {    //ʵ�������ְ�ť����Ϊÿ����ťע�������������ӵ������
			numberButton[ i ] = new JButton(buttonName[i]);
			numberButton[ i ].addActionListener(new Number());
			p1.add(numberButton[i]);
		}
		plusButton = new JButton("+");
		plusButton.addActionListener(new Plus());
		p1.add(plusButton);
		
		calButton = new JButton("=");
		calButton.addActionListener(new Cal());
		p1.add(calButton);
		
		getContentPane().add(p1);
		
			tf.setBounds(10, 150, 230, 20);
			getContentPane().add(tf);
			
			setSize(280,200);
			setVisible(true);
	}
	
	class Number implements ActionListener {    //���ְ�ť�ļ�����
		public void actionPerformed(ActionEvent e){   // �������ְ�ť��ʱ�䴦����
			if(!plusClicked) {
				add1 += e.getActionCommand();
				output = "����:" + add1;
				tf.setText(output);
			}
			else {
				add2 += e.getActionCommand();
				output += e.getActionCommand();
				tf.setText(output);
			}
		}
		
	}
	class Plus implements  ActionListener {    //�ӺŰ�ť�¼��ļ�����
		public void actionPerformed(ActionEvent e) {
			plusClicked =!plusClicked;
			output+=" + ";
			tf.setText(output);
		}
	}
	class Cal implements ActionListener {
		public void actionPerformed(ActionEvent e) {   //������=����ť��ʱ�䴦����
			calResult = Integer.parseInt(add1)+Integer.parseInt(add2);
			output+="=";
			tf.setText(output+Integer.toBinaryString(calResult));
			plusClicked = false;
			add1="";
			add2="";
		}
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
