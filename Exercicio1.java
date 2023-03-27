import java.util.Scanner; 
public class Exercicio1 {
    

public class Calcular {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         

            System.out.print("Digite o primeiro número: ");
            double num1 = sc.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = sc.nextDouble();

            System.out.println("Escolha uma operação aritmética: ");
            System.out.println("1 - Adição (+)");
            System.out.println("2 - Subtração (-)");
            System.out.println("3 - Multiplicação (*)");
            System.out.println("4 - Divisão (/)");

            int operacao = sc.nextInt();
            double resultado = 0.0;

            switch (operacao) {
                case 1:
                    resultado = num1 + num2;
                    break;
                case 2:
                    resultado = num1 - num2;
                    break;
                case 3:
                    resultado = num1 * num2;
                    break;
                case 4:
                    resultado = num1 / num2;
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

            System.out.println("O resultado da sua operação é: " + resultado);
        }
    }
}

