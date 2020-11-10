/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionarios;

public class SecretariaAdministrativa extends Secretaria{

  public double Salario;
  public double Bonificacao;

   public void setSalario(double Salario){
    this.Salario = Salario;
  }

  @Override
  public String obterCargo(){
    return "Secretaria Administrativa";
  }

  @Override
  public String getBonificacao(){
    return "10%";
  }


  @Override
  public double obterSalario(){
    return 1000 + (1000*0.1);
  }
}