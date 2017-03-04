package test2;

import java.awt.*;
import java.awt.event.*;

public class xiuxiu extends java.applet.Applet implements MouseListener {
	int a[] = new int[1000];
	int b[] = new int[1000];
	int flag[] = new int[100];
	Graphics g, g1, g2;
	int i = 0;
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;

	public void init() {
		try {
			java.awt.EventQueue.invokeAndWait(new Runnable() {
				public void run() {
					initComponents();
				}
			});
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		resize(800, 600);
		addMouseListener(this);
		g = getGraphics();
		g1 = getGraphics();
		g2 = getGraphics();
	}

	private void initComponents() {
		jLabel1 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jLabel1.setText("jLabel1");
		setLayout(null);
		jButton1.setBackground(new java.awt.Color(153, 153, 255));
		jButton1.setFont(new java.awt.Font("华文行楷", 0, 18));// 閼辩祬OI18N
		jButton1.setForeground(new java.awt.Color(0, 0, 255));
		jButton1.setText("开始");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		add(jButton1);
		jButton1.setBounds(0, 0, 100, 29);
	}

	public void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		int x = 0, y;
		for (int m = 0; m < i - 1; m++)
			for (int n = 0; n < i - 1 - m; n++) {
				if (a[n] > a[n + 1]) {
					x = a[n];
					y = b[n];
					a[n] = a[n + 1];
					b[n] = b[n + 1];
					a[n + 1] = x;
					b[n + 1] = y;
				}
			}
		Part1(0, i - 1);
		Part2(0, i - 1);
	}

	public void Part1(int l, int s) {
		int j, t = 0;
		int max = 0;
		int Area;
		for (j = l + 1; j < s; j++) {
			Area = a[l] * b[s] + a[j] * b[l] + a[s] * b[j] - a[j] * b[s] - a[s]
					* b[l] - a[l] * b[j];
			System.out.println(Area);
			if (Area >= max) {
				max = Area;
				t = j;
			}
		}
		for (int x = 0; x <= 100000; x++)
			for (int y = 0; y <= 10000; y++) {
			}
		if (s == l + 1 || t == 0) {
			g2.setColor(Color.red);
			g2.drawLine(a[l] + 3, b[l] + 3, a[s] + 3, b[s] + 3);
			System.out.println("etru");
		} else {
			g1.drawLine(a[l] + 3, b[l] + 3, a[s] + 3, b[s] + 3);
		}
		if (t != 0) {
			System.out.println(a[t]);
			System.out.println(b[t]);
			Part1(l, t);
			Part1(t, s);
		}
	}

	public void Part2(int l, int s) {
		int j, t = 0;
		int min = 0;
		int Area;
		for (j = l + 1; j < s; j++) {
			Area = a[l] * b[s] + a[j] * b[l] + a[s] * b[j] - a[j] * b[s] - a[s]
					* b[l] - a[l] * b[j];
			System.out.println(Area);
			if (Area <= min) {
				min = Area;
				t = j;
			}
		}
		for (int x = 0; x <= 100000; x++)
			for (int y = 0; y <= 10000; y++) {
			}
		if (s == l + 1 || t == 0) {
			g2.setColor(Color.red);
			g2.drawLine(a[l] + 3, b[l] + 3, a[s] + 3, b[s] + 3);
			System.out.println("etru");
		} else {
			g1.drawLine(a[l] + 3, b[l] + 3, a[s] + 3, b[s] + 3);
		}
		if (t != 0) {
			System.out.println(a[t]);
			System.out.println(b[t]);
			Part2(l, t);
			Part2(t, s);
		}
	}

	public void mouseClicked(MouseEvent e) {
		int j = 0;
	}

	public void mousePressed(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		a[i] = x;
		b[i] = y;
		g.setColor(Color.blue);
		g.drawOval(x, y, 6, 6);
		g.fillOval(x, y, 6, 6);
		g.drawString("x=" + x + " y=" + y + "", x, y);
		i++;
	}

	public void mouseReleased(MouseEvent e) {
		int j = 0;
	}

	public void mouseEntered(MouseEvent e) {
		int j = 0;
	}

	public void mouseExited(MouseEvent e) {
		int j = 0;
	}
}
