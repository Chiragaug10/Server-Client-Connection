package Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket ss=new ServerSocket(499);
			Socket s=ss.accept();
			System.out.println("Client Connected");
			InputStreamReader in=new InputStreamReader(s.getInputStream());
			BufferedReader br=new BufferedReader(in);
			String str=br.readLine();
			System.out.println("Client:- "+str);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
