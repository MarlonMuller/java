import javax.swing.*;
class Somar {   
    public static void main(String args[]) {
        // declaração de variáveis e/ou constantes
        int VetSoma [], i, media, soma = 0;
        VetSoma = new int [50];
        
        // processamento de dados
        for (i=0; i<=49; i++){
            VetSoma[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
            soma = soma + VetSoma[i];
        }
        media = soma/50;
        
        // saída de resultados
       System.out.println ("A média das 50 notas digitadas é: " + media);
       System.exit(0);       
        
    }
}
