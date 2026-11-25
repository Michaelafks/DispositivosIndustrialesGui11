public class Dispositivo {

    private String codigo;
    private String nombre;
    private boolean activo;

    public Dispositivo(String codigo, String nombre, boolean activo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.activo = activo;
    }

    public String getCodigo() {
        return codigo;
    }

    public boolean isActivo() {
        return activo;
    }

    public String obtenerEstadoOperacion() {
        if (activo) {
            return "Dispositivo en funcionamiento.";
        } else {
            return "Dispositivo inactivo.";
        }
    }

    public String mostrarInformacion() {
        return "Código: " + codigo +
                "\nNombre: " + nombre +
                "\nEstado: " + (activo ? "Activo" : "Inactivo");
    }
}