import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		/*Imagine que uma ONG precise saber a m�dia de idades dos alunos de uma escola.
		 * Sabendo de antem�o quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual � a melhor forma de calcular essa m�dia?*/
		Scanner leitor = new Scanner(System.in);
		int idade;
		double  media=0;
		int numeroAlunos = 0;
		
		while (numeroAlunos < 5) {
			numeroAlunos = numeroAlunos+1;
			System.out.println("Digite a idade do aluno");
			idade = leitor.nextInt();
			
			
			media = media + idade;
			
		}
		
		media = media / 5.0;
		
		System.out.println(media);
		leitor.close();
	}

}
