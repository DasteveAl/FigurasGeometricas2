import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Figuras extends JDialog {

    private JTextField txtRadio;
    private JTextField txtBase;
    private JTextField txtAltura;
    private JTextField txtLado;
    private JTextField txtTBase;
    private JTextField txtTAltura;
    private JButton clacularButton;
    private JButton salirButton;
    private JButton borrarButton;
    private JPanel Main;

    public Figuras(JFrame parent) {
        super(parent);
        setTitle("Figuras Geometricas");
        setContentPane(Main);
        setMinimumSize(new Dimension(450,450));
        setModal(true);
        setLocationRelativeTo(parent);

        clacularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Circulo figura1 = new Circulo();
                Rectangulo figura2 = new Rectangulo();
                Cuadrado figura3 = new Cuadrado();
                TrianguloRectangulo figura4 = new TrianguloRectangulo();

                int radio = Integer.parseInt(txtRadio.getText());
                figura1.Circulo(radio);
                int base = Integer.parseInt(txtBase.getText());
                int altura = Integer.parseInt(txtAltura.getText());
                figura2.Rectangulo(base,altura);
                int lado = Integer.parseInt(txtLado.getText());
                figura3.Cuadrado(lado);
                int rbase = Integer.parseInt(txtTBase.getText());
                int raltura = Integer.parseInt(txtTAltura.getText());
                figura4.TrianguloRectangulo(rbase,raltura);

                JOptionPane.showMessageDialog(null, "El area del circulo es: "+
                        figura1.calcularArea()+ "\nEl perimetro del circulo es: "+ figura1.calcularPerimetro()+
                        "\nEl area del rectangulo es: " + figura2.calcularArea()+
                        "\nEl perimetro del rectangulo es: "+ figura2.calcularPerimetro()+
                        "\nEl area del cuadrado es: " + figura3.calcularArea()+
                        "\nEl perimetro del cuadrado es: " + figura3.calcularPerimetro()+
                        "\nEl area del triangulo es: " + figura4.calcularArea()+
                        "\nEl perimetro del triangulo es: " + figura4.calcularPerimetro()+
                        "\n" + figura4.determinarTipoTriangulo());

            }
        });

        borrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtRadio.setText("");
                txtBase.setText("");
                txtAltura.setText("");
                txtLado.setText("");
                txtTBase.setText("");
                txtTAltura.setText("");
            }
        });

        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }
    public static void main(String args[]) {
        Figuras form = new Figuras(null);
    }
}
