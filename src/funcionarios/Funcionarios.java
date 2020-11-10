/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionarios;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Rodrigo
 */
public class Funcionarios {

    public static void main(String[] args) {
    
    SecretariaAgencia SAg1 = new SecretariaAgencia();
    SAg1.setSalario(1000);

    SecretariaAdministrativa SAdm1 = new SecretariaAdministrativa();
    SAdm1.setSalario(1000);

    Gerente G1 = new Gerente();
    G1.setSalario(3000);

    Diretor D1 = new Diretor();
    D1.setSalario(7500);
    
    Presidente P1 = new Presidente();
    P1.setSalario(10000);

  List<Funcionario> funcionarios = new ArrayList<Funcionario>();
    funcionarios.add(SAg1);
    funcionarios.add(SAdm1);
    funcionarios.add(G1);
    funcionarios.add(D1);
    funcionarios.add(P1);     

  for (Funcionario funcionario : funcionarios){
    System.out.println("Cargo: " + funcionario.obterCargo());
    System.out.println("Bonificação: " + funcionario.getBonificacao());
    System.out.println("Salário R$" + funcionario.obterSalario());
 

    }
  }
}
       
        


 

       
        


    
 