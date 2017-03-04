package test1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class move extends JApplet implements Runnable {
	private boolean isStandalone = false;
	private Image[] spin;
	private int total = 2;
	private int imageNumber = 0;
	private Thread candle;
	
	public move() {}
	
	// applet��ʼ��
	public void init() {
		spin = new Image[ 2 ];
		for( int i = 0; i < 2; i ++ ) {
			spin[ i ] = getImage(getDocumentBase(),"image/t" + i + ".gif" );  //����ͼƬ
		}
	}
	public void start() {
		candle = new Thread(this);    //�����߳�
		candle.start();               //�����߳�
	}
	public void stop() {
		candle = null;                //��ֹ�߳�
	}
	public void run() {
		while (candle!=null) {
			repaint();
			try{
				candle.sleep(200);
			}catch(InterruptedException e) { e.printStackTrace(); }
		}
	}
	public void paint(Graphics g) {
		g.drawImage(spin[imageNumber],20,20,this);   //���Ƶ�ǰͼƬ
		imageNumber = ++imageNumber % 2;   //��ͼƬ��0-1֮��һ�����л�
	}
}
