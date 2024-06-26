import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a1 obj=new a1();

	}

}
class a1 extends JFrame implements ActionListener{
	JTextField t1;
	JTextField t2;
	JButton b,add,sub;
	JLabel l,l1;
	public a1()
	{
		t1=new JTextField(20);
		t2=new JTextField(20);
		b=new JButton("Click");
		add=new JButton("+");
		sub=new JButton("-");
		add(add);
		add(sub);
		l1=new JLabel("Welcome to the calculator");
		l=new JLabel("Result");
		add(l1);
		add(t1);
		add(t2);
		add(b);
		add(l);
		add.addActionListener(this);
		sub.addActionListener(this);
		setVisible(true);
		setSize(400,400);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==add) {
		int n1=Integer.parseInt(t1.getText());
		int n2=Integer.parseInt(t2.getText());
		int add=n1+n2;
		l.setText(add+"");
		
	}
		if(ae.getSource()==sub)
		{
			int n1=Integer.parseInt(t1.getText());
			int n2=Integer.parseInt(t2.getText());
			int add=n1-n2;
			l.setText(add+"");
		}
	
}
}
