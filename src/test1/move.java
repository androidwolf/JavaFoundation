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
	
	// applet初始化
	public void init() {
		spin = new Image[ 2 ];
		for( int i = 0; i < 2; i ++ ) {
			spin[ i ] = getImage(getDocumentBase(),"image/t" + i + ".gif" );  //加载图片
		}
	}
	public void start() {
		candle = new Thread(this);    //创建线程
		candle.start();               //启动线程
	}
	public void stop() {
		candle = null;                //终止线程
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
		g.drawImage(spin[imageNumber],20,20,this);   //绘制当前图片
		imageNumber = ++imageNumber % 2;   //让图片在0-1之间一依次切换
	}
}
