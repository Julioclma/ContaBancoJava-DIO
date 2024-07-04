import java.util.Locale;
import java.util.Scanner;

public class GenerateNewAccount {

    public void process()
    {
        Scanner keyboard = new Scanner(System.in).useLocale(Locale.US);

        Integer numero;
        String agencia;
        String nome;
        Double saldo;

        System.out.println("Insira o numero da conta");
        numero = keyboard.nextInt();

        System.out.println("Insira a agência da Conta");
        agencia = keyboard.next();

        System.out.println("Insira o nome do cliente");
        nome = keyboard.next();
        System.out.println("Insira o saldo");

        saldo = keyboard.nextDouble();


        Conta account = new Conta(numero, agencia, nome, saldo);


        account.getInfoAccount();
    }

}
