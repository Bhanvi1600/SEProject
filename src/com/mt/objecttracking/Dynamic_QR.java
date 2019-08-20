package com.mt.objecttracking;
import java.io.File;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import com.google.zxing.qrcode.QRCodeWriter;


public class Dynamic_QR {
	public static void main(String[] args) {
		try {
//			Dynamic_QR.generate_qr("testing", "testing");
			DBConnection db=new DBConnection();
			Connection connection=db.getConnection();
			String query="select * from QCMT_BoxInfo";
			Statement smt=null;
			smt=connection.createStatement();
			ResultSet rs=smt.executeQuery(query);
			
			while(rs.next()) {
				Dynamic_QR.generate_qr(rs.getString("boxnumber"),rs.getString("uniquecode"));	
				}
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
	public static void generate_qr(String image_name,String qrCodeData) {
		try {
			System.out.println("Generate");
			String filepath="C:\\Users\\hp\\Pictures\\QR"+image_name+".jpg";
			String charset="UTF-8";
//			Map<EncodeHintType,Object>hintMap=new EnumMap<EncodeHintType, Object>(EncodeHintType.class);
//			hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
			BitMatrix matrix=new QRCodeWriter().encode(new String(qrCodeData.getBytes(charset),charset), BarcodeFormat.QR_CODE, 200, 200);
			MatrixToImageWriter.writeToFile(matrix, filepath.substring(filepath.lastIndexOf('.')+1), new File(filepath));
			System.out.println("QR code image created successfully");
		}catch(Exception e) {
			System.err.println(e);
		}
	}

}
