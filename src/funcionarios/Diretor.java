/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionarios;

public class Diretor extends Gerente{

  public double Salario;
  public double Bonificacao;

   public void setSalario(double Salario){
    this.Salario = Salario;
  }
 
   

  @Override
  public String obterCargo(){
    return "Diretor";
  }

  @Override
  public String getBonificacao(){
    return "Sem bonificação";
  }

  @Override
  public double obterSalario(){
    return Salario;
  }
}