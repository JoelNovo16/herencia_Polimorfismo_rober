import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear vehículos predefinidos
        Vehiculo coche = new Vehiculo("ABC123", "Rojo", "Toyota");
        Vehiculo moto = new Vehiculo("DEF456", "Azul", "Honda");
        Vehiculo camion = new Vehiculo("GHI789", "Verde", "Ford");
        Vehiculo tractor = new Vehiculo("JKL012", "Blanco", "John Deere");
        Vehiculo grua = new Vehiculo("MNO345", "Negro", "Volvo");

        // Menú
        while (true) {
            System.out.println("Seleccione un vehículo:");
            System.out.println("1. Coche");
            System.out.println("2. Moto");
            System.out.println("3. Camion");
            System.out.println("4. Tractor");
            System.out.println("5. Grua");
            System.out.println("0. Salir");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    mostrarInformacion(coche);
                    repararPieza(coche);
                    break;
                case 2:
                    mostrarInformacion(moto);
                    repararPieza(moto);
                    break;
                case 3:
                    mostrarInformacion(camion);
                    repararPieza(camion);
                    break;
                case 4:
                    mostrarInformacion(tractor);
                    repararPieza(tractor);
                    break;
                case 5:
                    mostrarInformacion(grua);
                    repararPieza(grua);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        }
    }

    public static void mostrarInformacion(Vehiculo vehiculo) {
        System.out.println("Información del vehículo:");
        System.out.println("Matrícula: " + vehiculo.getMatricula());
        System.out.println("Color: " + vehiculo.getColor());
        System.out.println("Marca: " + vehiculo.getMarca());
    }

    public static void repararPieza(Vehiculo vehiculo) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione una pieza para reparar:");

        // Obtener la lista de piezas del vehículo seleccionado
        for (int i = 0; i < vehiculo.getPiezas().size(); i++) {
            System.out.println((i + 1) + ". " + vehiculo.getPiezas().get(i));
        }

        int opcion = scanner.nextInt();

        // Validar la selección de pieza
        if (opcion > 0 && opcion <= vehiculo.getPiezas().size()) {
            System.out.println("Reparando " + vehiculo.getPiezas().get(opcion - 1) + " del vehículo " + vehiculo.getMarca());
        } else {
            System.out.println("Opción no válida.");
        }
    }
}

