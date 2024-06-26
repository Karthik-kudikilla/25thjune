import javax.swing.*;
public class keylistener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    m b=new m();
	}

}
class m extends JFrame{
	JTextArea a1;
	JLabel l;
	public m() {
		setLayout(null);
		setVisible(true);
		setSize(400,400);
		l=new JLabel("");
		l.setBounds(50,20,100,30);
		add(l);
	}
}