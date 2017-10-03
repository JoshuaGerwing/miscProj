import javax.swing.JFrame;

public class UserInterface {
	JFrame frame;
	
	public UserInterface() {
		frame = new JFrame("Basic swing window");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 500);
		frame.setVisible(true);
	}
}
