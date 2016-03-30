import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Graphics extends JFrame implements ActionListener{
	
	public static final int WIDTH = 200;
	public static final int HEIGHT = 900;
	public static void main(String[] args){
		
		Graphics gui = new Graphics();
		gui.setVisible(true);
	}
	public Graphics(){
		
		super("Calculator Options");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JPanel buttonPanel = new JPanel();
		
		
		buttonPanel.setLayout(new GridLayout(7,1));
		JButton addButton = new JButton("Addition");
		addButton.addActionListener(this);
		buttonPanel.add(addButton);
		JButton subtractButton = new JButton("Subtraction");
		subtractButton.addActionListener(this);
		buttonPanel.add(subtractButton);
		JButton multiplyButton = new JButton("Multiplication");
		multiplyButton.addActionListener(this);
		buttonPanel.add(multiplyButton);
		JButton rrefButton = new JButton("Row Reduce");
		rrefButton.addActionListener(this);
		buttonPanel.add(rrefButton);
		JButton wButton = new JButton("w");
		wButton.addActionListener(this);
		buttonPanel.add(wButton);
		JButton eButton = new JButton("e");
		eButton.addActionListener(this);
		buttonPanel.add(eButton);
		JButton rButton = new JButton("r");
		rButton.addActionListener(this);
		buttonPanel.add(rButton);
		
		add(buttonPanel, BorderLayout.WEST);
	}
	
	public void actionPerformed(ActionEvent e){
		
		String buttonString = e.getActionCommand();
		
		if(buttonString.equals("Addition"));
			
		else if(buttonString.equals("Subtraction"));
		else if(buttonString.equals("Multiplication"));
		else if(buttonString.equals("Row Reduce"));
		else if(buttonString.equals("w"));
		else if(buttonString.equals("e"));
		else if(buttonString.equals("r"));
		else
			System.out.println("Unexpected Error.");

}
}