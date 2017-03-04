package test1;
import javax.swing.*;

import java.awt.*;

public class ShowKilometers extends JFrame {
	ShowKilometers () {
		setTitle("ShowKilometers");
		setSize(500,600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ShowKilometers yxx = new ShowKilometers();
		double Kilomiters = 1.609;
		double Kilomiterss = Kilomiters;
		JOptionPane.showMessageDialog(null ,"miles\t\t\tkilometers\n1\t\t\t"+Kilomiters);
		System.out.print("miles");
		System.out.print("\t\t\t");
		System.out.print("kilometers");
		System.out.println();
		for(int i = 1; i <= 10; i ++ ) {
			Kilomiterss = Kilomiters * i;
			System.out.print( i );
			System.out.print("\t\t\t");
			System.out.print( Kilomiterss );
			System.out.println();
		} 
	}

}
