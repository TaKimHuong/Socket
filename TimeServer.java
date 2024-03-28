import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TimeServer implements Runnable{
		
	public static void main(String[] args) {
		new MyProcess2();
		try {
			int port = 99;
			ServerSocket serverSocket = new ServerSocket(port);
			// chap nhan nhieu ket noi
				Socket  clientSocket = serverSocket.accept();
				MyProcess2 mp = new MyProcess2(clientSocket);
				new Thread(mp).start();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
