package application;

import entities.ContaTerminal;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Por favor, digite o número da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.print("Por favor, digite a sua Agencia: ");
        String agencia = sc.nextLine();


        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Por favor, digite um valor válido para o saldo: ");
        double saldo = sc.nextDouble();
        System.out.println();


        ContaTerminal conta = new ContaTerminal(numeroConta, agencia, nomeCliente, saldo);

        System.out.println(conta);

        sc.close();
    }
}