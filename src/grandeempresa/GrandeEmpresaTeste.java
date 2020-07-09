
package grandeempresa;

import java.util.Scanner;

public class GrandeEmpresaTeste {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        
        // objetos ligados as suas classes
        Clientes cli = new Clientes();
        
        DadosCliente dados = new DadosCliente();
        Endereco ender = new Endereco();
       
        
        
        
        System.out.println("----------------Cadastro de Clientes------------------\n");
        
        
        System.out.println("Digite o nome do cliente :");
        dados.setNome(scan.nextLine());
        
        System.out.println("Digite o cpf :");
        dados.setCpf(scan.nextLine());
        
        System.out.println("Digite a data de nascimento :");
        dados.setDataNascimento(scan.nextLine());
        
        System.out.println("Digite o estado :");
        ender.setEstado(scan.nextLine());
        
        System.out.println("Digite a cidade :");
        ender.setCidade(scan.nextLine());
        
        System.out.println("Digite o bairro :");
        ender.setBairro(scan.nextLine());
        
        System.out.println("Digite o numero da casa :");
        ender.setNumeroCasa(scan.nextLine());
        
        
        
        Telefone [] telefones = new Telefone[2];
        
        Telefone telef = new Telefone();
        for(int i = 0 ; i < telefones.length ; i++)
        {
        
            System.out.println("Digite o ddd :");
            telef.setDdd(scan.nextLine());
            
            System.out.println("Digite o numero :");
            telef.setNumero(scan.nextLine());
            
            
            
            telefones[i] = telef ;
            
        }
        
        // setando os objetos para cli
        cli.setCliente(dados);
        cli.setEndereco(ender);
        cli.setTelefone(telefones);
        
        
        // imprimir
        
        cli.imprimirGeral();
        
        
    }
    
}
