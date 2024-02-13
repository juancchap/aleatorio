
package aleatorio;


import javax.swing.JOptionPane;

public class Aleatorio {

   
    public static void main(String[] args) {
      
        int numero,contador=0;
        double aleatorio;
        aleatorio=(int)(Math.random()*100);
        
        do
        {
        numero=Integer.parseInt(JOptionPane.showInputDialog("Adivina el numero"));
       
        if(aleatorio>numero)
        {
            
            JOptionPane.showMessageDialog(null, "Digita un numero mayor");
            
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Digita un numero menor");
            
        }
      contador++;
      
      
        }while (numero!=aleatorio);
        
        JOptionPane.showMessageDialog(null, "Excelente has adivinado el numero secreto \n en el intento: "+contador+"\nel numero secreto es :"+ aleatorio);
        
        
        
    }
    
}
