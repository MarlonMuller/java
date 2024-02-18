
public class Principal {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		
		aluno.setNome("Oswaldo");
		aluno.teste = 9;
		aluno.prova = 10;
		
		System.out.println(aluno.getNome());
		System.out.println(aluno.getMedia());
		
	}

}
