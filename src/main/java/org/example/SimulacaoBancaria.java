package org.example;

import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Valor a ser depositado:");
                    double valorDepositado = scanner.nextDouble();
                    saldo += valorDepositado;
                    System.out.println(String.format("Saldo atual: %,.1f",saldo));
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    break;
                case 2:
                    System.out.println("Valor a ser sacado:");
                    double valorSacado = scanner.nextDouble();
                    if (saldo < valorSacado) {
                        System.out.println("Saldo insuficiente");
                    }else {
                        saldo -= valorSacado;
                        System.out.printf("Saldo atual: %.1f", saldo);
                    }

                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    break;
                case 3:
                    System.out.printf("Saldo atual: %.1f", saldo);
                    // TODO: Exibir o saldo atual da conta.
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}