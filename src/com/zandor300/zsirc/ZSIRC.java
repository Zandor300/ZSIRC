package com.zandor300.zsirc;

/**
 * Created by Zandor300.
 * Date: 14-1-2015
 * Time: 17:35
 * PC: ZANDOR-PC
 */
public class ZSIRC {

	private static Server server;

	public static void main(String[] args) {
		System.out.println("Copyright: ZSinfo inc. 2015");
		System.out.println();
		System.out.println("Starting ZSIRC...");

		server = new Server(6667);
	}

	public static Server getServer() {
		return server;
	}
}
