package com.itcast.CompositePattern.test;

import java.io.File;

public class Testkill {
	public static void main(String[] args) {
		AbstrcatFile fold1 = new Folder("java资料");
		AbstrcatFile fold2 = new Folder("前段资料");
		AbstrcatFile fold3 = new Folder("大数据资料");
		AbstrcatFile fold4 = new Folder("区块链资料");
		AbstrcatFile fold5 = new Folder("资料");
		
		AbstrcatFile file1 = new ImageFile("三上优雅");
		AbstrcatFile file2 = new ImageFile("深田咏美");
		AbstrcatFile file3 = new VideoFile("小泽玛丽呀");
		AbstrcatFile file4 = new VideoFile("斋藤飞鸟");
		AbstrcatFile file5 = new TestFile("余罪");
		AbstrcatFile file6 = new TestFile("十宗罪");
		
		fold1.add(file1);
		fold2.add(file2);
		fold2.add(file3);
		fold4.add(file4);
		fold3.add(file5);
		fold1.add(file6);
		fold1.add(file6);
		fold1.add(file5);
		fold4.add(file3);
		
		fold5.add(fold1);
		fold5.add(fold2);
		fold5.add(fold3);
		fold5.add(fold4);
		
		fold5.killVitus();
	}
}
