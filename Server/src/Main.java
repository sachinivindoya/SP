import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        try {
            // create server socket
            ServerSocket serverSocket = new ServerSocket(65535);
            // accept and create new socket
            Socket socket =serverSocket.accept();

            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            String mg = dataInputStream.readUTF();
            System.out.println(mg);

            // close the socket
            socket.close();


        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
