import java.awt.FlowLayout;

import javax.swing.*;
public class karthik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a obj=new a();

	}

}
class a extends JFrame{
	public a()
	{
		setLayout(new FlowLayout());
		JLabel l=new JLabel("Hello World");
		JLabel l1=new JLabel("Hello World");
		add(l);
		add(l1);
		setVisible(true);
		setSize(400,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
