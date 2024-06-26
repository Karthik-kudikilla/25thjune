

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
public class checkboxeventhandling{
	public static void main(String ar[])
	{
		xy k=new xy();
	}
}
class xy extends JFrame implements ActionListener,ItemListener{
	JCheckBox b1,b2;
	JButton b;
	public xy() {
		b1=new JCheckBox("Dancing");
		b2=new JCheckBox("singing");
		b=new JButton("click");
		add(b1);
		add(b2);
		add(b);
		setVisible(true);
		setSize(400,400);
		setLayout(new FlowLayout());
		
		b1.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie) {
		System.out.println("mom");
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(b1.isSelected()) {
			b.addActionListener(this);
			//System.out.println("karthik");
		}
		else {
			
			System.out.println("Pranaa");
		}
	}
	
}