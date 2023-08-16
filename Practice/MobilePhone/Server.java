package Oops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
	ServerSocket ss;
	Socket s;
	BufferedReader br,in;static BufferedReader bd;
	PrintStream out;
	static PrintStream pt;
	int a=2000;
	static int Connections=0;
	static ArrayList<Socket> ar=new ArrayList<Socket>();
	static ArrayList<String> as=new ArrayList<String>();
	static ExecutorService executor = Executors.newCachedThreadPool();
	public Server() {
		try {
			ss=new ServerSocket(a);
			System.out.println("Server is Running in Port "+a);
			while(true)
			{
				s=ss.accept();
				if(ar==null||!ar.contains(s))
				{
					ar.add(s);
					as.add("CT"+Connections);
					System.out.println("New Client added [Client-"+as.get(ar.indexOf(s))+"]");
					Connections++;
				}
				out=new PrintStream(s.getOutputStream());
				br=new BufferedReader(new InputStreamReader(System.in));
				System.out.print("Enter the Message for the Client-"+as.get(ar.indexOf(s))+" : ");
				String str=br.readLine();
				if(str.equals("End"))
				{
					System.exit(0);
				}
				else if(str.equals("Broad"))
				{
					Server.BroadCaste();
				}
				out.println(str);
				System.out.println("Waiting for the Client Response........");
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				String str1=in.readLine();
				System.out.println("Message from the Client-"+as.get(ar.indexOf(s))+" : "+str1);
				//System.out.println(s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new Server();
	}
	public static void BroadCaste()
	{
		System.out.print("Enter the String to be BroadCasted : ");
		bd=new BufferedReader(new InputStreamReader(System.in));
		try {
			String str=bd.readLine();
			for(Socket s:ar)
			{
				pt=new PrintStream(s.getOutputStream());
				pt.println(str);
				System.out.println("Message sent to Client-"+as.get(ar.indexOf(s)));
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void done()
	{
		try {
			s=ss.accept();
			if(ar==null||!ar.contains(s)&&s!=null)
			{
				ar.add(s);
				as.add("CT"+Connections);
				System.out.println("New Client added [Client-"+as.get(ar.indexOf(s))+"]");
				Connections++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
