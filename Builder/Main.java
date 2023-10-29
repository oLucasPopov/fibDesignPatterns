package Builder;

public class Main {
    public static void main(String[] args) {
        Votacao votacao = new CriadorDeVotos()
                .para("deputado federal")
                .voto(new Candidato("Robson"))
                .voto(new Candidato("José"))
                .voto(new Candidato("José"))
                .voto(new Candidato("José"))
                .voto(new Candidato("Rodrigo"))
                .voto(new Candidato("Rodrigo"))
                .voto(new Candidato("Rodrigo"))
                .voto(new Candidato("Rodrigo"))
                .constroi();

        System.out.println(votacao.Resultado());
        System.out.println(votacao.Vencedor());
    }
}