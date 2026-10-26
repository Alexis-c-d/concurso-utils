import javax.swing.JOptionPane;

public class DecimalBinario {
    public static void main(String[] args) {
        // Ventana para introducir número
        String numeroStr = JOptionPane.showInputDialog("Ingrese un número entero mayor a 0");
        int numeroDecimal = Integer.parseInt(numeroStr);

        // Convertir un número decimal a binario
        String binario = "";
        // Ciclo que divide al número y agrega los dígitos
        while (numeroDecimal > 0) {
            if (numeroDecimal % 2 == 0) {
                binario = "0" + binario;
            } else {
                binario = "1" + binario;
            }
            numeroDecimal = numeroDecimal / 2;
        }

        // Ventana que muestra el mensaje de la cadena
        JOptionPane.showMessageDialog(null, binario);
    }
}