package com.bean;

import org.springframework.stereotype.Component;

@Component
public class Salary {

	private int sId;

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}
	
}
