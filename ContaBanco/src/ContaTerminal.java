import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numeroConta;
        String agencia;
        String nomeCliente;
        float saldo;

        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 
       
        System.out.println("Por favor, qual o seu nome?");
        nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o número da Agência !");
        agencia = scanner.next();
        System.out.println("Agora informe o número de sua conta.");
        numeroConta = scanner.nextInt();
        System.out.println("Qual o seu saldo esperado?");
        saldo = scanner.nextFloat();

        System.out.println("Olá, "+nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+ ", conta "+numeroConta+" e seu saldo "+saldo+" já está disponível para saque");
       scanner.close();
    }
}
