package com.rays.networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
	public static void main(String[] args) throws IOException {
		DatagramSocket socket = new DatagramSocket(4045);

		System.out.println("Server is up and waiting for a client...");

		byte[] buff = new byte[256];

		DatagramPacket packet = new DatagramPacket(buff, buff.length);

		socket.receive(packet);

		String received = new String(packet.getData(), 0, packet.getLength());
		
		System.out.println("Received from client: " + received);

		
		buff = "Hello from UDP Server!".getBytes();

		packet = new DatagramPacket(buff, buff.length, packet.getAddress(), packet.getPort());
		
		socket.send(packet);

		socket.close();
		
		System.out.println("Server closed.");
	}
}
