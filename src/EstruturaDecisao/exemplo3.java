package EstruturaDecisao;

import java.util.Scanner;

public class exemplo3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int numero1 = leitor.nextInt();
        System.out.println("Digite o segundo valor: ");
        int numero2 = leitor.nextInt();

        if (numero1 > numero2){
            System.out.println(numero1);
        } else if (numero2 > numero1) {
            System.out.println(numero2);
        }else{
            System.out.println("Os numeros sao iguais");
        }
    }
}
