package com.TestPack;

import java.io.Serializable;

public class Player implements Serializable {

	String name;
	 int tShirt;
	
	Player(String name, int tShirt){
		this.name = name;
		this.tShirt = tShirt;
	}
	
}
