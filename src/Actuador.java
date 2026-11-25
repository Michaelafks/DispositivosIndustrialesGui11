public class Actuador extends Dispositivo {

    private double posicion;
    private double potencia;

    public Actuador(String codigo, String nombre, boolean activo, double posicion, double potencia) {
        super(codigo, nombre, activo);
        this.posicion = posicion;
        this.potencia = potencia;
    }

    @Override
    public String obtenerEstadoOperacion() {
        if (isActivo()) {
            return "Actuador activo. Ejecutando acciones.";
        } else {
            return "Actuador inactivo. No ejecuta acciones.";
        }
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() +
                "\nTipo: Actuador" +
                "\nPosición: " + posicion +
                "\nPotencia: " + potencia + " kW" +
                "\nOperación: " + obtenerEstadoOperacion();
    }
}