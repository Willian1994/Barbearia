package View;

import Model.Cliente;
import Model.Servico;
import Model.Usuario;

public class Main {
    
    public static void main(String[] args){
        
        String nome = "tiago";
        System.out.println(nome);
        
        Servico servico = new Servico(1, "barba", 30);
        
        System.out.println(servico.getDescrição());
        System.out.println(servico.getValor());
        
        Cliente cliente =  new Cliente(1, "tiago", 'M', "999999999", "rua A");
        System.out.println(cliente);
        
        Usuario usuario = new Usuario(1, "barbeiro", "senha");
        System.out.println(usuario);
    }
    
    
    
}
