//Import Scanner for user input 
//Lets see if this works

import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainProject extends JFrame implements ActionListener {
	 
	public static final int WIDTH = 600;
	public static final int HEIGHT = 200;
	
	private static JButton matrixAddition;
	private static JButton matrixMultiplication;
	private static JButton matrixSubtraction;
	private static JButton scalarMultiplication;
	
	public static void main(String[] args){
		
		MainProject gui = new MainProject();
		gui.setVisible(true);
		
		int array1[][] = { {1,2,3}, {2,3,4}, {4,5,6}};
		int array2[][] = { {1,2,3}, {2,3,4}, {4,5,6}};
		
		
		
		
		/*//matrix multiplication
		int n = array1[0].length;
		int m = array1.length;
		int p = array2[0].length;
		 
		int ans[][] = new int[m][p];
		 
		
		for(int i = 0;i < m;i++){
		   for(int j = 0;j < p;j++){
		      for(int k = 0;k < n;k++){
		         ans[i][j] += array1[i][k] * array2[k][j];
		      }
		   }
		}*/
		
		/* Matrix Addition
		int m, n, c, d;
		Scanner in = new Scanner(System.in);
			 
		System.out.println("Enter the number of rows and columns of matrix");
		m = in.nextInt();
		n  = in.nextInt();
		 
		int first[][] = new int[m][n];
		int second[][] = new int[m][n];
		int sum[][] = new int[m][n];
			 
		System.out.println("Enter the elements of first matrix");
			 
		for (  c = 0 ; c < m ; c++ )
		    for ( d = 0 ; d < n ; d++ )
		       first[c][d] = in.nextInt();
			 
		System.out.println("Enter the elements of second matrix");
			 
		    for ( c = 0 ; c < m ; c++ )
		        for ( d = 0 ; d < n ; d++ )
			        second[c][d] = in.nextInt();
			 
		    for ( c = 0 ; c < m ; c++ )
		        for ( d = 0 ; d < n ; d++ )
		            sum[c][d] = first[c][d] + second[c][d];  //replace '+' with '-' to subtract matrices
			 
		 System.out.println("Sum of entered matrices:-");
			 
		for ( c = 0 ; c < m ; c++ )
			      {
		    for ( d = 0 ; d < n ; d++ )
		        System.out.print(sum[c][d]+"\t");
			 
		 System.out.println();
		     }
		 }
		*/
		/* Matrix Subtraction
		int m, n, c, d;
		Scanner in = new Scanner(System.in);
			 
		System.out.println("Enter the number of rows and columns of matrix");
		m = in.nextInt();
		n  = in.nextInt();
		 
		int first[][] = new int[m][n];
		int second[][] = new int[m][n];
		int sum[][] = new int[m][n];
			 
		System.out.println("Enter the elements of first matrix");
			 
		for (  c = 0 ; c < m ; c++ )
		    for ( d = 0 ; d < n ; d++ )
		       first[c][d] = in.nextInt();
			 
		System.out.println("Enter the elements of second matrix");
			 
		    for ( c = 0 ; c < m ; c++ )
		        for ( d = 0 ; d < n ; d++ )
			        second[c][d] = in.nextInt();
			 
		    for ( c = 0 ; c < m ; c++ )
		        for ( d = 0 ; d < n ; d++ )
		            sum[c][d] = first[c][d] - second[c][d];  //replace '+' with '-' to subtract matrices
			 
		 System.out.println("Sum of entered matrices:-");
			 
		for ( c = 0 ; c < m ; c++ )
			      {
		    for ( d = 0 ; d < n ; d++ )
		        System.out.print(sum[c][d]+"\t");
			 
		 System.out.println();
		     }
		}
		*/
		/*		
		for (int index = 0; index < ans.length; index++){
			System.out.println();
			for (int index1 = 0; index1 < ans[index].length; index1++)
				System.out.print(ans[index][index1] + ",");
		}
		*/
	}
	 
}