import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JComboBox;
//adding a comment to make sure this works
public class Graphics extends JFrame implements ActionListener{
	
	public static final int WIDTH = 900;
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
		
		
		buttonPanel.setLayout(new GridLayout(12,4));
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
		JButton wButton = new JButton("Scalar Multiplication");
		wButton.addActionListener(this);
		buttonPanel.add(wButton);
		JButton eButton = new JButton("Transpose");
		eButton.addActionListener(this);
		buttonPanel.add(eButton);
		JButton rButton = new JButton("Reset");
		rButton.addActionListener(this);
		buttonPanel.add(rButton);
		
		add(buttonPanel, BorderLayout.WEST);
	}
	
	public void actionPerformed(ActionEvent e){
		
		String buttonString = e.getActionCommand();
		
		if(buttonString.equals("Addition")){
			AdditionButton();
			
		}
			
			
		else if(buttonString.equals("Subtraction"));
		else if(buttonString.equals("Multiplication"));
		else if(buttonString.equals("Row Reduce"));
		else if(buttonString.equals("Scalar Multiplication"));
		else if(buttonString.equals("Transpose"));
		else if(buttonString.equals("Reset"));
		else
			System.out.println("Unexpected Error.");

}
	public void AdditionButton(){
		  
	
		String[] rowString = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
		JLabel actionButton = new JLabel("Matrix Size");
		JComboBox rows = new JComboBox(rowString);
		rows.addActionListener(this);
		JComboBox cols = new JComboBox(rowString);
		cols.addActionListener(this);
		
		JPanel buttonPanel2 = new JPanel();
		buttonPanel2.setLayout(new GridLayout(12,1));
		buttonPanel2.add(actionButton);
		buttonPanel2.add(rows);
		buttonPanel2.add(cols);
		
		
		add (buttonPanel2, BorderLayout.CENTER);
		
	}
	

}
