import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		
		try {
			int port = 99;
			ServerSocket serverSocket = new ServerSocket(port);
			// chap nhan nhieu ket noi
			while(true) {
				Socket  clientSocket = serverSocket.accept();
				MyProcess mp = new MyProcess(clientSocket);
				mp.start();
			}
			
//			clientSocket.close();
//			serverSocket.close();
			
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
