package EstruturaDecisao;

import java.util.Scanner;

public class exemplo4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome de usuario: ");
        String usuario = leitor.nextLine();
        System.out.println("Digite a senha: ");
        String senha = leitor.nextLine();

        if (usuario.equals("admin") && senha.equals("senha123")) {
            System.out.println("login bem-sucedido!");
        }else {
            System.out.println("nome de usuario ou senha incorretos!");
        }
    }
}
