package EstruturaRepeticao;

import java.util.Scanner;

public class exemplo4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int idade = 0;
        do {
            System.out.println("Digite sua idade: ");
            idade = leitor.nextInt();
           if (idade < 18){
               System.out.println("idade invalida!");
           }
        }while (idade < 18);

        System.out.println("Maior que 18 anos");
    }
}
