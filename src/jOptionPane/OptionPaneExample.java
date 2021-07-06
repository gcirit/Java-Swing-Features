package jOptionPane;

import javax.swing.*;
import java.awt.event.*;

public class OptionPaneExample extends WindowAdapter {
	JFrame f;

	OptionPaneExample() {
		f = new JFrame();
		//Example: showMessageDialog()
		JOptionPane.showMessageDialog(f,"Hello, Welcome to Javatpoint.");
		//Example: showMessageDialog()
		JOptionPane.showMessageDialog(f,"Successfully Updated.","Alert",JOptionPane.WARNING_MESSAGE); 
		//Example: showInputDialog()
		String name=JOptionPane.showInputDialog(f,"Enter Name");
		f.addWindowListener(this);
		f.setSize(300, 300);
		f.setLayout(null);
		f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		f.setVisible(true);
	}
	
	//Example: showConfirmDialog()
	public void windowClosing(WindowEvent e) {
		int a = JOptionPane.showConfirmDialog(f, "Are you sure?");
		if (a == JOptionPane.YES_OPTION) {
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}

	public static void main(String[] args) {
		new OptionPaneExample();
	}
}
