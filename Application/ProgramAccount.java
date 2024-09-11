package model.Application;


import model.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class ProgramAccount {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.println("Enter account data ");
        System.out.print("Number: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Holder: ");
        String titular = sc.nextLine();
        System.out.print("Initial balance: ");
        double saldoInicial = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double limiteSaque = sc.nextDouble();

        account = new Account(numeroConta, titular, saldoInicial, limiteSaque);

        System.out.print("Enter amount for withdraw: ");
        double sacar = sc.nextDouble();

        account.sacar(sacar);

        System.out.print("Novo saldo: " + String.format("%.2f ", account.getSaldo()));


        sc.close();
    }
}
