
package bancobrasil;

/**
 * @author Kevyn Granja Lima
 */
public class ContaBancaria {
    //Atributos(caracteristicas) da classe
    String agencia;
    String conta;
    double saldo;
    String proprietario;
    
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
    
    void transferir(){
    }
    
    String consultarSaldo(){  //Método sem parâmetro
        //String.format() método da classe String para utilizar formatação com
        //identificadores(%d , %f , %s , %.2f)
        return String.format("Seu saldo é: R$ %.2f",this.saldo);
    }
    
    
    
    
    
    
    
}
