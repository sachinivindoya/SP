import java.io.DataOutputStream;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        try{

            Socket socket = new Socket("localhost",65535);

            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            dataOutputStream.writeUTF("Hello I am a client");

            // to ensure if all data are transfered and closed the stream
            dataOutputStream.flush();
            dataOutputStream.close();

            // close the socket
            socket.close();

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
