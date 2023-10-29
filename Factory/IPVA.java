package Factory;

public class IPVA implements Imposto {
    @Override
    public double Calculo(double valorBase) {
        return valorBase * 0.3;
    }

}
