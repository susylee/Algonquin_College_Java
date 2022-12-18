import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GridLayout {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setTitle("This is a Title" );
		
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		
		JButton button = new JButton();
		
		panel.setLayout(new BorderLayout());
		panel.add(button);
		
		JLabel rateLabel = new JLabel("Interest Rate: ");

		panel.add(rateLabel);
		
		
	}

}
