public class Main {

    public static void main(String[] args) {

        // Crear sensores y actuadores independientemente
        Dispositivo d1 = new Sensor("S01", "Temperatura", true, 24.5, "°C");
        Dispositivo d2 = new Sensor("S02", "Humedad", true, 65.0, "%");

        Dispositivo d3 = new Actuador("A01", "Válvula", true, 50, 2.5);
        Dispositivo d4 = new Actuador("A02", "Motor", false, 30, 5.0);

        // Crear controlador
        Dispositivo d5 = new Controlador("C01", "Controlador Principal", true, 8);

        // Crear estación de control
        EstacionControl estacion = new EstacionControl();

        // Mostrar estación vacía
        System.out.println("===== ESTACIÓN VACÍA =====");
        System.out.println(estacion.mostrarDispositivos());

        // Agregar dispositivos
        estacion.agregarDispositivo(d1);
        estacion.agregarDispositivo(d2);
        estacion.agregarDispositivo(d3);
        estacion.agregarDispositivo(d4);
        estacion.agregarDispositivo(d5);

        // Mostrar dispositivos
        System.out.println("\n===== DISPOSITIVOS REGISTRADOS =====");
        System.out.println(estacion.mostrarDispositivos());

        // Contar dispositivos activos
        System.out.println("\n===== CONTEO DE ACTIVOS =====");
        System.out.println("Dispositivos activos: " + estacion.contarActivos());

        // Buscar dispositivo existente
        System.out.println("\n===== BÚSQUEDA EXISTENTE =====");
        Dispositivo encontrado = estacion.buscarDispositivo("S01");

        if (encontrado != null) {
            System.out.println(encontrado.mostrarInformacion());
        } else {
            System.out.println("Dispositivo no encontrado.");
        }

        // Buscar dispositivo inexistente
        System.out.println("\n===== BÚSQUEDA INEXISTENTE =====");
        encontrado = estacion.buscarDispositivo("X99");

        if (encontrado != null) {
            System.out.println(encontrado.mostrarInformacion());
        } else {
            System.out.println("Dispositivo no encontrado.");
        }
    }
}
