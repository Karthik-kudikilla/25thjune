

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class raj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ab obj=new ab();

	}

}
class ab extends JFrame implements ActionListener{
	JTextField t1,t2;
	JRadioButton r1,r2;
	JButton b;
	JLabel l;
	ab(){
		l=new JLabel("Enter your name");
		t1=new JTextField(20);
		t2=new JTextField(20);
		r1=new JRadioButton("male");
		r2=new JRadioButton("Female");
		b=new JButton("ok");
		add(l);
		add(t1);
		add(r1);
		add(r2);
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		add(b);
		b.setBounds(10,100,50,20);
		setVisible(true);
		setSize(400,400);
		setLayout(new FlowLayout());
		b.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae)
	
	{
		String s=t1.getText();
		if(r1.isSelected())
		{
			setVisible(true);
			setSize(400,400);
			setLayout(new FlowLayout());
			add(t2);
			t2.setText(s);
			t2.setBounds(10,150,50,20);
		}
		else {
			l.setText("Ms."+s);
		}
	}
	
}

