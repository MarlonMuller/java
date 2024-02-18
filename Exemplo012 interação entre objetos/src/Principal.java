
public class Principal {

	public static void main(String[] args) {
		
		Aluno objeto = new Aluno();
		
		objeto.nome = "Oswaldo";
		objeto.teste = 9;
		objeto.prova = 10;
		
		System.out.println(objeto.obterMedia());

	}

}
