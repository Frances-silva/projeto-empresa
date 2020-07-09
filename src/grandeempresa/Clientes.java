
package grandeempresa;

public class Clientes {
    
    
    private DadosCliente cliente;
    private Endereco endereco;
    private Telefone [] telefone;
    
    
    
    // metodo construtor
     public Clientes ()
     {
         
     }
    
    
    // metodos especiais

    public DadosCliente getCliente() {
        return cliente;
    }

    public void setCliente(DadosCliente cliente) {
        this.cliente = cliente;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

   

    public Telefone[] getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone[] telefone) {
        this.telefone = telefone;
    }
     
    
    
    // impressao
    public void imprimirGeral()
    {
        System.out.println("-------------------FICHA-----------------------\n");
        if(cliente != null)
        {
            System.out.println("nome :" + this.getCliente().getNome());
            System.out.println("cpf :" + this.getCliente().getCpf());
            System.out.println("data de nascimento :" + this.getCliente().getDataNascimento());
        }
        
        
        if(endereco != null)
        {
            System.out.println("estado :" + this.getEndereco().getEstado());
            System.out.println("cidade :" + this.getEndereco().getCidade());
            System.out.println("bairro :" + this.getEndereco().getBairro());
            System.out.println("numero da casa :" + this.getEndereco().getNumeroCasa());
            
            
        }
        
        for(Telefone t : telefone)
        {
           if(telefone != null)
           {
               System.out.println("ddd :" +t.getDdd() + "\nnumero :" + t.getNumero());
           }
        }
        
        
        
        
        
    } // fim do metodo imprimir
    
   
    
    
    
}
