public class Guerreiro {
    private ArmaInterface arma;

    public Guerreiro(ArmaInterface arma) {
        this.arma = arma;
    }

    public void atacar() {
        arma.atacar();
    }

    public void setArma(ArmaInterface arma) {
        this.arma = arma;
    }
}
