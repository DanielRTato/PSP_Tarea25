import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ConexionSocket cst = new ConexionSocket();

        while (true) {
            System.out.print("Introduce la dirección IP (o 'localhost'), o escribe 'salir' para terminar. ");
            String direccion = scanner.nextLine().toLowerCase();

            if (direccion.equals("salir")){
                System.out.println("Saliendo...");
                break;
            }
            System.out.println("Elige una opción:");
            System.out.println("1 - Probar los puertos famosos (21, 22, 80, 443)");
            System.out.println("2 - Probar un puerto específico");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            if (opcion == 1) {
                int[] puertosFamosos = {21, 22, 80, 443};

                for (int puerto : puertosFamosos) {
                    cst.establecerConexion(direccion, puerto);
                }
            } else if (opcion == 2) {
                System.out.print("Introduce el puerto que quieres probar:");
                int puerto = scanner.nextInt();
                scanner.nextLine();

                cst.establecerConexion(direccion, puerto);

            } else {
                System.out.println("Opción incorrecta, intentalo otra vez");
            }

            System.out.println("--------------------------------------");
        }
        scanner.close();
    }
}