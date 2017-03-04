package test2;

import javax.swing.*;
import java.awt.*;

public class Maze extends JFrame {
	public Maze () {
		super ("รินฌสตภý");
		setSize(500,500);
		setVisible(true);
	}
	
	public void paint( Graphics g) {
		super.paint(g);
		g.setColor(Color.RED);
		for(int i = 20, j = 1, k = 70; j < 10; i +=25,k +=25, j ++ ) {
			g.fillRect(i, 70, 20, 20);
			g.fillRect(i, 295, 20, 20);
			g.fillRect(20, k, 20, 20);
			g.fillRect(245, k, 20, 20);
		}
		g.fillRect(245,295 , 20, 20);
		g.setColor(Color.BLUE);
		for(int i = 45, j = 1, k = 95; j < 9; i +=25,k +=25, j ++ ) {
			g.fillRect(i, 95, 20, 20);
			g.fillRect(i, 270, 20, 20);
			g.fillRect(45, k, 20, 20);
			g.fillRect(220, k, 20, 20);
		}
		for(int i = 70, j = 1, k = 120; j < 7; i +=25,k +=25, j ++ ) {
			g.fillRect(i, 120, 20, 20);
			g.fillRect(i, 245, 20, 20);
			g.fillRect(70, k, 20, 20);
			g.fillRect(195, k, 20, 20);
		}
		for(int i = 95, j = 1, k = 145; j < 5; i +=25,k +=25, j ++ ) {
			g.fillRect(i, 145, 20, 20);
			g.fillRect(i, 220, 20, 20);
			g.fillRect(95, k, 20, 20);
			g.fillRect(170, k, 20, 20);
		}
		for(int i = 120, j = 1, k = 170; j < 3; i +=25,k +=25, j ++ ) {
			g.fillRect(i, 170, 20, 20);
			g.fillRect(i, 195, 20, 20);
			g.fillRect(120, k, 20, 20);
			g.fillRect(145, k, 20, 20);
		}
	}
	
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		Maze myMaze = new Maze();
		myMaze.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
