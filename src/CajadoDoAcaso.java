import java.util.Random;

public class CajadoDoAcaso implements ArmaInterface {
    @Override
    public void atacar() {
        var dano = new Random().nextInt(35);
        System.out.println("Ataque com Cajado do Acaso: " + dano);
    }
}
