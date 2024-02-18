package discentes;
public class Principal {

	public static void main(String[] args) {
		
		AlunoSuperior aluno = new AlunoSuperior();
		
		//aluno.nome = "Marlon";
		aluno.setNome("Marlon");
		
		//aluno.teste = 9;
		aluno.setTeste(9);
		
		//aluno.prova = 10;
		aluno.setProva(10);
		
		System.out.println(aluno.getMedia());
	}

}
