import javax.swing.*;
public class pranaya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc obj=new abc();

	}

}
class abc extends JFrame{
	public abc(){
		JTextField t1=new JTextField(20);
		add(t1);
		setVisible(true);
		setSize(200,200);
	}
}
