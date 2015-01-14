package com.zandor300.zsirc;

import com.zandor300.zsirc.exception.InvalidPortException;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Zandor300.
 * Date: 14-1-2015
 * Time: 18:16
 * PC: ZANDOR-PC
 */
public class Server {

	private String ip = "127.0.0.1";
	private final int port;

	private ServerSocket serverSocket;

	public Server(String ip, int port) throws InvalidPortException {
		this.ip = ip;
		if(port > 65535)
			throw new InvalidPortException("Port is too high.");
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

	public ServerSocket getServerSocket() {
		return serverSocket;
	}

	public void start() throws IOException {
		serverSocket = new ServerSocket(port);

		while(true) {
			Socket socket = serverSocket.accept();
			System.out.println("Connection incoming from " + socket.getLocalAddress() + ":" + socket.getLocalPort() + "...");

		}
	}

}
