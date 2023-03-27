import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de matrícula do aluno: ");
        int matricula = sc.nextInt();
        
        String[] times = {"Time do Chris", "Time do Greg", "Time do Caruso", "Time do Jerome"};
        int timeEscolhido = matricula % 4;
        
        System.out.println("O aluno de matrícula " + matricula + " foi alocado no " + times[timeEscolhido] + ".");
    }

}
