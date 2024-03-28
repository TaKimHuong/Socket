import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyProcess extends Thread{
	private Socket socket;
	

	public MyProcess(Socket socket) {
		this.socket = socket;
	}


	@Override
	public void run() {
		
			try {
				// doc du lieu tu socket
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(socket.getInputStream()));
				// ghi du lieu tu socket
				PrintWriter writer = new PrintWriter(socket.getOutputStream());
				Scanner sc = new Scanner(System.in);
				while(true) {
					// nhan tin nhan
					String message ;
					message= reader.readLine();
					System.out.println("Client: " + message );
					// gui tin nhan
					System.out.println("Server: ");
					message = sc.nextLine();
					writer.flush();
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
	


