import java.util.Scanner;
import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Medidas m = new Medidas();


        double base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base?"));
        m.setBase(base);

        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura?"));
        m.setAltura(altura);
        double comp =Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento ?"));
        m.setComp(comp);
        double total = m.caulcular();
        JOptionPane.showMessageDialog(null,"o total é de "+ total);



    }
}