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
public class ViewBoxInfo extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static ViewBoxInfo frame;
	public ViewBoxInfo() {
		//Code to view data in JTable
		List<BoxInfo> list=BoxInfocheck.view();
		int size=list.size();
		
		String data[][]=new String[size][4];
		int row=0;
		for(BoxInfo p:list){
			data[row][0]=String.valueOf(p.getboxnumber());
			data[row][1]=p.gettype();
			data[row][2]=p.getuniquecode();
			data[row][3]=p.getquantity();
			
			row++;
		}
		String columnNames[]={"Boxnumber","Type","UniqueCode","Quantity"};
		
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
					frame = new ViewBoxInfo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}