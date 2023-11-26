
public class ImpostoRenda implements Imposto {
  
  @Override
  public double calcular(Funcionario funcionario) {
    double salarioBase = funcionario.salarioBase();

    if(salarioBase <= 500) {
      return 0.0;
    } else if (salarioBase > 500 && salarioBase <= 1000) {
      return (salarioBase * 5) / 100;
    } else {
      return (salarioBase * 7) / 100;
    }
  }
}
