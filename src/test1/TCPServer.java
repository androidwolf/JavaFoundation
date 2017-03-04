package test1;

import java.io.*;
import java.net.*;

public class TCPServer {
	public static void main(String[] args) throws Exception {
		ServerSocket ss = new ServerSocket(8888);
		while(true) {
			Socket s = ss.accept();
			DataInputStream dis = new DataInputStream( s.getInputStream() );
			System.out.println(dis.readUTF());
			dis.close();
			s.close();
			//System.out.println("ãÆÄşÉµ×ÓÈö");
		}

	}

}
