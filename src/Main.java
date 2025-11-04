import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ConexionSocket cst = new ConexionSocket();



        while (true) {
            System.out.println("Introduce la dirección IP, o escribe 'salir' para salir");
            String direccion = scanner.nextLine().toLowerCase();

            if (direccion.equals("salir")){
                System.out.println("Saliendo...");
                return;
            }
            System.out.println("Elige:" +
                    "1- Para probr los puertos 'famosos' " +
                    "2- Para elegir otro puerto");
            int opcion = scanner.nextInt();

            if (opcion == 1) {

            } else if (opcion == 2) {
                System.out.println("Introduce el puerto ");
                int puerto = scanner.nextInt();

                cst.establecerConexion(direccion, puerto);

            }

        }
    }
}