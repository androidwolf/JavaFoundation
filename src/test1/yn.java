package test1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class yn extends JFrame {
	private JTextField field;
	private JCheckBox bold,italic;
	
	public yn() {
		super("闫宁我爱你！");
		Container container = getContentPane();
		container.setLayout(new FlowLayout( ));
		field = new JTextField("闫宁love秀秀",15);
		field.setFont(new Font("Serif", Font.PLAIN, 14));
		container.add(field);
		//创建两处复选框，初始状态喂默认 不选中状态
		bold = new JCheckBox("加粗");
		container.add(bold);
		italic = new JCheckBox("斜体");
		container.add(italic);
		//为两个复选框注册事件监听器
		CheckBoxHandler handler = new CheckBoxHandler();
		bold.addItemListener(handler);
		italic.addItemListener(handler);
		setSize(220,100);
		setVisible(true);
	}
	private class CheckBoxHandler implements ItemListener {
		private int valBold = Font.PLAIN;
		private int valItalic = Font.PLAIN;
		public void itemStateChanged(ItemEvent event) { //项目时间处理程序
			if(event.getSource() == bold)
				valBold = bold.isSelected()?Font.BOLD:Font.PLAIN;
			if(event.getSource() == italic)
				valItalic = italic.isSelected()?Font.BOLD:Font.PLAIN;
			field.setFont(new Font("Serif",valBold+valItalic,14));
		}
	}
	
	public static void main(String[] args) {
		yn application = new yn();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

