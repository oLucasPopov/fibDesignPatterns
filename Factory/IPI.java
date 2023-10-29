package Factory;

public class IPI implements Imposto {

    @Override
    public double Calculo(double valorBase) {
        return valorBase * 0.13;
    }

}
