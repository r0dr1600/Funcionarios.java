/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionarios;

public class SecretariaAgencia extends Secretaria{

  public double Salario;
  public double Bonificacao;

   public void setSalario(double Salario){
    this.Salario = Salario;
  }



  @Override
  public String obterCargo(){
    return "Secretaria Agencia";
  }

  @Override
  public String getBonificacao(){
    return "5%";
  }

  @Override
  public double obterSalario(){
    return Salario + (Salario * 0.05);
  }








}