import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //To Do: conhecer e importar  classe Scanner
        Scanner scanner = new Scanner(System.in);

        //TODO: Obter os valores digitador(pela classe scanner)
        System.out.println("Digite o numero da conta: ");
        int numero = scanner.nextInt();
        System.out.println("Digite a agencia: ");
        String agencia = scanner.next();
        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite o saldo: ");
        double saldo= scanner.nextDouble();

        //Exibir a mensagem final( da conta criada)
        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");


        // Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close();

        
    }
}
