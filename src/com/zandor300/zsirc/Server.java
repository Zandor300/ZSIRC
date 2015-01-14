package com.zandor300.zsirc;

/**
 * Created by Zandor300.
 * Date: 14-1-2015
 * Time: 18:16
 * PC: ZANDOR-PC
 */
public class Server {

	private String ip = "127.0.0.1";
	private final int port;

	public Server(String ip, int port) {
		this.ip = ip;
		this.port = port;
	}

	public Server(int port) {
		this.port = port;
	}

	public String getIp() {
		return ip;
	}

	public int getPort() {
		return port;
	}

}
