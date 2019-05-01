
package conversor.de.bases;
 import java.util.Scanner; 
import javax.swing.JOptionPane; 


public class ConversorDeBases {

    
    public static void main(String[] args) {
    String   a,operacion,resultado;
    int  numero ;
    boolean answer= true;
    
    JOptionPane.showMessageDialog(null,"Programa para convertir bases numericas","Bienvenido",JOptionPane.PLAIN_MESSAGE);
    String nl= System.getProperty("line.separator"); 
                

    
    
    
    do{
        operacion=JOptionPane.showInputDialog(
                " Escriba la letra -a-  para decimal a binario" +nl+
                " Escriba la letra -b-  para decimal a octal" +nl+
                " Escriba la letra -c-  para decimal a hexadecimal" +nl+
                " Escriba la letra -d-  para binario a decimal " +nl+
                " Escriba la letra -e-  para octal a decimal" +nl+
                " Escriba la letra -f-  para hexadecimal a decimal ");

    switch (operacion){
        
        case "a":   
            operacion=JOptionPane.showInputDialog("escriba el numero decimal a convertir en binario: ");
            numero=Integer.parseInt(operacion);
            resultado= Integer.toBinaryString(numero);
            
            JOptionPane.showMessageDialog(null, resultado);
           a=JOptionPane.showInputDialog("Escriba si o no ,si desea realizar otra conversion").trim();
           
                      
           
           if(a.equals("si")){ answer=true;}else answer=false;
           
        break;
                        
        case "b":
            operacion=JOptionPane.showInputDialog("escriba el numero decimal a convertir en octal: ");
            numero=Integer.parseInt(operacion);
            resultado=Integer.toOctalString(numero);
            
            JOptionPane.showMessageDialog(null, resultado);
            
            a=JOptionPane.showInputDialog("Escriba si o no ,si desea realizar otra conversion" );
            if(a.equals("si")){answer=true;}else answer=false; 
                        
            break;
            
        case "c":
            operacion=JOptionPane.showInputDialog("escriba el numero decimal a convertir en hexadecimal: ");
            numero=Integer.parseInt(operacion);
            resultado=Integer.toHexString(numero);
            
            JOptionPane.showMessageDialog(null,resultado);
            a=JOptionPane.showInputDialog("Escriba si o no ,si desea realizar otra conversion" );
            if(a.equals("si")){answer=true;}else answer=false;
            
            break;
            
         case "d":
            operacion=JOptionPane.showInputDialog("escriba el numero binario a convertir en decimal: ");
            numero=Integer.parseInt(operacion);
         int decimal=Integer.parseInt(operacion, 2);
            
            JOptionPane.showMessageDialog(null,decimal);
            a=JOptionPane.showInputDialog("Escriba si o no ,si desea realizar otra conversion" );
            if(a.equals("si")){answer=true;}else answer=false;
            
            break;
          
            case "e":
            operacion=JOptionPane.showInputDialog("escriba el numero octal para convertir a decimal: ");
            
            numero=Integer.parseInt(operacion);
         int octal=Integer.parseInt(operacion, 8);
            
            JOptionPane.showMessageDialog(null,octal);
            a=JOptionPane.showInputDialog("Escriba si o no ,si desea realizar otra conversion" );
            if(a.equals("si")){answer=true;}else answer=false;
            
            break;   
                
             case "f":
            operacion=JOptionPane.showInputDialog("escriba el numero hexadecimal a convertir en decimal: ");
            numero=Integer.parseInt(operacion,16);
            
            JOptionPane.showMessageDialog(null,numero);
            a=JOptionPane.showInputDialog("Escriba si o no ,si desea realizar otra conversion" );
            if(a.equals("si")){answer=true;}else answer=false;
            
            break;     
              
             
         default: JOptionPane.showMessageDialog(null,"escribe un valor correcto");
             answer=true;
            break; 
                
        }
    }while(answer==true);
    
    
if(answer==false){ JOptionPane.showMessageDialog(null,"Hasta luego....");}
    
 
    
    
    

    }
}
