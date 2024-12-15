package calculator;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator {
	
	/* public static String resultat(String x) {
  	   
  	   String fin="";//le variable de stockage de la resultat
  	   int n=x.length();//la taille de l'operation
  	   
  	   //la liste des operateurs
  	   ArrayList<String> operateur= new ArrayList<>();
  	   operateur.add("+");operateur.add("-");operateur.add("/");operateur.add("*");
  	   int o=operateur.size();
  	   
  	   //la liste ou se stock loperation sans espace
  	   ArrayList<String> liste= new ArrayList<>();
  	   
  	   //le traitement
  	   if(x.isEmpty()) {fin="";}
  	   else if(operateur.contains(x.indexOf(0)) || operateur.contains(x.indexOf(o-1))) {fin="ERREUR! SYNTAX INVALID !";}
  	   else {
  		   //verifier si les operateurs sont successives
  		   
  		   //supprimer les espaces
  		  for(int i=0;i<n;i++) {
  			   if(x.indexOf(i)!=-1) {liste.add(String.valueOf(x.charAt(i)));}
  		   }
  		   int l=liste.size();
  		    for(int i=0;i<) {}
  		   
   
  	   }

      	return fin;
			
		}*/

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Simple Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 300);
		frame.setResizable(false);
		frame.setLocation(350, 50);
		frame.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 20));
		JLabel input = new JLabel("Enter the operation :");
		
		JTextField textField = new JTextField(22);
		
		
		//la fonction qui fait le calcule
          
        //les nombbres//////////////////////////////////////////
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		JButton btn0 = new JButton("0");
		
		
		btn1.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	String operation=textField.getText();
		    	textField.setText(operation + "1");
		    }
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String operation=textField.getText();
				textField.setText(operation + "2");
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String operation=textField.getText();
				textField.setText(operation + "3");
			}
		});
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String operation=textField.getText();
				textField.setText(operation + "4");
			}
		});
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String operation=textField.getText();
				textField.setText(operation + "5");
			}
		});
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String operation=textField.getText();
				textField.setText(operation + "6");
			}
		});
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String operation=textField.getText();
				textField.setText(operation + "7");
			}
		});
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String operation=textField.getText();
				textField.setText(operation + "8");
			}
		});
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String operation=textField.getText();
				textField.setText(operation + "9");
			}
		});
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String operation=textField.getText();
				textField.setText(operation + "0");
				
				
			}
		});
		
		//les operation/////////////////////////////////
		JButton btnPLUS = new JButton("+");
		JButton btnMOIN = new JButton("-");
		JButton btnDIV = new JButton("/");
		JButton btnMULTI = new JButton("*");
		JButton btnEGAL = new JButton("=");
		
		
		btnPLUS.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	String operation=textField.getText();
		    	textField.setText(operation + " + ");;
		       
		        
		    }
		});
		btnMULTI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String operation=textField.getText();
				textField.setText(operation + " * ");;
				
				
			}
		});
		btnMOIN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String operation=textField.getText();
				textField.setText(operation + " - ");;
				
				
			}
		});
		btnDIV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String operation=textField.getText();
				textField.setText(operation + " / ");;
				
				
			}
		});
		
		
		JLabel input2 = new JLabel();
		btnEGAL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String operation=resultat(textField.getText());
				input2.setText(operation);
				
				
			}
		});
		
		
		//////////////////////////////////////////////////////////////////////////////
		frame.add(input);
		frame.add(input2);
		frame.add(textField);
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.add(btn5);
		frame.add(btn6);
		frame.add(btn7);
		frame.add(btn8);
		frame.add(btn9);
		frame.add(btn0);
		frame.add(btnPLUS);
		frame.add(btnMOIN);
		frame.add(btnDIV);
		frame.add(btnMULTI);
		frame.add(btnEGAL);
		frame.setVisible(true);

	}

}