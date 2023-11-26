
public class TaxaInss implements Imposto {

  @Override
  public double calcular(Funcionario funcionario) {
    double salarioBase = funcionario.salarioBase(); 

    if (salarioBase <= 1000) {
      return (salarioBase * 8.5) / 100;
    }

    return (salarioBase * 9) / 100;
  }
}
