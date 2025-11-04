import java.io.IOException;
import java.net.Socket;

public class ConexionSocket {

    public void establecerConexion(String ip, int puerto) {
        try {
            Socket socket = new Socket(ip,puerto);

            System.out.println("Conectado a " + socket.getInetAddress());
            socket.close();

        } catch (IOException e) {
            System.out.println("Error: No se pudo conectar.");
        }
    }


}
