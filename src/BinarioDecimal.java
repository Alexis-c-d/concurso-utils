import javax.swing.JOptionPane;

public class BinarioDecimal {
    public static void main(String[] args) {
        // Ventana para introducir número binario
        String numeroBinarioStr = JOptionPane.showInputDialog("Ingrese un número binario");

        // Convertir el número binario a decimal
        int numeroDecimal = Integer.parseInt(numeroBinarioStr, 2);

        // Ventana que muestra el mensaje del número decimal
        JOptionPane.showMessageDialog(null, "El número decimal es: " + numeroDecimal);
    }
}
