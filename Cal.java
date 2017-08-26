package calc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

import javax.swing.JRadioButton;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.ButtonGroup;

public class Cal {
	
	
	private JFrame frame;
	private JTextField textField;
	private JTextField num;
	private JTextField num1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cal window = new Cal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 403, 501);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		//ButtonGroup buttons = new ButtonGroup();		
		
		
		JButton b1 = new JButton("1");
		buttonGroup.add(b1);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					num.setText(num.getText()+1);
			}
		});
		
		num = new JTextField();
		num.setFont(new Font("Tahoma", Font.PLAIN, 18));
		num.setEditable(false);
		num.setBounds(12, 60, 350, 46);
		frame.getContentPane().add(num);
		num.setColumns(10);
		b1.setBounds(35, 119, 57, 25);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("2");
		buttonGroup.add(b2);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num.setText(num.getText()+2);
			}
		});
		b2.setBounds(116, 119, 57, 25);
		frame.getContentPane().add(b2);
		
		JButton b3 = new JButton("3");
		buttonGroup.add(b3);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num.setText(num.getText()+3);
			}
		});
		b3.setBounds(198, 119, 57, 25);
		frame.getContentPane().add(b3);
		
		JButton b4 = new JButton("4");
		buttonGroup.add(b4);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num.setText(num.getText()+4);
			}
		});
		b4.setBounds(35, 167, 57, 25);
		frame.getContentPane().add(b4);
		
		JButton b5 = new JButton("5");
		buttonGroup.add(b5);
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num.setText(num.getText()+5);
			}
		});
		b5.setBounds(116, 167, 57, 25);
		frame.getContentPane().add(b5);
		
		JButton b6 = new JButton("6");
		buttonGroup.add(b6);
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num.setText(num.getText()+6);
			}
		});
		b6.setBounds(198, 167, 57, 25);
		frame.getContentPane().add(b6);
		
		JButton b7 = new JButton("7");
		buttonGroup.add(b7);
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num.setText(num.getText()+7);
			}
		});
		b7.setBounds(35, 215, 57, 25);
		frame.getContentPane().add(b7);
		
		JButton b8 = new JButton("8");
		buttonGroup.add(b8);
		b8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				num.setText(num.getText()+8);
			}
		});
		b8.setBounds(116, 215, 57, 25);
		frame.getContentPane().add(b8);
		
		JButton b9 = new JButton("9");
		buttonGroup.add(b9);
		b9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				num.setText(num.getText()+9);
			}
		});
		b9.setBounds(198, 215, 57, 25);
		frame.getContentPane().add(b9);
		
		JButton b10 = new JButton("-");
		buttonGroup.add(b10);
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1.setText(num.getText());
				num.setText(null);
				actionRecieved.setText("-");
			}
		});
		b10.setFont(new Font("Tahoma", Font.PLAIN, 18));
		b10.setBounds(49, 286, 57, 46);
		frame.getContentPane().add(b10);
		
		JButton b11 = new JButton("+");
		buttonGroup.add(b11);
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1.setText(num.getText());
				num.setText(null);
				actionRecieved.setText("+");
			}
		});
		b11.setFont(new Font("Tahoma", Font.PLAIN, 18));
		b11.setBounds(116, 286, 57, 46);
		frame.getContentPane().add(b11);
		
		JButton b12 = new JButton("*");
		buttonGroup.add(b12);
		b12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				num1.setText(num.getText());
				num.setText(null);
				actionRecieved.setText("*");
			}
		});
		b12.setFont(new Font("Tahoma", Font.PLAIN, 18));
		b12.setBounds(49, 345, 57, 46);
		frame.getContentPane().add(b12);
		
		JButton b13 = new JButton("/");
		buttonGroup.add(b13);
		b13.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				num1.setText(num.getText());
				num.setText(null);
				actionRecieved.setText("/");
			}
		});
		b13.setFont(new Font("Tahoma", Font.PLAIN, 18));
		b13.setBounds(116, 345, 57, 46);
		frame.getContentPane().add(b13);
		
		JButton bBs = new JButton("Backspace");
		buttonGroup.add(bBs);
		bBs.setBounds(198, 318, 120, 30);
		bBs.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				StringBuffer entry = new StringBuffer(num.getText()) ;
				entry = entry.deleteCharAt(entry.length()-1);
				num.setText(entry.toString());
			}
		});
		frame.getContentPane().add(bBs);
		
		JButton bCa = new JButton("Clear All");
		buttonGroup.add(bCa);
		bCa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1.setText(null);
				num.setText(null);
				num2.setText(null);
				actionRecieved.setText(null);
			}
		});
		bCa.setBounds(198, 361, 120, 30);
		frame.getContentPane().add(bCa);
		
		
		
		JButton b14 = new JButton(".");
		buttonGroup.add(b14);
		b14.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				num.setText(num.getText()+".");
			}
		});
		b14.setBounds(279, 167, 57, 25);
		frame.getContentPane().add(b14);
		
		JButton b15 = new JButton("00");
		buttonGroup.add(b15);
		b15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num.setText(num.getText()+"00");
			}
		});
		b15.setBounds(279, 119, 57, 25);
		frame.getContentPane().add(b15);
		
		JButton b16 = new JButton("0");
		buttonGroup.add(b16);
		b16.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				num.setText(num.getText()+0);
			}
		});
		b16.setBounds(279, 215, 57, 25);
		frame.getContentPane().add(b16);
		
		JButton bEq = new JButton("=");
		buttonGroup.add(bEq);
		bEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num2.setText(num.getText());
				double one = Double.parseDouble(num1.getText());
				double two = Double.parseDouble(num2.getText());
				if(actionRecieved.getText().equals("+")){
					num.setText(String.valueOf(one+two));					
				}
				else if(actionRecieved.getText().equals("-")){
					num.setText(String.valueOf(one-two));
				}
				else if(actionRecieved.getText().equals("*")){
					num.setText(String.valueOf(one*two));
				}
				else if(actionRecieved.getText().equals("/")){
					num.setText(String.valueOf(one/two));
				}
				
			}
		});
		bEq.setBounds(198, 275, 120, 30);
		frame.getContentPane().add(bEq);
		
		actionRecieved = new JLabel("");
		actionRecieved.setFont(new Font("Tahoma", Font.PLAIN, 14));
		actionRecieved.setBounds(165, 35, 30, 16);
		frame.getContentPane().add(actionRecieved);
		
		num1 = new JTextField();
		num1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		num1.setEditable(false);
		num1.setBounds(12, 24, 145, 35);
		frame.getContentPane().add(num1);
		num1.setColumns(10);
		
		num2 = new JTextField();
		num2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		num2.setEditable(false);
		num2.setColumns(10);
		num2.setBounds(217, 24, 145, 35);
		frame.getContentPane().add(num2);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBorder(new LineBorder(new Color(171, 173, 179)));
		textField.setBounds(12, 13, 350, 93);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JRadioButton on = new JRadioButton("Turn On");
		on.setBounds(49, 407, 96, 25);
		frame.getContentPane().add(on);
		
		JRadioButton off = new JRadioButton("Turn Off");
		//Making group makes sure only one radio-button is selected at a time.
		ButtonGroup rBtns = new ButtonGroup();
		rBtns.add(on);
		rBtns.add(off);
		//adding off listener
		off.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num.setText(null);
				num1.setText(null);
				num2.setText(null);
				actionRecieved.setText(null);
				b1.setEnabled(false);
				b2.setEnabled(false);
				b3.setEnabled(false);
				b4.setEnabled(false);
				b5.setEnabled(false);
				b6.setEnabled(false);
				b7.setEnabled(false);
				b8.setEnabled(false);
				b9.setEnabled(false);
				b10.setEnabled(false);
				b11.setEnabled(false);
				b12.setEnabled(false);
				b13.setEnabled(false);
				b14.setEnabled(false);
				b15.setEnabled(false);
				b16.setEnabled(false);
				bEq.setEnabled(false);
				bBs.setEnabled(false);
				bCa.setEnabled(false);
				}
			
		});
		off.setBounds(198, 407, 96, 25);
		frame.getContentPane().add(off);
		
		//adding on listener
		on.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				b1.setEnabled(true);
				b2.setEnabled(true);
				b3.setEnabled(true);
				b4.setEnabled(true);
				b5.setEnabled(true);
				b6.setEnabled(true);
				b7.setEnabled(true);
				b8.setEnabled(true);
				b9.setEnabled(true);
				b10.setEnabled(true);
				b11.setEnabled(true);
				b12.setEnabled(true);
				b13.setEnabled(true);
				b14.setEnabled(true);
				b15.setEnabled(true);
				b16.setEnabled(true);
				bEq.setEnabled(true);
				bBs.setEnabled(true);
				bCa.setEnabled(true);
			}
		});
	}
	private JLabel actionRecieved;
	private JTextField num2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
}
