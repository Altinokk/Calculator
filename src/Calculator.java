import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.util.Optional;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;

public class Calculator extends JFrame {
	private JTextField Input;
	int operation;
	private double answer, number;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator ();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

	public void generation () {
		switch(operation) {
		case 1:
			answer = number + Double.parseDouble(Input.getText());
			Input.setText(Double.toString(answer));
			break;
		case 2 :
			answer = number - Double.parseDouble(Input.getText());
			Input.setText(Double.toString(answer));
			break;
		case 3 :
			answer = number * Double.parseDouble(Input.getText());
			Input.setText(Double.toString(answer));
			break;
		case 4:
			answer = number / Double.parseDouble(Input.getText());
			Input.setText(Double.toString(answer));
			break;
		case 5 :
			answer = ((number )* (Double.parseDouble(Input.getText())) / (100));
			Input.setText(Double.toString(answer));
			break;
		case 6 :
			answer = Math.pow(number, Double.parseDouble(Input.getText()));
			Input.setText(Double.toString(answer));
			break;
		
		}
		}
	public Calculator() {
		setBackground(SystemColor.textHighlight);
		getContentPane().setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 413, 467);
		getContentPane().setLayout(null);
		setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		panel.setBounds(10, 11, 379, 83);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		Input = new JTextField();
		Input.setBackground(Color.DARK_GRAY);
		Input.setForeground(Color.WHITE);
		Input.setFont(new Font("Tahoma", Font.BOLD, 16));
		Input.setBounds(0, 32, 379, 51);
		Input.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(Input);
		Input.setColumns(10);
		
