package com.mt.objecttracking;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;



public class QCMemberSection extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static QCMemberSection frame;
	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable(){
			public void run() {
				try {
					frame=new QCMemberSection();
					frame.setVisible(true);;
				}catch(Exception e) {
					e.printStackTrace();
					
				}
			}
			
		});
	}

public QCMemberSection() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100,100,450,423);
	contentPane=new JPanel();
	contentPane.setBorder(new EmptyBorder(5,5,5,5));
	setContentPane(contentPane);
	JButton btnNewButton=new JButton("Add Box Info");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			AddBoxInfo.main(new String[] {});
			frame.dispose();
			
		}
	});
	
	JButton btnAddPdt=new JButton("Add Pdt box info");
	btnAddPdt.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			AddPdtBoxInfo.main(new String[] {});
			frame.dispose();
		}
	});
	
	
	
	
	
	JLabel lblQCMemberSection=new JLabel("QCMember Section");
	lblQCMemberSection.setFont(new Font("Tahoma",Font.PLAIN,20));
	lblQCMemberSection.setForeground(Color.green);
	
	JButton btnViewBoxInfo = new JButton("View Box");
	btnViewBoxInfo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			ViewBoxInfo.main(new String[]{});
		}
	});
	
	
	JButton btnEditBoxInfo=new JButton("Edit Box Info");
	btnEditBoxInfo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			EditBoxInfo.main(new String[] {});
			frame.dispose();
		}
	});
	
	JButton btnEditPdtBoxInfo=new JButton("Edit Pdt Box Info");
	btnEditPdtBoxInfo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			EditPdtBoxInfo.main(new String[] {});
			frame.dispose();
		}
	});
	
	JButton btnViewPdtBoxInfo = new JButton("View Pdt Box");
	btnViewPdtBoxInfo.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			ViewPdtBoxInfo.main(new String[]{});
		}
	});
	
		JButton btnLogout=new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Result.main(new String[] {});
				frame.dispose();
			}
		
	});
	
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(220)
							.addComponent(lblQCMemberSection))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(52)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnAddPdt, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnEditPdtBoxInfo, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									
									
									.addComponent(btnViewPdtBoxInfo, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
									.addGap(53)
									.addComponent(btnEditBoxInfo, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
									.addGap(53)
									.addComponent(btnViewBoxInfo, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(236)
							.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(53, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(7)
					.addComponent(lblQCMemberSection)
					.addGap(25)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnEditBoxInfo, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						
						.addComponent(btnViewBoxInfo, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addGap(35)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAddPdt, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnEditPdtBoxInfo, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
						
						.addComponent(btnViewPdtBoxInfo, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE))
					.addGap(36)
					.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 36, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(138, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
		
		
	 
	
	
	
	

