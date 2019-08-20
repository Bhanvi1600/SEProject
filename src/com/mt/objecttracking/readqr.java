package com.mt.objecttracking;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.imageio.ImageIO;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;


public class readqr {
	public static void main(String[] args)throws WriterException,IOException,NotFoundException{
		try {
			String filepath="C:\\Users\\hp\\Pictures\\QR\\qr.jpg";
			String charset="UTF-8";
			Map<EncodeHintType,ErrorCorrectionLevel>hintMap=new HashMap<EncodeHintType,ErrorCorrectionLevel>();
			hintMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
			System.out.println("Data read from QR code"+readQRCode(filepath,charset,hintMap));
		}catch(Exception e) {
			
		}
	}
public static String readQRCode(String filepath,String charset,@SuppressWarnings("rawtypes") Map hintMap)
throws FileNotFoundException,IOException,ReaderException{
	BinaryBitmap binaryBitmap=new BinaryBitmap(new HybridBinarizer(
		new BufferedImageLuminanceSource(
			ImageIO.read(new FileInputStream(filepath)))));
			Result qrCodeResult=new MultiFormatReader().decode(binaryBitmap);
			return qrCodeResult.getText();
		}
	}

