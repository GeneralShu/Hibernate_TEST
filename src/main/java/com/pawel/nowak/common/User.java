package com.pawel.nowak.common;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersion = 1L;
	
	private Integer userID;
	private String userName;
	private String password;
	
	public User (String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	
	
}
