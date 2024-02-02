
public class Principal {

	public static void main(String[] args) {
		
		
		int numero = 4;
		
		switch(numero) {
		
		case 1:
			System.out.println("Você digitou 1");
			break;
		
		case 2:
			System.out.println("Você digitou 2");
			break;
			
		case 3:
		case 4:
			System.out.println("Você digitou 3 ou 4");
			break;
		default:
			System.out.println("Você digitou um valor invalido");
		}

	}

}
