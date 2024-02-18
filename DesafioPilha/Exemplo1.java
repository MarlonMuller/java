import javax.swing.*;

class Exemplo1
{
 public static void main (String arg[])
 {
   Pilha intPilha = new Pilha(5);
   int i;
   int entrada;
   
   for (i=1; i<=5; i++)
   {
     entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
     
     intPilha.Empilhar(entrada);
   }
  intPilha.MostrarPilha();
  System.exit(0);
 }
}