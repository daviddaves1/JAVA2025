// ExercLab1_3.java
import java.util.Scanner;

public class ExercLab1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos cursos você deseja cadastrar? ");
        int quantidade = sc.nextInt();
        sc.nextLine();

        Curso[] cursos = new Curso[quantidade];

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Informe os dados do curso " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Unidade: ");
            String unidade = sc.nextLine();
            System.out.print("Duração (anos): ");
            int duracao = sc.nextInt();
            sc.nextLine();
            System.out.print("Coordenador: ");
            String coordenador = sc.nextLine();

            cursos[i] = new Curso(nome, unidade, duracao, coordenador);
        }

        System.out.println("\nDados dos cursos cadastrados:");
        for (Curso curso : cursos) {
            System.out.println(curso);
        }

        sc.close();
    }
}