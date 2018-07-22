package main;

//UI Imports
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CMDS extends JFrame implements ActionListener{

	private static final long serialVersionUID = 5108747172617593498L;
	JPanel panel = new JPanel();
	JTextField input_print_text = new JTextField(20);
	String print_text;
	JButton print_text_button = new JButton("Print");
	
	CMDS() {
		  super("Super Streamer: Command Line");
		  setBounds(100,100,400,100);
		  Container con = this.getContentPane();
		  
		  print_text_button.addActionListener(this);
		  
		  con.add(panel);
		  panel.add(input_print_text);
		  panel.add(print_text_button);
		  
		  setVisible(true);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		print_text = input_print_text.getText();
		System.out.println(print_text);
	}

}
