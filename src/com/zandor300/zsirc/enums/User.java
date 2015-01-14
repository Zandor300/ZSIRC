package com.zandor300.zsirc.enums;

import java.util.ArrayList;

/**
 * Created by Zandor300.
 * Date: 14-1-2015
 * Time: 18:12
 * PC: ZANDOR-PC
 */
public class User {

	private static ArrayList<User> allUsers = new ArrayList<User>();

	private final String username;
	private final String realName;
	private final String email;

	public User(String username, String realName, String email) {
		this.username = username;
		this.realName = realName;
		this.email = email;

		allUsers.add(this);
	}

	public static User getUser(String username) {
		for(User user : allUsers)
			if(user.getUsername().equalsIgnoreCase(username))
				return user;
		return null;
	}

	public static ArrayList<User> getAllUsers() {
		return allUsers;
	}

	public String getUsername() {
		return username;
	}

	public String getRealName() {
		return realName;
	}

	public String getEmail() {
		return email;
	}

}
