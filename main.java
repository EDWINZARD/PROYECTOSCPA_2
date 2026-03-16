import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String producto = "";
        double precio = 0;
        int cantidad = 0;
        double total = 0;

        int opcion;

        do {

            System.out.println("===== TIENDA ESCOLAR =====");
            System.out.println("1. Registrar producto");
            System.out.println("2. Calcular total de compra");
            System.out.println("3. Mostrar información");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();

            switch(opcion) {

                case 1:
                    sc.nextLine();
                    System.out.print("Nombre del producto: ");
                    producto = sc.nextLine();

                    System.out.print("Precio del producto: ");
                    precio = sc.nextDouble();
                    break;

                case 2:
                    System.out.print("Cantidad a comprar: ");
                    cantidad = sc.nextInt();

                    total = precio * cantidad;
                    System.out.println("Total de la compra: " + total);
                    break;

                case 3:
                    System.out.println("Producto: " + producto);
                    System.out.println("Precio: " + precio);
                    System.out.println("Cantidad: " + cantidad);
                    System.out.println("Total: " + total);
                    break;

                case 4:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción inválida");

            }

        } while(opcion != 4);

    }
}