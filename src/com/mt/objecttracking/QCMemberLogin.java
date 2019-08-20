package com.mt.objecttracking;
 
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class QCMemberLogin extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static QCMemberLogin Frame;
	private JPanel ContentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame=new QCMemberLogin();
					Frame.setVisible(true);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		);
	}
	
	public QCMemberLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,450,300);
		ContentPane=new JPanel();
		ContentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(ContentPane);
		JLabel lblQCMemberLogin=new JLabel("QC Member Login");
		lblQCMemberLogin.setFont(new Font("Tahoma",Font.PLAIN,20));
		lblQCMemberLogin.setForeground(Color.BLUE);
		//ContentPane.setLayout(new BoxLayout(ContentPane,BoxLayout.Y_AXIS));
		//ContentPane.setAlignmentX(Component.CENTER_ALIGNMENT);
		JLabel lblName=new JLabel("Name:");
		textField=new JTextField();
		textField.setColumns(10);
		JLabel lblPassword=new JLabel("Password:");
		passwordField = new JPasswordField();
		JButton btnLogin=new JButton("Login");
//		btnLogin.setMargin(new Insets(1,1, 1,1));
		ContentPane.add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String name=textField.getText();
				String password=String.valueOf(passwordField.getPassword());
				boolean status=QCMemberCheck.validate(name,password);
				if(status) {QCMemberSection.main(new String[] {});
				       Frame.dispose();}
				else{
					JOptionPane.showMessageDialog(QCMemberLogin.this,"Sorry,username or password error!","Login Error!",JOptionPane.ERROR_MESSAGE);
					textField.setText("");passwordField.setText("");
				}
			}
		});
		
		
		JButton btnBack = new JButton("back");
		GroupLayout gl_contentPane = new GroupLayout(ContentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(28)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblPassword)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblName)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(76)
											.addComponent(lblQCMemberLogin))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(54)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
												.addComponent(passwordField)
												.addComponent(textField, GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)))))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(118)
							.addComponent(btnLogin)
							.addGap(56)
							.addComponent(btnBack)))
					.addContainerGap(78, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblQCMemberLogin)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblPassword)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
					.addComponent(btnLogin)
					.addComponent(btnBack))
					//.addGap(18)
					.addContainerGap(96, Short.MAX_VALUE))
		);
		ContentPane.setLayout(gl_contentPane);
	}
}

		
		
		
		