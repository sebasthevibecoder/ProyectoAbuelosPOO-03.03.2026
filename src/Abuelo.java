public class Abuelo extends Persona {
    private String dni;
    private String mote;
    private Parentesco parentesco;
    private double pension;

    public Abuelo(String nombre, String apellidos, Genero genero, String fechaNacimiento, String telefono, String direccion, String dni, String mote, Parentesco parentesco, double pension) {
        super(nombre, apellidos, genero, fechaNacimiento, telefono, direccion);
        this.dni = dni;
        this.mote = mote;
        this.parentesco = parentesco;
        this.pension = pension;
    }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getMote() { return mote; }
    public void setMote(String mote) { this.mote = mote; }

    public Parentesco getParentesco() { return parentesco; }
    public void setParentesco(Parentesco parentesco) { this.parentesco = parentesco; }

    public double getPension() { return pension; }
    public void setPension(double pension) { this.pension = pension; }
}