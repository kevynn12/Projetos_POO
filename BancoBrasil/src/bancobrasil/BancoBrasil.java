
package bancobrasil;

import java.util.Scanner;

/**
 *
 * @author Kevyn Granja Lima
 */
public class BancoBrasil {

    public static void main(String[] args) {
        // Uso nas versões mais atuais do JDK: var contaBancaria1 = new ContaBancaria();
        //Instanciando um objeto do tipo ContaBancaria e referenciando na
        //variável contaBancaria1 e contaBancaria2
        //Tipo         //Nome             //Objeto
     ContaBancaria contaBancaria1 = new ContaBancaria();
     ContaBancaria contaBancaria2 = new ContaBancaria();
        /*
        //Atribuindo valores ao nosso objeto
        contaBancaria1.agencia = "0001";
        contaBancaria1.conta = "12345";
        contaBancaria1.proprietario = "Junior";
        contaBancaria1.saldo = 1.99;
        
        //Mostrar os valores armazenados no Objeto
        System.out.println(contaBancaria1.agencia+"\n"
        + contaBancaria1.conta + "\n"
        + contaBancaria1.proprietario + "\n"
        + contaBancaria1.saldo);
        
        */
        
        Scanner scan = new Scanner(System.in);
        
        //Atribuindo valores ao objeto(utilizando interações com o usuário)
        
        System.out.println("BEM-VINDO AO BANCO BRASIL");
        System.out.println("CADASTRO DE CONTAS");
        System.out.println("Digite a agência -> ");
        contaBancaria1.agencia = scan.next();
        System.out.println("\nDigite a conta -> ");
        contaBancaria1.conta = scan.next();
        System.out.println("\nDigite o proprietário -> ");
        contaBancaria1.proprietario = scan.next();
        System.out.println("\nDigite o saldo inicial -> ");
        contaBancaria1.saldo = scan.nextDouble();
        
         System.out.println(contaBancaria1.agencia+"\n"
        + contaBancaria1.conta + "\n"
        + contaBancaria1.proprietario + "\n"
        + contaBancaria1.saldo);
    }
    
}
