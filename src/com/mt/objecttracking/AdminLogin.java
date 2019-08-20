package com.mt.objecttracking;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
//import javax.swing.*;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class AdminLogin extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static AdminLogin frame;
	//private JFrame frame;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
    
	

	/**
	 * Launch the application.
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AdminLogin();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		new AdminLogin();		
		
	}
	
	
			
	
	


	/**
	 * Create the frame.
	 * 
	 * @throws IOException 
	 */
	public AdminLogin() {
		
		//setLayout(null);
		//PicPanel mainPanel=new PicPanel("C:\\Users\\hp\\Pictures\\New folder\\mt.jpg");
		//mainPanel.setBounds(100,100,450,300);
		 //add(mainPanel);
	
		
			/*setSize(800,600);
			setVisible(true);
			setLayout(new BorderLayout());
			JLabel background=new JLabel(new ImageIcon("C:\\Users\\hp\\Pictures\\New folder\\mt.jpg"));
			add(background);
			background.setLayout(new FlowLayout());*/
		
			
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblAdminLogin = new JLabel("MT Admin Login");
		lblAdminLogin.setForeground(Color.green);
		//contentPane.setLayout(new BoxLayout(contentPane,BoxLayout.Y_AXIS));
		//contentPane.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblAdminLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		//contentPane.setBackground(Color.LIGHT_GRAY);
		//setOpacity(false);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setForeground(Color.blue);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.blue);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		
		JButton btnLogin = new JButton("login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String name=textField.getText();
			char ch[]=passwordField.getPassword();
			String password=String.valueOf(ch);
			if(name.equals("MT")&&password.equals("admin")){
				String s[]={};
				AdminSection.main(s);
				frame.dispose();
			}else{
				JOptionPane.showMessageDialog(AdminLogin.this,"Sorry, username or password error!");
				textField.setText("");passwordField.setText("");
			}
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(160)
							.addComponent(lblAdminLogin))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(25)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblName)
								.addComponent(lblPassword))
							.addGap(58)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(passwordField)
								.addComponent(textField, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(185)
							.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(111, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblAdminLogin)
					.addGap(19)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPassword))
					.addGap(36)
					.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(51, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	
}
