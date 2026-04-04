import java.util.ArrayList;
import java.util.Scanner;

public class TiendaEscolar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> productos = new ArrayList<>();
        ArrayList<Double> precios = new ArrayList<>();

        int opcion;

        do {

            System.out.println("\n--- TIENDA ESCOLAR ---");
            System.out.println("1. Registrar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Calcular total");
            System.out.println("4. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion){

                case 1:
                    // Jocimar
                    break;

                case 2:
                    // Johan
                    break;

                case 3:
                    // Johan
                    break;

            }

        } while(opcion != 4);

    }
}

