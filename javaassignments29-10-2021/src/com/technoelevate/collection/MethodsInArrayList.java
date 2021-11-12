package com.technoelevate.collection;

import java.util.ArrayList;
import java.util.List;

public class MethodsInArrayList {
	public static void main(String[] args) {

		List<String> list = new ArrayList();
		list.add("pranshu");//add object's on ArrayList
		System.out.println(list.get(0));//fetch object's on ArrayList
		//list.clear();//clear the list || delete all the object"s on list
		System.out.println(list.contains("pranshu"));//check given object present in list or not
		System.out.println(list.isEmpty());//to check list is empty or not
	}
}
