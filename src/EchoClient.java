import java.io.*;
import java.net.*;


public class EchoClient {
public static void main (String [] args) throws IOException {
	public static int PORT = 4564;
	//creating a new socket
	Socket s = new Socket ("localhost", PORT);
	
	System.out.println ("Trying to connect to echoServer");
	
	PrintWriter s_out = new PrintWriter(s.getOutputStream(), true);
	String message = "hi! I want connect to echoServer!";
	s_out.println(message);
	System.out.println (message);
	BufferedReader s_in = new BufferedReader (new InputStreamReader(s.getInputStream()));
	String responce = s_in.readLine();
	System.out.println(responce);
	// close streams and socket
	s_out.close();
	s_in.close();
	s.close();
}
}
