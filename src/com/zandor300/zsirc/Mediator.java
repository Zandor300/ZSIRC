package com.zandor300.zsirc;

import com.zandor300.zsirc.enums.Client;

import java.io.PrintWriter;
import java.util.LinkedList;

/**
 * Created by Zandor300.
 * Date: 14-1-2015
 * Time: 18:32
 * PC: ZANDOR-PC
 */
public class Mediator {
	private LinkedList<PrintWriter> connections = new LinkedList<PrintWriter>();

	public Mediator() {}

	public void writeMessage(String message) {
		System.out.println("Recieved message: " + message);
		for(Client client : Client.getAllClients()) {
			client.getPrintWriter().println(message);
			client.getPrintWriter().flush();
		}
	}

	public void add(PrintWriter out) {
		connections.add(out);
	}

	public void remove(PrintWriter out) {
		connections.remove(out);
	}
}
