package EstruturaDecisao;

import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu salario: "); //console.log()

//        double salario = Double.parseDouble(leitor.nextLine());
        double salario = leitor.nextDouble();

        if (salario < 1000){
            double salarioReajustado = salario * 1.1;
            System.out.println("O salario novo é " + salarioReajustado);
        }else{
            System.out.println("Salario sem reajuste seu salario e " + salario);
        }

    }
}
