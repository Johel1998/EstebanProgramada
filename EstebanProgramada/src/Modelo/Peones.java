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

   

    

      
    
    
}
