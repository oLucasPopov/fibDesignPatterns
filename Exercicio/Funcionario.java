
public class Funcionario {
  private double horasDeTrabalho = 0.0;
  private double valorSalarioPorHora = 0.0;
  private int numeroDeDependentes = 0;

  public Funcionario(double horasDeTrabalho , double valorSalarioPorHora, int numeroDeDependentes) {
      this.horasDeTrabalho  = horasDeTrabalho ;
      this.valorSalarioPorHora = valorSalarioPorHora;
      this.numeroDeDependentes = numeroDeDependentes;
  }

  public double salarioBase(){
      return horasDeTrabalho  * valorSalarioPorHora + (50 * numeroDeDependentes);
  }
}
