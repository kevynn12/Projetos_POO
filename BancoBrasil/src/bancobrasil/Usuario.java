package bancobrasil;


/**
 * @author Kevyn Granja Lima
 */
public abstract class Usuario {
    //Atributos
   private String nome;
   private String sobrenome;
   private String telefone;
   
    
    
    //Metodos Encapsulamento GET
    public String getNome(){
        return this.nome;
    }
     public String getSobrenome(){
        return this.sobrenome;   
    }
     public String getTelefone(){
        return this.telefone;
    }

     //Metodos Encapsulamento SET
     public void setNome(String nome){
         this.nome = nome;
     }
    public void setSobrenome(String sobrenome){
         this.sobrenome = sobrenome;
     }
    public void setTelefone(String telefone){
         this.telefone = telefone;
     }
     
    public abstract String imprimirInfo();

}
