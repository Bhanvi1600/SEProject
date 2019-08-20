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
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddBoxInfo extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static AddBoxInfo frame;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	JTextArea textArea;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame=new AddBoxInfo();
					frame.setVisible(true);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public AddBoxInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,450,300);
		contentPane=new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		JLabel lbladdbox=new JLabel("Add Box Info");
		lbladdbox.setForeground(Color.BLUE);
		lbladdbox.setFont(new Font("Tahoma",Font.PLAIN,20));
		JLabel lblboxnumber=new JLabel("boxnumber");
		JLabel lbluniquecode=new JLabel("Uniquecode");
		JLabel lbltype=new JLabel("Type");
		JLabel lblquantity=new JLabel("Quantity");
		
		JButton btnaddbox=new JButton("Add Box Info");
		btnaddbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String boxnumber=textField.getText();
				String uniquecode=textField_1.getText();
				String type=textField_2.getText();
				String quantity=textField_3.getText();
				
				BoxInfo b=new BoxInfo(boxnumber,uniquecode,type,quantity);
				int status=BoxInfocheck.save(b);
				if(status>0) {
					JOptionPane.showMessageDialog(AddBoxInfo.this,"Information added successfully");
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					
					textArea.setText("");
				}else {
					JOptionPane.showMessageDialog(AddBoxInfo.this,"Sorry, unable to add information");
				}
			}
		});
		textField=new JTextField();
		textField.setColumns(10);
		
		textField_1=new JTextField();
		textField_1.setColumns(10);
		
		textField_2=new JTextField();
		textField_2.setColumns(10);
		
		textField_3=new JTextField();
		textField_3.setColumns(10);
		
		
		textArea=new JTextArea();
		textArea.setRows(3);
		textArea.setColumns(20);
		
		JButton btnBack=new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QCMemberSection.main(new String[]{});
				frame.dispose();
			}
		});
		GroupLayout gl_contentPane=new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addContainerGap()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblboxnumber)
										.addComponent(lbluniquecode)
										.addComponent(lbltype)
										.addComponent(lblquantity)
								       )
										.addGap(44)
										
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												
												.addComponent(textField_3)
												.addComponent(textField_2)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(textField_1)
												.addComponent(textField)))
										.addContainerGap(101,Short.MAX_VALUE))
												.addGroup(gl_contentPane.createSequentialGroup()
														.addGap(120)
														.addComponent(btnaddbox)
														.addPreferredGap(ComponentPlacement.RELATED,69,Short.MAX_VALUE)
														.addComponent(btnBack)
														.addGap(610))
												.addGroup(Alignment.TRAILING,gl_contentPane.createSequentialGroup()
														.addContainerGap(169,Short.MAX_VALUE)
														.addComponent(lbladdbox)
														.addGap(850))
									
				);
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addContainerGap()
						.addComponent(lbladdbox)
						.addGap(11)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblboxnumber)
								.addComponent(textField))
						.addGap(18)
						
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lbluniquecode)
								.addComponent(textField_1))
						.addGap(18)
						
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lbltype)
								.addComponent(textField_2))
						.addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblquantity)
								.addComponent(textField_3))
						
						.addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnaddbox)
								.addComponent(btnBack))
						.addContainerGap())
						
				
		);
		contentPane.setLayout(gl_contentPane);
	}
}