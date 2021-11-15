package com.itcast.FacadePattern.Test1;

public class NewEncryptFacade extends AbstractEncryptFacade {
	private FileReader fileReader;
	private CipherMachine cipherMachine;
	private  FileWriter fileWriter;
	
	public NewEncryptFacade (){
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

