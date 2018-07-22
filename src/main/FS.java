package main;

import java.awt.Container;

import javax.swing.*;
import java.io.*;
import java.awt.event.*;

public class FS extends JFrame implements ActionListener{
	private static final long serialVersionUID = -6016195768586877455L;
	
	FileWriter river;
	
	JPanel panel = new JPanel();
	JTextField file_path = new JTextField(20);
	JTextField input_write_text = new JTextField(20);
	String write_text;
	String path;
	JButton write_text_button = new JButton("Write");
	JLabel path_label = new JLabel("File path:");
	JLabel write_label = new JLabel("What to write into file:");
	FS() {
		  super("Super Streamer: File");
		  setBounds(100,200,400,150);
		  Container con = this.getContentPane();
		  con.add(panel);
		  
		  write_text_button.addActionListener(this);
		  
		  panel.add(path_label);
		  panel.add(file_path);
		  panel.add(write_label);
		  panel.add(input_write_text);
		  panel.add(write_text_button);
		  
		  setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		write_text = input_write_text.getText();
		path = file_path.getText();
		try {
			river = new FileWriter(path);
			river.write(write_text);
			river.close();
			JOptionPane.showMessageDialog(this, "File written.", "Success!", JOptionPane.DEFAULT_OPTION);
		} catch (FileNotFoundException e1) {
			JOptionPane.showMessageDialog(this, "Error: " + e1, "ERROR", JOptionPane.ERROR_MESSAGE);
		} catch (IOException e1) {
			JOptionPane.showMessageDialog(this, "Error: " + e1, "ERROR", JOptionPane.ERROR_MESSAGE);
		}
	}
	
}
