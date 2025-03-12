/*
 * Faça um programa ContaBanco que receba os dados pré estabelecidos abaixo:
 *  Atributo 	Tipo 	Exemplo
    Numero 	Inteiro 	1021
    Agencia 	Texto 	067-8
    Nome Cliente 	Texto 	MARIO ANDRADE
    Saldo 	Decimal 	237.48

    E exiba a seguinte mensagem:
    "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia],
     conta [Numero] e seu saldo [Saldo] já está disponível para saque".
 */

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Número da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();

        System.out.print("Agência: ");
        String agencia = sc.nextLine();

        System.out.print("Nome do cliente: ");
        String nomeCliente = sc.nextLine();

        double saldo = 237.48;

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ",  conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
