package View;

import Model.Agendamento;
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
        
        
        
        Cliente cliente = new Cliente(1, "Willian", "Rua teste", "33333333");
        System.out.println(cliente.getNome());
        
        Usuario usuario = new Usuario(1, "Barbeiro", "senha");
        System.out.println(usuario.getNome());
        
        
        Agendamento agendamento = new Agendamento(1, cliente, servico, 30, "25/07/2021 09:15");
        System.out.println(agendamento.getCliente().getNome());
                
    }
    
    
    
}
