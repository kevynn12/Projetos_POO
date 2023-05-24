
package bancobrasil;

import java.util.Date;

/**
 *
 * @author Kevyn Granja Lima
 */
public class Cliente extends Usuario{
    private Date dataRegistro = new Date();
    
    //Construtor
    public Cliente(){}

    public Cliente(String nome, String sobrenome, String telefone) {
        super(nome, sobrenome, telefone);
    }
    

    //Getts and Setts
    
    public Date getDataRegistro(){
        return this.dataRegistro;
    }
    public void setDataRegistro(Date dataRegistro){
        this.dataRegistro = dataRegistro;
    }
    //Sobrescrição de método
    @Override
    public String imprimirInfo(){
        return String.format("INFORMAÇÕES DO CLIENTE: Seu nome é: %s\n Sobrenome: %s\n Telefone: %s\nData de Registro: %s",
                                                    super.getNome(),super.getSobrenome() ,super.getTelefone(),this.dataRegistro);
        
    }

    
}
