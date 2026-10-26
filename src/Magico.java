import javax.swing.JOptionPane;
 
public class magico {
	public static void main(String[] args) {
    	String numeroStr=JOptionPane.showInputDialog("ingrese su número");
    	int numero=Integer.parseInt(numeroStr);
    	int total=numero;
    	while(total>=10){
        	int suma=0;
        	while (total>0){
            	suma=suma+(total%10);
	            total=total/10;
               
           
        	}
        	total=suma;
    	}if(total==1){
    	JOptionPane.showMessageDialog(null, "el número " +numero+" es mágico");
 
    	}else{
    	JOptionPane.showMessageDialog(null, "el número " +numero+" no es mágico, su suma es: "+total);
    	}
       
	}
   
}
