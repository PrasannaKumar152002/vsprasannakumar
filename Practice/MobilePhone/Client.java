package Oops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
	static Socket s;
	static BufferedReader bf;
	static BufferedReader br;
	static PrintStream pf;
	static String str;
	static String st;
	static //Thread t1;
	int i = 0;
	//static ExecutorService executor = Executors.newCachedThreadPool();
	public Client() {
		try {
			s = new Socket("localhost", 2000);
			while (true) {
				if(i==0)
				{
					System.out.println("Successfully Connected to the server");
					i++;
				}
				System.out.println("Waiting for server Response........");
				bf=new BufferedReader(new InputStreamReader(s.getInputStream()));
				str=bf.readLine();
				System.out.println("Message from the Server : "+str);
				pf=new PrintStream(s.getOutputStream());
				br=new BufferedReader(new InputStreamReader(System.in));
				System.out.print("Enter the message for the Server : ");
				st=br.readLine();
				pf.println(st);
				Client.done();
			}

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("See you Soon");
		}
	}

	public static void main(String[] args) {
		new Client();
	}
	public static void done() throws IOException
	{
		while (true) {
			if(i==0)
			{
				System.out.println("Successfully Connected to the server");
				i++;
			}
			System.out.println("Waiting for server Response........");
			bf=new BufferedReader(new InputStreamReader(s.getInputStream()));
			str=bf.readLine();
			System.out.println("Message from the Server : "+str);
			pf=new PrintStream(s.getOutputStream());
			br=new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter the message for the Server : ");
			st=br.readLine();
			pf.println(st);
			Client.done();
		}
	}
}
