package com.itcast.FacadePattern.Test1;

public class EncryptFacade {
	private FileReader fileReader;
	private CipherMachine cipherMachine;
	private  FileWriter fileWriter;
	
	public EncryptFacade (){
		fileReader = new FileReader();
		cipherMachine = new CipherMachine();
		fileWriter = new FileWriter();
	}
	public void fileEncrypt(String fileNameSrc,String fileNameDec){
		String plain = fileReader.read(fileNameSrc);
		String encrypt = cipherMachine.encrypt(plain);
		fileWriter.write(encrypt,fileNameDec);
	}
}
