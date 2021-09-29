package projetocalculadora;

import javax.swing.JOptionPane;

public class ProjetoCalculadora {

    public static void main(String[] args) {
        
        double n1, n2;
        int operador;
        
        JOptionPane.showMessageDialog(null, "Calculadora:\n"
                + "Operações:\n"
                + "1- Adição\n"
                + "2- Subtração\n"
                + "3- multiplicação\n"
                + "4- Divisão\n");
        
        n1 =  Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o primeiro número: "));
        n2 =  Double.parseDouble(JOptionPane.showInputDialog(null,"Informe o segundo número: "));
        operador = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número correspondente a operação que deseja realizar: "));
        
        Calculadora c1 = new Calculadora(n1, n2);
        
        c1.realizaOperacao(operador);
    }
    
}
