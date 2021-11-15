package com.itcast.FacadePattern.Test1;

public class Client {
	public static void main(String[] args) {
		EncryptFacade encryptFacade = new EncryptFacade();
		encryptFacade.fileEncrypt("src//com//itcast//FacadePattern//hello.txt","src//com//itcast//FacadePattern//world.txt");
	}
}
