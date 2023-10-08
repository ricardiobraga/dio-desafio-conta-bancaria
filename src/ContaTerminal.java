import java.util.Locale;
import java.util.Scanner;

import edu.ricardo.model.ContaBancaria;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println();
        
        System.out.println("Por favor, digite o seu nome!");
        String nome = sc.next();
        sc.nextLine();
        
        
        System.out.println("Por favor, digite o número da conta !");
        int numero = sc.nextInt();

        System.out.println("Por favor, digite o número da agência !");
        String agencia = sc.next();
        System.out.println();

        System.out.println("Por favor, digite ovalor do deposito!");
        Double saldo = sc.nextDouble();

        ContaBancaria contaBancaria = new ContaBancaria(numero, agencia, nome, saldo);

        System.out.println();
        System.out.println(contaBancaria);

        sc.close();

    }
}
