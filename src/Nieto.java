import java.util.HashMap;
import java.util.Map;

public class Nieto extends Persona {
    private String aficionPrincipal;
    private Map<String, Abuelo> abuelosRegistrados;
    private Map<String, Double> pagasPorAbuelo;

    public Nieto(String nombre, String apellidos, Genero genero, String fechaNacimiento, String telefono, String direccion, String aficionPrincipal) {
        super(nombre, apellidos, genero, fechaNacimiento, telefono, direccion);
        this.aficionPrincipal = aficionPrincipal;
        this.abuelosRegistrados = new HashMap<>();
        this.pagasPorAbuelo = new HashMap<>();
    }

    // Regla 3c: Añadir abuelo impidiendo duplicados del mismo tipo
    public void añadirAbuelo(Abuelo abuelo, double pagaSemanal) {
        String clave = generarClave(abuelo.getParentesco(), abuelo.getGenero());

        if (abuelosRegistrados.containsKey(clave)) {
            System.out.println("ERROR: Ya existe un abuelo para el hueco " + clave + ". Borre el existente primero.");
        } else {
            abuelosRegistrados.put(clave, abuelo);
            pagasPorAbuelo.put(clave, pagaSemanal);
            System.out.println("Abuelo añadido con éxito: " + abuelo.getMote() + " al nieto " + this.getNombre());
        }
    }

    // Regla 3c: Borrar abuelo explícitamente para poder cambiarlo después
    public void borrarAbuelo(Parentesco parentesco, Genero genero) {
        String clave = generarClave(parentesco, genero);
        if (abuelosRegistrados.containsKey(clave)) {
            abuelosRegistrados.remove(clave);
            pagasPorAbuelo.remove(clave);
            System.out.println("Hueco " + clave + " liberado para el nieto " + this.getNombre());
        } else {
            System.out.println("No existe ningún abuelo en el hueco " + clave);
        }
    }

    // Método auxiliar privado (dentro de la clase)
    private String generarClave(Parentesco p, Genero g) {
        return p.name() + "_" + g.name();
    }

    public String getAficionPrincipal() { return aficionPrincipal; }
    public void setAficionPrincipal(String aficionPrincipal) { this.aficionPrincipal = aficionPrincipal; }

    public Map<String, Abuelo> getAbuelosRegistrados() { return abuelosRegistrados; }
    public Map<String, Double> getPagasPorAbuelo() { return pagasPorAbuelo; }
}