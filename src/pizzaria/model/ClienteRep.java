package pizzaria.model;

import java.util.ArrayList;

public class ClienteRep {
    private ArrayList<Cliente> clientes;
    private static ClienteRep clienteRep;

    private ClienteRep(){
        this.clientes = new ArrayList<>();
    }
    
    public static ClienteRep getInstance(){
        if(clienteRep == null)
            clienteRep = new ClienteRep();
        return clienteRep;
    }
    
    public void adicionarCliente (Cliente cliente){
        boolean rem = false;
        
        for (Cliente c : clientes){
            if(c.getCpf().equals(cliente.getCpf())){
                clientes.remove(c);
                rem = true;
                break;
            }
        }
        clientes.add(cliente);
        
        if (rem == true){
            System.out.println("Cliente atualizado");
        }
        else{
            System.out.println("Cliente adicionado");
        }
    }
    
    public void removerCliente (String cpf){
        boolean rem = false;
        for (Cliente c : clientes){
            if(c.getCpf().equals(cpf)){
                clientes.remove(c);
                System.out.println("Cliente removido");
                rem = true;
                break;
            }
        }

        if (rem == false){
            System.out.println("Cliente não encontrado");
        }
    }

    public ArrayList<Cliente> listarClientes(){
        return this.clientes;
    }
    
    public Cliente buscarCliente(String cpf){
        for (Cliente c : clientes){
            if (c.getCpf().equals(cpf)){
                return c;
            }
        }
        System.out.println("Cliente não encontrado no sistema!");
        return null;
    }
}