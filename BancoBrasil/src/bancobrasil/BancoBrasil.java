
package bancobrasil;

import java.util.ArrayList;
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
        int quantidadeCadastro=0;
        int opcao = 0;
        boolean isLogin = false;

        //Objetos
        ArrayList<Usuario> users = new ArrayList();
        ArrayList<Gerente> gerentes = new ArrayList();
        Usuario user;
        ContaBancaria contaBancaria = new ContaBancaria();
        GerenteRepository db_gerente = new GerenteRepository();
        gerentes = db_gerente.addGerente();
        //Tela de Login
       do{
            System.out.println("***SEJA BEM-VINDO AO BANCO BRASIL***");
            System.out.println("LOGIN: ");
            String login = scan.next();
            System.out.println("PASSWORD: ");
            String password = scan.next();

            for(Gerente g : gerentes){
                if(g.getLogin().equals(login) && g.getPassword().equals(password)){
                    isLogin = true;
                }
            }
            //String notValidate = "",validate = "Login ou senha incorretos!";
            System.out.printf("%s\n", isLogin==true? "" : "Login ou senha incorretos!");
        }while (isLogin != true); 
        
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
                    System.out.println("***CADASTRO DE CLIENTE***");
                    System.out.println("Quantidade de Cadastros: ");
                    
                     quantidadeCadastro = scan.nextInt();
                    for(int i=0; i< quantidadeCadastro ; i++){
                        user = new Usuario();
                        
                        System.out.println("Informe o Nome: ");                       
                        user.setNome(scan.next());
                        System.out.println("Informe o Sobrenome: ");
                        user.setSobrenome(scan.next());
                        System.out.println("Informe o Telefone: ");
                        user.setTelefone(scan.next());
                        
                        users.add(user);
                    }
                    break;
                case 2:
                    System.out.println("***CADASTRO DE CONTA***");
                    System.out.println("Informe a Agência: ");
                    contaBancaria.setAgencia(scan.next());                   
                    System.out.println("Informe a Conta: ");
                    contaBancaria.setConta(scan.next());
                    System.out.println("CLIENTES CADASTRADOS");
                    //Sera Listado os clientes cadastrados
                    if(users.size() !=0){
                        for(int i = 0; i< quantidadeCadastro ; i++){
                            System.out.printf("%d- %s %s\n",i+1,users.get(i).getNome(),users.get(i).getSobrenome());
                        }
                    
                    System.out.println("Selecione o cliente: ");
                    int userOpcao = scan.nextInt();
                    contaBancaria.setProprietario(users.get(userOpcao - 1));
                    }else{
                        System.out.println("Nenhum cliente cadastrado!");  
                        break;
                    }
                    

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
