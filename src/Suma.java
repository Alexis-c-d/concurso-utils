import javax.swing.*;
public class Suma {
    public static void main(String[]args){
        String numstr = JOptionPane.showInputDialog("Ingrese un número entero");
        int num = Integer.parseInt(numstr);

        JOptionPane.showMessageDialog(null, "La suma de los digitos de " + num + " es: " + hacerSuma(num));

    }
    public static int hacerSuma(int numero){
        int suma = 0;
        while (numero != 0){
            suma += numero % 10;
            numero /= 10;

        }
        return suma;
    }
}

