package test1;

import javax.swing.*;
import java.awt.*;

public class xiuxiu extends JFrame {
	xiuxiu() {
		setTitle("����Ĳ��Գ���");
		setSize(480,240);
		setVisible( true );
	}
	public void paint( Graphics g ) {
		super.paint(g);
		g.setFont(new Font("Serif",Font.BOLD,12));
		g.setColor(Color.red);
		g.drawString("�Ұ���", 20, 50);
		
		g.setFont(new Font("Serif",Font.BOLD+Font.ITALIC,15));
		g.setColor(new Color(255,0,0));
		g.drawString("�㰮��", 200, 50);
		
		g.drawLine(20, 60, 450, 60);    //����ֱ��
		
		g.setColor(Color.YELLOW);
		g.drawRect(20, 70, 100, 50);    //���ƾ���
		g.fillRect(130, 70, 100, 50);
		
	}
	
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		xiuxiu xiu = new xiuxiu();
		xiu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
