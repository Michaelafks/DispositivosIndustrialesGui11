public class Sensor extends Dispositivo {

    private double lectura;
    private String unidad;

    public Sensor(String codigo, String nombre, boolean activo, double lectura, String unidad) {
        super(codigo, nombre, activo);
        this.lectura = lectura;
        this.unidad = unidad;
    }

    @Override
    public String obtenerEstadoOperacion() {
        if (isActivo()) {
            return "Sensor activo. Registrando lecturas.";
        } else {
            return "Sensor inactivo. No registra lecturas.";
        }
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
                "\nTipo: Sensor" +
                "\nLectura: " + lectura + " " + unidad +
                "\nOperación: " + obtenerEstadoOperacion();
    }
}