package com.zandor300.zsirc;

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
		for(PrintWriter out : connections) {
			out.println(message);
			out.flush();
		}
	}

	public void add(PrintWriter out) {
		connections.add(out);
	}

	public void remove(PrintWriter out) {
		connections.remove(out);
	}
}
