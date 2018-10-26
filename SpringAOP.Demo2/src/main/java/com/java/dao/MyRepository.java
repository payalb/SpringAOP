package com.java.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {

	Map<Integer, Integer> map= new HashMap<>();
	
	public void addData() {
		map.put(2, 3);
		System.out.println("in rep");
	}
}
