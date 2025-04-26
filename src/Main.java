import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int senha = 1234;
        int tentativa;
        System.out.println("Digite a senha: ");
        tentativa = ler.nextInt();

        while (tentativa != senha){
            System.out.println("Senha incorreta, tente novamente. ");
            tentativa = ler.nextInt();
        }
        System.out.print("Acesso concedido");
    }
}