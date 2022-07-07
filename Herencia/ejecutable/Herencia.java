package ejecutable;

import javax.swing.JOptionPane;

import modelo.division;
import modelo.multiplicacion;
import modelo.resta;
import modelo.suma;


public class Herencia
{
    public static void main(String[]args)
    {

    
    double x = Double.parseDouble(JOptionPane.showInputDialog("digite el valor de x:"));
    double y = Double.parseDouble(JOptionPane.showInputDialog("digite el valor de y:"));
    int operaciones=Integer.parseInt(JOptionPane.showInputDialog("digite la operacion \n 1 suma \n 2= resta \n 3 = division \n 4 = multiplicacion "));
                
   if (operaciones == 1)
     {
    suma miSuma= new suma(x,y);
    miSuma.sumar();
    JOptionPane.showMessageDialog(null,"la suma de" +x+ "y" +y+ " es" + miSuma.mostrarResultado());
     }
    
    
    if (operaciones == 2)
     {
    resta miResta= new resta(x,y);
    miResta.restar();
    JOptionPane.showMessageDialog(null,"la suma de" +x+ "y" +y+ " es" + miResta.mostrarResultado());
     }
    
  if (operaciones == 3)
     {
    multiplicacion miMultiplicacion= new multiplicacion(x,y);
    miMultiplicacion.multiplicar();
    JOptionPane.showMessageDialog(null,"la suma de" +x+ "y" +y+ " es" + miMultiplicacion.mostrarResultado());
     }
    
 if (operaciones == 4)
     {
    division miDivision= new division(x,y);
    miDivision.dividir();
    JOptionPane.showMessageDialog(null,"la suma de" +x+ "y" +y+ " es" + miDivision.mostrarResultado());
     
    }
    }
    

    }

