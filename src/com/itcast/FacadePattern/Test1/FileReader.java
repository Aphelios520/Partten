package com.itcast.FacadePattern.Test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
	public String read(String fileNameSrc){
		System.out.println("读取文件，获取明文:");
		StringBuffer stringBuffer = new StringBuffer();
		try {
			FileInputStream fis = new FileInputStream(fileNameSrc);
			int data;
			while((data = fis.read())!=-1){
				stringBuffer = stringBuffer.append((char) data);
			}
			fis.close();
			System.out.println(stringBuffer.toString());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return stringBuffer.toString();
	}
}
