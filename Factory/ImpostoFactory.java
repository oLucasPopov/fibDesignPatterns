package Factory;

import java.util.HashMap;
import java.util.Map;

public class ImpostoFactory {
    public Imposto CriarCalculo(String imposto) {
        Map<String, Imposto> impostos = new HashMap<String, Imposto>();
        impostos.put("IOF", new IOF());
        impostos.put("IPI", new IPI());
        impostos.put("IPVA", new IPVA());

        return impostos.get(imposto);
    }
}
