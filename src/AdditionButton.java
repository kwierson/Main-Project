import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class AdditionButton extends Graphics implements ActionListener{

	public static final int WIDTH = 900;
	public static final int HEIGHT = 900;
	private JTextField ioField;
	private double result = 0.0;
	public static void main(String[] args){
		
		AdditionButton gui = new AdditionButton();
		gui.setVisible(true);
	}
	
	public void AdditionButton(){
		
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
	
		JPanel matrixAPanel = new JPanel();
		
		matrixAPanel.setLayout(new GridLayout(1,2));
		
		ioField = new JTextField("Enter a number here");
		matrixAPanel.add(ioField);
		add(matrixAPanel, BorderLayout.NORTH);
		
		add(matrixAPanel);
		
		JPanel buttonPanel2 = new JPanel();
		buttonPanel2.setLayout(new FlowLayout());
		JButton actionButton = new JButton("Click Me");
		actionButton.addActionListener(this);
		buttonPanel2.add(actionButton);
		
		add (buttonPanel2);
		
	}
	
	public void actionPerformed(ActionEvent e){
		String actionCommand = e.getActionCommand();
		
		if(actionCommand.equals("Click Me"));
		else
			System.out.println("Unexpected Error.");
	}
}
