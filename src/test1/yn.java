package test1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class yn extends JFrame {
	private JTextField field;
	private JCheckBox bold,italic;
	
	public yn() {
		super("�����Ұ��㣡");
		Container container = getContentPane();
		container.setLayout(new FlowLayout( ));
		field = new JTextField("����love����",15);
		field.setFont(new Font("Serif", Font.PLAIN, 14));
		container.add(field);
		//����������ѡ�򣬳�ʼ״̬ιĬ�� ��ѡ��״̬
		bold = new JCheckBox("�Ӵ�");
		container.add(bold);
		italic = new JCheckBox("б��");
		container.add(italic);
		//Ϊ������ѡ��ע���¼�������
		CheckBoxHandler handler = new CheckBoxHandler();
		bold.addItemListener(handler);
		italic.addItemListener(handler);
		setSize(220,100);
		setVisible(true);
	}
	private class CheckBoxHandler implements ItemListener {
		private int valBold = Font.PLAIN;
		private int valItalic = Font.PLAIN;
		public void itemStateChanged(ItemEvent event) { //��Ŀʱ�䴦�����
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

