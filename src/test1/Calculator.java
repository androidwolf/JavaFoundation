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
	private JLabel tf = new JLabel("计算:");
	private String add1="";
	private String add2="";
	private String output="";
	private int calResult;
	private boolean plusClicked = false;
	public Calculator() {
		super("秀秀计算器");                      //利用超类，给窗口命名
		getContentPane().setLayout(null);     //设置窗口布局管理器为NULL
		p1.setLayout(new GridLayout(3,4,15,10));  //3行4列
		p1.setBounds(10,10,230,120);
		for(int i = 0; i < 10 ; i ++ ) {    //实例化数字按钮，并为每个按钮注册监听器，再添加到面板中
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
	
	class Number implements ActionListener {    //数字按钮的监听类
		public void actionPerformed(ActionEvent e){   // 单机数字按钮的时间处理函数
			if(!plusClicked) {
				add1 += e.getActionCommand();
				output = "计算:" + add1;
				tf.setText(output);
			}
			else {
				add2 += e.getActionCommand();
				output += e.getActionCommand();
				tf.setText(output);
			}
		}
		
	}
	class Plus implements  ActionListener {    //加号按钮事件的监听器
		public void actionPerformed(ActionEvent e) {
			plusClicked =!plusClicked;
			output+=" + ";
			tf.setText(output);
		}
	}
	class Cal implements ActionListener {
		public void actionPerformed(ActionEvent e) {   //单机“=”按钮的时间处理函数
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
