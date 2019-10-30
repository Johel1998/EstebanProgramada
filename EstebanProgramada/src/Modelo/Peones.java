package Modelo;

/**
 *
 * @author Adrian Regidor
 */
public class Peones {
    private int color;

    public Peones(int color) {
        this.color = color;
    }
    
    public Peones() {
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Peones{" + "color=" + color + '}';
    }

    /*
    REGLAS
    -moverse hacia adelante verticalmente por la columna
    -no puede retroceder
    -si un peon obstaculiza su avance lo bloquea, detiene su avance
    debe cambiar de peon
    -primer movimiento: puede avanzar 1 o 2 casillas de una en una
    */   
}
