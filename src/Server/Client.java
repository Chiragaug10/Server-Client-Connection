package Server;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket st=new Socket("localhost",499);
			PrintWriter pr=new PrintWriter(st.getOutputStream());
			Scanner sc=new Scanner(System.in);
			System.out.println("Type Your Message Here:- ");
			String message=sc.nextLine();
			pr.println(message);
			pr.flush();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
