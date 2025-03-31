//Mostar dados do aluno

class Aluno {
	private String nome;
	private int idade;
	private int matricula;
	private String curso;

	public String getNome(){
		return nome;
	}

	public void setnome(String nome){
		this.nome = nome;
	}

	public int getIdade(){
		return idade;
	}
	
	public void setIdade(int idade){
		if(idade >= 0){
			this.idade = idade;
		} else{
			System.out.println("Idade inválida");
		}
	}

	public int getMatricula(){
		return matricula;
	}

	public void setMatricula(int matricula){
		this.matricula = matricula;
	}

	public String getCurso(){
		return curso;
	}

	public void setCurso(String curso){
		this.curso = curso;
	}

	public void mostrarDados(){
		System.out.println("Aluno: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Matricula: " + matricula);
		System.out.println("Curso: " + curso);
	}
	
}

public class Main{
	public static void main(String[] args){

		Aluno alunos = new Aluno();

		alunos.setnome("David");
		alunos.setIdade(-1); //coloquei de propósito
		alunos.setCurso("ES");
		alunos.setMatricula(2024);

		alunos.mostrarDados();

	}
}