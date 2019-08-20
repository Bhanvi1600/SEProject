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
public class ViewPdtBoxInfo extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static ViewPdtBoxInfo frame;
	public ViewPdtBoxInfo() {
		//Code to view data in JTable
		List<PdtBoxInfo> list=PdtBoxInfoCheck.view();
		int size=list.size();
		
		String data[][]=new String[size][8];
		int row=0;
		for(PdtBoxInfo p:list){
			data[row][0]=String.valueOf(p.getparentitem());
			data[row][1]=p.getboxnumber();
			data[row][2]=p.getboxqty();
			data[row][3]=p.getorderqty();
			data[row][4]=p.getamtofusage();
			data[row][5]=p.getnoofboxes();
			data[row][6]=p.getboxesleft();
			data[row][7]=p.getboxesback();
			row++;
		}
		String columnNames[]={"ParentItem","Boxnumber","Boxqty","Orderqty","AmtOfUsage","Boxes Present","Boxes left","Boxes Back"};
		
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
					frame = new ViewPdtBoxInfo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}