
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
     Usuario user1 = new Usuario();
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
        //Construção e inserção de dados do usuário
        System.out.println("\nDados do Usuário");
        System.out.println("\nInforme o nome do cliente -> ");
        user1.nome = scan.next();
        System.out.println("\nInforme o sobrenome do cliente -> ");
        user1.sobrenome = scan.next();
        System.out.println("\nInforme o telefone do cliente -> ");
        user1.telefone = scan.next();
        //Associando a conta bancaria e o usuário com seus respectivos dados ao
        //proprietário.
        contaBancaria1.proprietario = user1;
        System.out.println("\nDigite o valor de deposito -> ");
        contaBancaria1.depositar(scan.nextDouble());
        
         System.out.println(contaBancaria1.agencia+"\n"
        + contaBancaria1.conta + "\n"
        + contaBancaria1.proprietario.imprimirInfo()+ "\n"
        + contaBancaria1.consultarSaldo());
         
        System.out.println("\n\n Digite o valor para saque -> ");
        contaBancaria1.sacar(scan.nextDouble());
        
        System.out.println(contaBancaria1.consultarSaldo());
         
        
    }
    
}
