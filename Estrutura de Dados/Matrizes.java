import javax.swing.*;
class Somar {   
    public static void main(String args[]) {
        int MatSoma [][], a, b, soma = 0;
        MatSoma = new int [3][3];
    
        for (a=0; a<3; a++){
            for (b=0; b<3; b++) {
            MatSoma[a][b] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
            soma = soma + MatSoma[a][b];
            }
        }
       System.out.println ("A soma dos 9 valores digitados é: " + soma);
       System.exit(0);       
    }
}
