package com.song.library.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
	
	private int userid;
	private String account;
	private String username;
	private String password;
	private String phone;
	private Date registrationTime;
	private Date lastLoginTime;
	private int deposit;
	private List<Book> nowBorrow = new ArrayList<Book>();
	private List<Book> historyBorrow = new ArrayList<Book>();
	private int isAdmin;
	
	
	
	

}
