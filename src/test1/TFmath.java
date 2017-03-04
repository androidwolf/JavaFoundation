package test1;

import java.awt.*;
import java.awt.event.*;

public class TFmath {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TFFrame().launchFrame();

	}
}

class TFFrame extends Frame {

	public void launchFrame() {
		TextField num1 = new TextField(10);
		TextField num2 = new TextField(10);
		TextField num3 = new TextField(15);
		Label lbPlus = new Label("+");
		Button btEqual = new Button("=");
		setLayout(new FlowLayout());
		add(num1);
		add(lbPlus);
		add(num2);
		add(btEqual);
		add(num3);
		pack();
		setVisible(true);
	}
}