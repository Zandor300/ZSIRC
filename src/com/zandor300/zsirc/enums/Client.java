package com.zandor300.zsirc.enums;

import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by Zandor300.
 * Date: 14-1-2015
 * Time: 18:12
 * PC: ZANDOR-PC
 */
public class Client {

	private static ArrayList<Client> allClients = new ArrayList<Client>();

	private final String username;
	private final String realName;
	private final String email;

	private final String ip;
	private final int port;

	private PrintWriter out;

	public Client(String username, String realName, String email, String ip, int port) {
		this.username = username;
		this.realName = realName;
		this.email = email;

		this.ip = ip;
		this.port = port;

		allClients.add(this);
	}

	public static Client getClient(String username) {
		for(Client client : allClients)
			if(client.getUsername().equalsIgnoreCase(username))
				return client;
		return null;
	}

	public static ArrayList<Client> getAllClients() {
		return allClients;
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

	public PrintWriter getPrintWriter() {
		return out;
	}

}
