import javax.swing.JOptionPane;
public class Medidas {

    // atributos
    private double base;
    private double altura;
    private double comp;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getComp() {
        return comp;
    }

    public void setComp(double comp) {
        this.comp = comp;
    }

    public double caulcular(){
        return getAltura() * getComp() * getBase();

    }
}
