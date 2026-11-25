public class Controlador extends Dispositivo {

    private int numeroEntradas;

    public Controlador(String codigo, String nombre, boolean activo, int numeroEntradas) {
        super(codigo, nombre, activo);
        this.numeroEntradas = numeroEntradas;
    }

    @Override
    public String obtenerEstadoOperacion() {
        if (isActivo()) {
            return "Controlador activo. Gestionando entradas del sistema.";
        } else {
            return "Controlador inactivo. No gestiona entradas.";
        }
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
                "\nTipo: Controlador" +
                "\nNúmero de entradas: " + numeroEntradas +
                "\nOperación: " + obtenerEstadoOperacion();
    }
}