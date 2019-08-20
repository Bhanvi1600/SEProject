package com.mt.objecttracking;

import javax.swing.*;

import java.awt.*;
class Imagetest extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Imagetest() {
		setSize(800,600);
		setVisible(true);
		setLayout(new BorderLayout());
		JLabel background=new JLabel(new ImageIcon("C:\\Users\\hp\\Pictures\\New folder\\mt.jpg"));
		add(background);
		background.setLayout(new FlowLayout());
		
	}
	public static void main(String[] args) {
		new Imagetest();
	}
}