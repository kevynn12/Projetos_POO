
package bancobrasil;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Kevyn Granja Lima
 */
public class BancoBrasil {

    public static void main(String[] args) {
        /*
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
        /*
        Scanner scan = new Scanner(System.in);
        
        //Atribuindo valores ao objeto(utilizando interações com o usuário)
        
        System.out.println("BEM-VINDO AO BANCO BRASIL");
        System.out.println("CADASTRO DE CONTAS");
        System.out.println("Digite a agência -> ");
        contaBancaria1.setAgencia(scan.next());
        System.out.println("\nDigite a conta -> ");
        contaBancaria1.setConta(scan.next());
        //Construção e inserção de dados do usuário
        System.out.println("\nDados do Usuário");
        System.out.println("Informe o nome do cliente -> ");
        user1.setNome(scan.next());
        System.out.println("\nInforme o sobrenome do cliente -> ");
        user1.setSobrenome(scan.next());
        System.out.println("\nInforme o telefone do cliente -> ");
        user1.setTelefone(scan.next());
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
         
        */
        
        //FORMA MELHORADA DE INTERFACE
        Scanner scan = new Scanner(System.in);
        //Variável global de opção
        int opcao = 0;
        boolean existe = false;
        //Objetos
        Usuario user;
        Usuario[] users = new Usuario[5];
        ContaBancaria contaBancaria = new ContaBancaria();
        
        
        
        while(opcao != 3){
        //1º Tela
            System.out.println("***BANCO BRASIL***");
            System.out.println("1- Cadastro de Cliente");
            System.out.println("2- Cadastro de Conta");
            System.out.println("3- Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scan.nextInt();
        
            switch(opcao){
                case 1:
                    for(int i=0; i<5 ; i++){
                        user = new Usuario();
                        System.out.println("***CADASTRO DE CLIENTE***");
                        System.out.println("Informe o Nome: ");                       
                        user.setNome(scan.next());
                        System.out.println("Informe o Sobrenome: ");
                        user.setSobrenome(scan.next());
                        System.out.println("Informe o Telefone: ");
                        user.setTelefone(scan.next());
                        
                        users[i] = user;
                    }
                    break;
                case 2:
                    System.out.println("***CADASTRO DE CONTA***");
                    System.out.println("Informe a Agência: ");
                    contaBancaria.setAgencia(scan.next());                   
                    System.out.println("Informe a Conta: ");
                    contaBancaria.setConta(scan.next());
                    System.out.println("CLIENTES CADASTRADOS");
                    
                    for(int i = 0; i<5 ; i++){
                        System.out.printf("%d- %s %s",i,users[i].getNome(),users[i].getSobrenome());
                    }
                    
                    System.out.println("Selecione o cliente: ");
                    
                    int userOpcao = scan.nextInt();
                            
                    for(int i=0; i<users.length; i++){
                        if(userOpcao-1 == i){
                            contaBancaria.setProprietario(users[userOpcao-1]);
                            existe = true;
                        }
                    }
                    if(existe==false){
                        System.out.println("O cliente informado não existe!");
                        break;
                    }
                    System.out.println("Insira um Saldo Inicial: ");
                    contaBancaria.setSaldo(scan.nextDouble());
                    break;                                  
                case 3:
                    System.out.println("***ATÉ BREVE!***");
                    System.out.println("Cliente(s) cadastrado(s) com uma conta: "+ contaBancaria.getProprietario().getNome());
                    break;  
                default:
                    System.out.println("Opção Inválida!");
                
            }
        }
        
        
        
    }
    
}
