import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class m {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
b obj=new b();
	}

}
class b extends JFrame implements ActionListener{
	JButton b1,b2;
	JLabel l,l2,l3;
	public b() {
		setLayout(null);
		setTitle("forum");
		l3=new JLabel("Registration form");
		l3.setBounds(200,20,200,30);
		add(l3);
		l=new JLabel("hello");
		
		l.setBounds(10,50,100,30);
		add(l);
		l2=new JLabel("pranaya");
		l2.setBounds(10,100,100,30);
		add(l2);
		b1=new JButton("Addition");
		b1.setBounds(10,150,100,30);
		add(b1);
		b2=new JButton("Subtraction");
		b2.setBounds(200,150,100,30);
		add(b2);
		b1.addActionListener(this);
		setVisible(true);
		setSize(400,400);
		
		/*if(b1.isSelected()) {
			b1.addActionListener(this);}
		else {
			b2.addActionListener(this);
		}*/
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		new a1();
		
	}
}
