import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    Funcionario funcionario = new Funcionario(160.0, 60, 2);

    List<Imposto> impostosCLT = Arrays.asList(new ImpostoRenda(), new TaxaInss());
    List<Imposto> impostosPJ = Arrays.asList(new TaxaInss());

    CalcularFolhaPagto calcularFolhaPagto = new CalcularFolhaPagto(impostosCLT, funcionario);
    System.out.println("CLT " + calcularFolhaPagto.calcular());
    
    CalcularFolhaPagto calcularFolhaPagto2 = new CalcularFolhaPagto(impostosPJ, funcionario);
    System.out.println("PJ " + calcularFolhaPagto2.calcular());
  }
}
