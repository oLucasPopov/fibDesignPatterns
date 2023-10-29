package Builder;
public class CriadorDeVotos {
    private Votacao votacao;

    public CriadorDeVotos() {
    }

    public CriadorDeVotos para(String cargo) {
        this.votacao = new Votacao(cargo);
        return this;
    }

    public CriadorDeVotos voto(Candidato candidato) {
        this.votacao.Votar(candidato);
        return this;
    }

    public Votacao constroi() {
        return votacao;
    }
}
