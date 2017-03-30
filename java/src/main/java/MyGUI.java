import javax.swing.*;
import java.awt.event.*;
import java.util.*;

/**
 * A demo of GUI programming with Swing
 */
public class MyGUI extends JFrame{

	public MyGUI(){
		super("GUI");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton theButton = new JButton("Click me!");

		theButton.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("clicky");
			}
		} );

		JButton theButton2 = new JButton("Click me 2: Electric Clickaroo!");

		theButton2.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("haha I won");
			}
		} );

		JPanel container = new JPanel();
		container.setLayout(new BoxLayout(container,  BoxLayout.Y_AXIS));

		container.add(theButton);
		container.add(theButton2);

		JPanel otherContainer = new JPanel();
		otherContainer.setLayout(new BoxLayout(otherContainer, BoxLayout.X_AXIS));
		otherContainer.add(new JButton("A"));
		otherContainer.add(new JButton("B"));
		otherContainer.add(new JButton("C"));



		this.add(container);
		container.add(otherContainer);

		this.pack();
		this.setVisible(true);		
	}
	
  public static void main(String[] args) {
    new MyGUI(); //create the frame
  }
}
