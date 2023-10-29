package Factory;

public class Main {
    public static void main(String[] args) {
        Imposto imposto = new ImpostoFactory().CriarCalculo("IPVA");
        System.out.println("IPVA: " + imposto.Calculo(1000));

        imposto = new ImpostoFactory().CriarCalculo("IOF");
        System.out.println("IOF: " + imposto.Calculo(1000));

        imposto = new ImpostoFactory().CriarCalculo("IPI");
        System.out.println("IPI: " + imposto.Calculo(1000));
    }
}
 