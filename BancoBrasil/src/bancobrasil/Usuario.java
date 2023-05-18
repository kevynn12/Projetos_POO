package bancobrasil;

import java.util.Date;

/**
 * @author Kevyn Granja Lima
 */
public class Usuario {
    //Atributos
    String nome;
    String sobrenome;
    String telefone;
    Date dataRegistro = new Date();
    
    //Métodos
    String imprimirInfo(){
        return String.format("Seu nome é: %s\n Sobrenome: %s\n Telefone: %s\n Data de registro: %s",
                            this.nome,this.sobrenome,this.telefone,this.dataRegistro);
    }
                      
            
}
