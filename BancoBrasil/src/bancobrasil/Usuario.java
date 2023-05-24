package bancobrasil;


/**
 * @author Kevyn Granja Lima
 */
public class Usuario {
    //Atributos
   private String nome;
   private String sobrenome;
   private String telefone;
   
    
    //Métodos
    public String imprimirInfo(){
        return String.format("INFORMAÇÕES DO CLIENTE: Seu nome é: %s\n Sobrenome: %s\n Telefone: %s\n",
                            this.nome,this.sobrenome,this.telefone);
    }
    // Metodo Construtor Padrão
    public Usuario(){}
    //Metodo Construtor Definido
    public Usuario(String nome, String sobrenome, String telefone){
        this.nome=nome;
        this.sobrenome=sobrenome;
        this.telefone=telefone;
    }
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
    

}
