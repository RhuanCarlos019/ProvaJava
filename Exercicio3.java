import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        
        double morangos, macas, bananas, valorTotal;
        double valorMorangos, valorMacas, valorBananas;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a quantidade (em kg) de morangos: ");
        morangos = sc.nextDouble();
        System.out.print("Digite a quantidade (em kg) de maçãs: ");
        macas = sc.nextDouble();
        System.out.print("Digite a quantidade (em kg) de bananas: ");
        bananas = sc.nextDouble();
        

        valorMorangos = morangos * 3.50;
        valorMacas = macas * 2.30;
        valorBananas = bananas * 1.80;
        
        valorTotal = valorMorangos + valorMacas + valorBananas;
        
        if (valorTotal > 30.00 || (morangos + macas + bananas) > 15) {
            valorTotal = valorTotal * 0.9;
        }
    
        System.out.println("O valor total da compra é: R$ " + valorTotal);
        

    }

}

