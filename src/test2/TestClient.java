package test2;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TestClient {

	public static void main(String[] args) throws IOException {
		Long l = 1000L;
		Socket s = new Socket("127.0.0.1", 6666);
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		dos.writeLong(l);
	}

}
