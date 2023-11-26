

import java.util.List;

public class CalcularFolhaPagto {
  private final List<Imposto> impostos;
  private final Funcionario funcionario;

  public CalcularFolhaPagto(List<Imposto> impostos, Funcionario funcionario) {
    this.impostos = impostos;
    this.funcionario = funcionario;
  }

  public double calcular() {

    double baseSalary = funcionario.salarioBase();

    for (Imposto tax : impostos) {
      baseSalary -= tax.calcular(funcionario);
    }

    return baseSalary;
  }
}
