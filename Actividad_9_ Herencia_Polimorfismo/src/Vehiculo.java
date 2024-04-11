import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
    private String matricula;
    private String color;
    private String marca;
    private List<String> piezas;

    // Constructor
    public Vehiculo(String matricula, String color, String marca) {
        this.matricula = matricula;
        this.color = color;
        this.marca = marca;
        this.piezas = new ArrayList<>();
        // Agregar cinco piezas predefinidas
        piezas.add("Motor");
        piezas.add("Ruedas");
        piezas.add("Parabrisas");
        piezas.add("Puertas");
        piezas.add("Luces");
    }

    // Getters y setters

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public List<String> getPiezas() {
        return piezas;
    }

    public void setPiezas(List<String> piezas) {
        this.piezas = piezas;
    }
}


