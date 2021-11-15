package com.itcast.IteratorPattern.test1;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		List<Object> products =new ArrayList<>();
		products.add("李连杰");
		products.add("成龙");
		products.add("洪金宝");
		products.add("吴京");
		products.add("张晋");
		
		AbstractObjectList list =new ProductList(products);
		AbstractIterator iterator =new ProductIterator(list);
		
		System.out.println("正向遍历");
		while(!iterator.isLast()){
			System.out.print(iterator.getNextItem()+"  ");
			iterator.next();
		}
		System.out.println();
		System.out.println("反向遍历");
		while (!iterator.isFirst()){
			System.out.print(iterator.getPreviousItem()+"  ");
			iterator.previous();
		}
		//正向遍历
		//李连杰  成龙  洪金宝  吴京  张晋
		//反向遍历
		//张晋  吴京  洪金宝  成龙  李连杰
	}
}
