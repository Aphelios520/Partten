package com.itcast.FacadePattern.Test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriter {
	public void write(String encyptSrc , String fileName){
		System.out.println("将密文写入文件");
		try {
			FileOutputStream fos = new FileOutputStream(fileName);
			fos.write(encyptSrc.getBytes());
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
