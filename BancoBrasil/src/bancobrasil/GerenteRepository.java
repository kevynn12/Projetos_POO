
package bancobrasil;

import java.util.ArrayList;

/**
 *
 * @author Kevyn Granja Lima
 */
public class GerenteRepository {
    //Atributos//Objetos
    public ArrayList<Gerente> gerente = new ArrayList<>();
    
    
    
    //Métodos 
    public ArrayList<Gerente> addGerente(){
        gerente.add(new Gerente("davis","12345","Davi","Saldanha",""));
        gerente.add(new Gerente("teste","teste","","",""));
        
        return gerente;
    }
    
}