		JLabel lbl = new JLabel("");
		lbl.setForeground(Color.WHITE);
		lbl.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl.setBounds(163, 11, 215, 14);
		panel.add(lbl);
		lbl.setText("");
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 105, 379, 315);
		getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(4, 5, 5, 5));
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Input.setText(Input.getText()+e.getActionCommand());
			}
		});
		
		btn7.setBackground(new Color(95, 158, 160));
		btn7.setForeground(Color.BLACK);
		panel_1.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setForeground(Color.BLACK);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn8.setBackground(new Color(95, 158, 160));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Input.setText(Input.getText()+e.getActionCommand());
			}
		});
		
		panel_1.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setForeground(Color.BLACK);
		btn9.setBackground(new Color(95, 158, 160));
		btn9.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Input.setText(Input.getText()+e.getActionCommand());
			}
		});
		
		panel_1.add(btn9);
		
		JButton btnNewButton_5 = new JButton("+");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setBackground(Color.DARK_GRAY);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(Input.getText());
				lbl.setText(number + (e.getActionCommand()));
				Input.setText("");
				operation=1;
			}
		});
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				String str = Input.getText();
		           
				 StringBuilder del = new StringBuilder();
		            for (int i = 0; i < (str.length() - 1); i++) {
		                del.append(str.charAt(i));
		            }
		            if (del.toString().equals("")) {
		            	Input.setText("");
		            } else {
		            	Input.setText(del.toString());
		            }
				
			}
		});
		btnNewButton_4.setIcon(new ImageIcon("C:\\Users\\Dummy\\Desktop\\ileri hesap makinesi\\delete2.png"));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_4.setBackground(Color.WHITE);
		btnNewButton_4.setForeground(Color.BLACK);
		panel_1.add(btnNewButton_4);
		
		
		JButton btn4 = new JButton("4");
		btn4.setForeground(Color.BLACK);
		btn4.setBackground(new Color(154, 205, 50));
		btn4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Input.setText(Input.getText()+e.getActionCommand());
			}
		});
		
		panel_1.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setForeground(Color.BLACK);
		btn5.setBackground(new Color(154, 205, 50));
		btn5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Input.setText(Input.getText()+e.getActionCommand());
			}
		});
		
		panel_1.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setForeground(Color.BLACK);
		btn6.setBackground(new Color(154, 205, 50));
		btn6.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Input.setText(Input.getText()+e.getActionCommand());
			}
		});
		
		panel_1.add(btn6);
		
		JButton btnEksi = new JButton("-");
		btnEksi.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEksi.setForeground(Color.WHITE);
		btnEksi.setBackground(Color.DARK_GRAY);
		btnEksi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
					number=Double.parseDouble(Input.getText());
					lbl.setText(number + (e.getActionCommand()));
					Input.setText("");
					operation =2;		
			}
			});
		panel_1.add(btnEksi);
		
		JButton btnNewButton_7 = new JButton(".");
		btnNewButton_7.setForeground(Color.BLACK);
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
		 
	                if (!Input.getText().contains(".")) {
	                    Input.setText(Input.getText() + ".");
	            } else {
	            	Input.setText(".");   
	            }
			}
		});
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_7.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_7);
		
		
		JButton btn1 = new JButton("1");
		btn1.setForeground(Color.BLACK);
		btn1.setBackground(new Color(154, 205, 50));
		btn1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Input.setText(Input.getText()+e.getActionCommand());
			}
		});
		
		panel_1.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setForeground(Color.BLACK);
		btn2.setBackground(new Color(154, 205, 50));
		btn2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Input.setText(Input.getText()+e.getActionCommand());
			}
		});
		
		panel_1.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setForeground(Color.BLACK);
		btn3.setBackground(new Color(154, 205, 50));
		btn3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Input.setText(Input.getText()+e.getActionCommand());
			}
		});
		
		panel_1.add(btn3);
		
		JButton btnNewButton_16 = new JButton("*");
		btnNewButton_16.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_16.setForeground(Color.WHITE);
		btnNewButton_16.setBackground(Color.DARK_GRAY);
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(Input.getText());
				lbl.setText(number + (e.getActionCommand()));
				Input.setText("");
				operation =3;
			
			}
		});
		panel_1.add(btnNewButton_16);
		
		
		
		JButton btnNewButton_11 = new JButton("^");
		btnNewButton_11.setForeground(Color.BLACK);
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(Input.getText());
				lbl.setText(Input.getText() + e.getActionCommand());
				Input.setText("");
				operation =6;
				
			}
		});
		btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_11.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_11);
		
		JButton btnNewButton_13 = new JButton("=");
		btnNewButton_13.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_13.setForeground(Color.WHITE);
		btnNewButton_13.setBackground(Color.DARK_GRAY);
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				generation();
				lbl.setText("");
				
			}
		});
		panel_1.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("0");
		btnNewButton_14.setForeground(Color.BLACK);
		btnNewButton_14.setBackground(new Color(95, 158, 160));
		btnNewButton_14.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Input.setText(Input.getText()+e.getActionCommand());
			}
		});
		panel_1.add(btnNewButton_14);
		
		JButton btnNewButton_17 = new JButton("C");
		btnNewButton_17.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_17.setBackground(Color.DARK_GRAY);
		btnNewButton_17.setForeground(Color.WHITE);
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Input.setText("");
				lbl.setText("");
			}
		});
		panel_1.add(btnNewButton_17);
		
		JButton btnNewButton_18 = new JButton("/");
		btnNewButton_18.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_18.setForeground(Color.WHITE);
		btnNewButton_18.setBackground(Color.DARK_GRAY);
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(Input.getText());
				lbl.setText(number + (e.getActionCommand()));
				Input.setText("");
				operation =4;
			}
		});
		panel_1.add(btnNewButton_18);
		
		JButton btnNewButton_19 = new JButton("%");
		btnNewButton_19.setForeground(Color.BLACK);
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number=Double.parseDouble(Input.getText());
				lbl.setText(Input.getText() + e.getActionCommand());
				Input.setText("");
				operation =5;				
			}
			
		});
		btnNewButton_19.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_19.setBackground(Color.WHITE);
		panel_1.add(btnNewButton_19);
	}
}
