
package bancobrasil;

/**
 * @author Kevyn Granja Lima
 */
public class ContaBancaria {
    //Atributos(caracteristicas) da classe
    private String agencia;
    private String conta;
    private double saldo;
    private Usuario proprietario;
    
    //Metodos (comportamentos) da classe
    void depositar(double valor){  //Método com parâmetro
        this.saldo += valor;
        
    }
    
    void sacar(double valor){ //Método com parâmetro
        //Insuficiência de saldo
        if(valor>this.saldo){
            System.out.println("O seu saldo é insuficiente");
        }else{
            //Saque normal
            this.saldo -= valor;
        }
        
    }
    
    void transferir(ContaBancaria contaBancaria, double valor){ //Método com parâmetro
        if(valor <= saldo){
            this.sacar(valor);
                contaBancaria.saldo += valor;
        }else{
            System.out.println("O seu saldo é insuficiente");
        }
        

    }
    
    String consultarSaldo(){  //Método sem parâmetro
        //String.format() método da classe String para utilizar formatação com
        //identificadores(%d , %f , %s , %.2f)
        return String.format("Seu saldo é: R$ %.2f",this.saldo);
    }
    
    //Metodo Construtor Padrão
    public ContaBancaria(){}
    //Metodo Construtor Definido
    public ContaBancaria(String agencia, String conta, double saldo, Usuario proprietario){
        this.agencia=agencia;
        this.conta=conta;
        this.proprietario=proprietario;
        this.saldo=saldo;
    }
    //Metodo Encapsulamento GET
    public String getAgencia(){
        return this.agencia;
    }
     public String getConta(){
        return this.conta;   
    }
     public double getSaldo(){
        return this.saldo;
    }
     public Usuario getProprietario(){
        return this.proprietario;
    }
    //Metodo Encapsulamento SET
    public void setAgencia(String agencia){
        this.agencia = agencia;
    }
    public void setConta(String conta){
        this.conta = conta;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public void setProprietario(Usuario proprietario){
        this.proprietario = proprietario;
    }
    
}
