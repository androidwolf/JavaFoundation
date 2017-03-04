package test1;

import java.awt.*;
import java.awt.event.*;

public class TestActionEvent extends Frame {
	public static void main(String[] args) {
		Frame f = new Frame("Test");
		Button b = new Button("please press me");
		Monitor bh = new Monitor();
		b.addActionListener(bh);
		f.add(b, BorderLayout.CENTER);
		f.pack();
		f.setVisible(true);
	}
}

class Monitor implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.out.println("yn, I love you");
	}
}	