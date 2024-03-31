import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = input.next();
        System.out.println("Informe o número de sua agência: ");
        String agencia = input.next();
        System.out.println("Informe o número da sua conta: ");
        int conta = input.nextInt();
        System.out.println("Informe seu saldo: ");
        double saldo = input.nextDouble();
        input.close();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nome, agencia, conta, saldo);
    }
}
