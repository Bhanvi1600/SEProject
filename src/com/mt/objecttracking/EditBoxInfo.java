package com.mt.objecttracking;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class EditBoxInfo extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static EditBoxInfo frame;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	
	JTextArea textArea;
	private JTextField textField_10;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new EditBoxInfo();
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
	public EditBoxInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		@SuppressWarnings("unused")
		JLabel lblboxnumber = new JLabel("Boxnumber:");
		
		JLabel lbluniquecode = new JLabel("Uniquecode:");
		
		JLabel lbltype = new JLabel("Type:");
		
		JLabel lblquantity = new JLabel("Quantity:");
		
		

		
		JButton btnaddMember = new JButton("Update Box Information");
		btnaddMember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unused")
				String boxnumber=textField_10.getText();
				String uniquecode=textField.getText();
				String type=textField_1.getText();
				String quantity=textField_2.getText();
			

				
				
				BoxInfo b=new BoxInfo(boxnumber,uniquecode,type,quantity);
				System.out.println(uniquecode);
				int status=BoxInfocheck.update(b);
				
				if(status>0){
					JOptionPane.showMessageDialog(EditBoxInfo.this,"Box Information updated successfully!");
					QCMemberSection.main(new String[]{});
					frame.dispose();
				}else{
					JOptionPane.showMessageDialog(EditBoxInfo.this,"Sorry, Unable to update!");
				}
			}
		});
		
		textField = new JTextField();
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
	
		
		
		

		
		textArea = new JTextArea();
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QCMemberSection.main(new String[]{});
				frame.dispose();
			}
		});
		
		JLabel lblboxnumber1 = new JLabel("BoxNumber:");
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		
		//JSeparator separator = new JSeparator();
		
		JButton btnLoadRecord = new JButton("Load Record");
		btnLoadRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String bboxnumber=textField_10.getText();
				if(bboxnumber==null||bboxnumber.trim().equals("")){
					JOptionPane.showMessageDialog(EditBoxInfo.this,"Please enter boxnumber first!");
				}else{
				String boxnumber=bboxnumber;
				BoxInfo b=BoxInfocheck.getBoxInfoByboxnumber(boxnumber);
				textField.setText(b.getuniquecode());
				textField_1.setText(b.gettype());
				textField_2.setText(b.getquantity());
				

				}
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addComponent(lblboxnumber1)
							.addComponent(lbluniquecode)
							.addComponent(lbltype)
							.addComponent(lblquantity)
							)
							
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								
								.addComponent(lbluniquecode))
						.addGap(33)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								
								
								.addComponent(textField_2)
								.addComponent(textField_1)
								.addComponent(textField))
								
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(textField_10)
								.addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
								.addComponent(btnLoadRecord)))
							.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(128)
									.addComponent(btnaddMember)
						.addGap(18)
						.addComponent(btnBack))
						.addContainerGap())
				    );
								
		
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblboxnumber1)
								.addComponent(textField_10)
								.addComponent(btnLoadRecord))
							.addGap(16)
							
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lbluniquecode)
								.addComponent(textField))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lbltype)
								.addComponent(textField_1))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblquantity)
								.addComponent(textField_2))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							
			              
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnaddMember)
								.addComponent(btnBack))
							.addContainerGap())
								
		);
		contentPane.setLayout(gl_contentPane);
		pack();
	}

	protected String getboxnumber() {
		// TODO Auto-generated method stub
		return null;
	}
}


