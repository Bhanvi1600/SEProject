package com.mt.objecttracking;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("unused")
public class ViewQCMember extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static ViewQCMember frame;
	public ViewQCMember() {
		//Code to view data in JTable
		List<QCMember> list=QCMemberCheck.view();
		int size=list.size();
		
		String data[][]=new String[size][5];
		int row=0;
		for(QCMember a:list){
			data[row][0]=a.getid();
			data[row][1]=a.getName();
			data[row][2]=a.getPassword();
			data[row][3]=a.getEmail();
			data[row][4]=a.getContactno();
			row++;
		}
		String columnNames[]={"Name","Password","Email","Contact No"};
		
		JTable jt=new JTable(data,columnNames);
		JScrollPane sp=new JScrollPane(jt);
		add(sp);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 400);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new ViewQCMember();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
