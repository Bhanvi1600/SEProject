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

public class AddPdtBoxInfo extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static AddPdtBoxInfo frame;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	JTextArea textArea;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame=new AddPdtBoxInfo();
					frame.setVisible(true);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public AddPdtBoxInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100,100,450,503);
		contentPane=new JPanel();
		contentPane.setBorder(new EmptyBorder(5,5,5,5));
		setContentPane(contentPane);
		JLabel lbladdpdtbox=new JLabel("Add Product Box Info");
		lbladdpdtbox.setForeground(Color.DARK_GRAY);
		lbladdpdtbox.setFont(new Font("Tahoma",Font.PLAIN,20));
		JLabel lblparentitem=new JLabel("ParentItem");
		JLabel lblboxnumber=new JLabel("Boxnumber");
		@SuppressWarnings("unused")
		JLabel lblboxqty=new JLabel("Box Qty");
		JLabel lblorderqty=new JLabel("Order Qty");
		JLabel lblamtofusage=new JLabel("Amount of usage");
		JLabel lblnoofboxes=new JLabel("Boxes Present");
		@SuppressWarnings("unused")
		JLabel lblboxesleft=new JLabel("Boxes Left");
		JLabel lblboxesback=new JLabel("Boxes Back");
		JButton btnaddpdtbox=new JButton("AddPdtBoxInfo");
		btnaddpdtbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String parentitem=textField.getText();
				String boxnumber=textField_1.getText();
				String boxqty=textField_2.getText();
				String orderqty=textField_3.getText();
				String amtofusage=textField_4.getText();
				String noofboxes=textField_5.getText();
				String boxesleft=textField_6.getText();
				String boxesback=textField_7.getText();
				PdtBoxInfo p=new PdtBoxInfo(parentitem,boxnumber,boxqty,orderqty,amtofusage,noofboxes,boxesleft,boxesback);
				int status=PdtBoxInfoCheck.save(p);
				if(status>0) {
					JOptionPane.showMessageDialog(AddPdtBoxInfo.this,"Information added successfully");
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
					textField_6.setText("");
					textField_7.setText("");
					textArea.setText("");
				}else {
					JOptionPane.showMessageDialog(AddPdtBoxInfo.this,"Sorry, unable to add information");
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
		
		textField_4=new JTextField();
		textField_4.setColumns(10);
		
		textField_5=new JTextField();
		textField_5.setColumns(10);
		
		textField_6=new JTextField();
		textField_6.setColumns(10);
		
		textField_7=new JTextField();
		textField_7.setColumns(10);
		
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
										.addComponent(lblparentitem)
										.addComponent(lblboxnumber)
										//.addComponent(lblboxqty)
										.addComponent(lblorderqty)
										.addComponent(lblamtofusage)
										.addComponent(lblnoofboxes)
										.addComponent(lblboxesback))
										//.addComponent(lblboxesleft)
										.addGap(44)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(textField_7)
												//.addComponent(textField_6)
												.addComponent(textField_5)
												.addComponent(textField_4)
												//.addComponent(textField_3)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addComponent(textField_3)
												//.addComponent(textField_2)
												.addComponent(textField_1)
												.addComponent(textField)))
										.addContainerGap(101,Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
										.addGap(150)
												.addComponent(btnaddpdtbox)
												.addPreferredGap(ComponentPlacement.RELATED,69,Short.MAX_VALUE)
												.addComponent(btnBack)
												.addGap(600))
								.addGroup(Alignment.TRAILING,gl_contentPane.createSequentialGroup()
										.addContainerGap(163,Short.MAX_VALUE)
										.addComponent(lbladdpdtbox)
										.addGap(805))
								);
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addContainerGap()
						.addComponent(lbladdpdtbox)
						
						.addGap(11)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblparentitem)
								.addComponent(textField))
						.addGap(18)
						
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblboxnumber)
								.addComponent(textField_1))
						.addGap(18)
						
						/*.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblboxqty)
								.addComponent(textField_2))*/
						//.addGap(18)
						
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblorderqty)
								.addComponent(textField_3))
						.addGap(18)
						
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblamtofusage)
								.addComponent(textField_4))
						.addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblnoofboxes)
								.addComponent(textField_5))
						//.addGap(18)
						/*.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblboxesleft)
								.addComponent(textField_6))*/
						.addGap(18)
						
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblboxesback)
								.addComponent(textField_7))
						.addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								
						.addComponent(btnaddpdtbox)
						.addComponent(btnBack))
						.addContainerGap())
				
		);
		contentPane.setLayout(gl_contentPane);
	}
}