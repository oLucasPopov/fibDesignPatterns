package Builder;
import java.util.HashMap;
import java.util.Map;

public class Votacao {
    private String cargo;
    private Map<String, Integer> totalizador;

    public Votacao(String cargo) {
        this.cargo = cargo;
        this.totalizador = new HashMap<String, Integer>();
    }

    public void Votar(Candidato candidato) {
        if (this.totalizador.containsKey(candidato.getNome())) {
            int votos = this.totalizador.get(candidato.getNome()) + 1;
            this.totalizador.put(candidato.getNome(), votos++);
        } else {
            this.totalizador.put(candidato.getNome(), 1);
        }
    }

    public String Resultado() {
        String totais = "Votação para " + cargo + "\n";

        for (Map.Entry<String, Integer> total : this.totalizador.entrySet()) {
            totais += "Candidato: " + total.getKey() + ", Total Votos: " + total.getValue() + "\n";
        }

        return totais;
    }

    public String Vencedor() {
        Candidato candidato = new Candidato("");
        Integer totalVotos = -1;
        for (Map.Entry<String, Integer> total : this.totalizador.entrySet()) {
            if (total.getValue() > totalVotos) {
                totalVotos = total.getValue();
                candidato = new Candidato(total.getKey());
            }
        }

        return String.format("O vencedor para %s é %s com %d votos!", this.cargo, candidato.getNome(), totalVotos);
    }
}
