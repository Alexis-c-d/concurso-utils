import javax.swing.*;
public class MCD{

    public static void main(String[]args){
        String astr= JOptionPane.showInputDialog("Ingrese su primer número");
        int a1= Integer.parseInt(astr);
        String bstr= JOptionPane.showInputDialog("Ingrese su segundo número");
        int b1= Integer.parseInt(bstr);
        
        int resultado = encontrarMCD(a1, b1);
        JOptionPane.showMessageDialog(null, "El MCD de " + a1 + " y " + b1 + " es "+ resultado+".");

    }

    public static int encontrarMCD(int a, int b){
        while(b != 0){
            int res= b;
            b = a % b;
            a = res;
        }
        return a;
    }
}