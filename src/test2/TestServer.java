package test2;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class TestServer {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(6666);
		Socket s = ss.accept();
		DataInputStream dis = new DataInputStream(s.getInputStream());
		System.out.println(dis.readLong());
	}
}
