import java.util.Scanner;
import java.util.InputMismatchException;

public class ContaTermianal
 {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe scaner
        //TODO: Exibir as mensagens para nosso usuario
        //TODO: Exibir a mensagem final
        int numero ;
        String agencia;
        String nomeCliente;
        float saldo ;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        nomeCliente = scanner.nextLine();
        System.out.println("Digite sua Agência:");
        agencia = scanner.nextLine();
        System.out.println("Digite o numero da conta - apenas números");
        numero = scanner.nextInt();
        System.out.println("Digite o saldo a depositar:");
        saldo = scanner.nextFloat();
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia+", conta "+numero+" e seu saldo "+ saldo +"$ já está disponível para saque");
    }
}
