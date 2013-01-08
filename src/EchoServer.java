import java.io.*;
import java.net.*;


public class EchoServer {
//public static InetAddress echoServer_address;
public static ServerSocket es;
public static PrintStream es_out;
	public static void main(String[] args) throws IOException {
		
		 es = new ServerSocket (4564);
		 //echoServer_address = InetAddress.getLocalHost();
		 System.out.println(InetAddress.getLocalHost());
		System.out.println("waiting for connection");
		Socket connected = es.accept();
		System.out.println("connected to: " + connected.getInetAddress().getHostName() + " port number: " + connected.getPort());
		BufferedReader es_in = new BufferedReader(new InputStreamReader(connected.getInputStream()));
		String recMessage = es_in.readLine();
		es_out = new PrintStream(connected.getOutputStream());
		System.out.println ("Server received: " + recMessage);
		es_out.println("Server receive: " + recMessage);
		es_in.close();
		es_out.close();
		es.close();
			
			
	}

}

