package Factory;

public class IOF implements Imposto {
    @Override
    public double Calculo(double valorBase) {
        return valorBase * 0.02;
    }

}
