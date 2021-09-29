package projetocalculadora;

import javax.swing.JOptionPane;

public class Calculadora {
    
    private double n1;
    private double n2;
    private double result;
    
    Calculadora(double n1, double n2){
        this.n1 = n1;
        this.n2 = n2;
    }        

    public void realizaOperacao(int operador){
        switch(operador){
            case 1:
               result = n1 + n2;
               System.out.println("O resultado de" + n1 + " + " + n2 +"é:" + result);
             break;
            case 2:
                result = n1 - n2;
                System.out.println("O resultado de" + n1 + " - " + n2 +"é:" + result);
              break;
            case 3: 
                result = n1 * n2;
                System.out.println("O resultado de" + n1 + " x " + n2 +"é:" + result);
              break;
            case 4:
                result = n1 / n2;
                System.out.println("O resultado de" + n1 + " / " + n2 +"é:" + result);
              break;
            default: JOptionPane.showInputDialog(null, "Opção inválida\n");
        }
    }
            
}
