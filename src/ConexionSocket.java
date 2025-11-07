import java.io.IOException;
import java.net.Socket;

public class ConexionSocket {

    public void establecerConexion(String ip, int puerto) {
        try {
            Socket socket = new Socket(ip,puerto);

            System.out.println("El puerto: " + puerto + " está abierto - " + socket.getInetAddress());

        } catch (IOException e) {
            System.out.println("El puerto: " + puerto + " está cerrado");
        }
    }


}
