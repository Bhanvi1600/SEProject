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

public class EditPdtBoxInfo extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static EditPdtBoxInfo frame;
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
	private JTextField textField_10;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new EditPdtBoxInfo();
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
	public EditPdtBoxInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		@SuppressWarnings("unused")
		JLabel lblparentitem = new JLabel("ParentItem:");
		
		JLabel lblboxnumber = new JLabel("BoxNumber:");
		
		JLabel lblboxqty = new JLabel("BoxQty:");
		
		JLabel lblorderqty = new JLabel("OrderQty:");
		
		JLabel lblamtofusage = new JLabel("AmountOfUsage:");
		
		JLabel lblnoofboxes=new JLabel("Boxes Present");
		
		JLabel lblboxesleft=new JLabel("Boxes Left");
		
		JLabel lblboxesback=new JLabel("Boxes Back");
		
		JButton btnaddMember = new JButton("Update Product Box Information");
		btnaddMember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String parentitem=textField_10.getText();
				String boxnumber=textField.getText();
				String boxqty=textField_1.getText();
				String orderqty=textField_2.getText();
				String amtofusage=textField_3.getText();
		        String noofboxes=textField_4.getText();
		        String boxesleft=textField_5.getText();
		        String boxesback=textField_6.getText();
		        
				//String parentitem1=getparentitem();
				PdtBoxInfo p=new PdtBoxInfo(parentitem,boxnumber,boxqty,orderqty,amtofusage,noofboxes,boxesleft,boxesback);
				int status=PdtBoxInfoCheck.update(p);
				
				if(status>0){
					JOptionPane.showMessageDialog(EditPdtBoxInfo.this,"Product Box Info updated successfully!");
					QCMemberSection.main(new String[]{});
					frame.dispose();
				}else{
					JOptionPane.showMessageDialog(EditPdtBoxInfo.this,"Sorry, Unable to update!");
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
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		textField_5=new JTextField();
		textField_5.setColumns(10);
		
		textField_6=new JTextField();
		textField_6.setColumns(10);
		
		textField_7=new JTextField();
		textField_7.setColumns(10);
		
		textArea = new JTextArea();
		
		JButton btnBack = new JButton("back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QCMemberSection.main(new String[]{});
				frame.dispose();
			}
		});
		
		JLabel lblparentitem1 = new JLabel("Parent Item:");
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		
		
		
		JButton btnLoadRecord = new JButton("Load Record");
		btnLoadRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String pparentitem=textField_10.getText();
				if(pparentitem==null||pparentitem.trim().equals("")){
					JOptionPane.showMessageDialog(EditPdtBoxInfo.this,"Please enter parentitem first!");
				}else{
					String parentitem=pparentitem;
				PdtBoxInfo p=PdtBoxInfoCheck.getPdtBoxinfoByparentitem(parentitem);
				textField.setText(p.getboxnumber());
				textField_1.setText(p.getboxqty());
				textField_2.setText(p.getorderqty());
				textField_3.setText(p.getamtofusage());
				textField_4.setText(p.getnoofboxes());
				textField_5.setText(p.getboxesleft());
				textField_6.setText(p.getboxesback());
				}
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblparentitem1)
						.addComponent(lblboxnumber)
						.addComponent(lblboxqty)
						.addComponent(lblorderqty)
						.addComponent(lblamtofusage)
						.addComponent(lblnoofboxes)
						.addComponent(lblboxesleft)
						.addComponent(lblboxesback))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
							
							.addComponent(lblboxnumber))
					.addGap(33)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_6)
								.addComponent(textField_5)
							.addComponent(textField_4)
							.addComponent(textField_3)
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
					.addContainerGap()));
				
				
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblparentitem1)
						.addComponent(textField_10)
						.addComponent(btnLoadRecord))
					.addGap(16)
					
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblboxnumber)
						.addComponent(textField))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblboxqty)
						.addComponent(textField_1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblorderqty)
						.addComponent(textField_2))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblamtofusage)
						.addComponent(textField_3))
	                .addPreferredGap(ComponentPlacement.UNRELATED)
	              
	                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblnoofboxes)
							.addComponent(textField_4))
	                .addPreferredGap(ComponentPlacement.UNRELATED)
	                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblboxesleft)
							.addComponent(textField_5))
	                .addPreferredGap(ComponentPlacement.UNRELATED)
	                .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblboxesback)
							.addComponent(textField_6))
	                .addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnaddMember)
						.addComponent(btnBack))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		pack();
	}

	protected String getparentitem() {
		// TODO Auto-generated method stub
		return null;
	}
}