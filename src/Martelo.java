import java.util.Random;

public class Martelo implements ArmaInterface {
    @Override
    public void atacar() {
        var sorteador = new Random();
        var dano = sorteador.nextInt(12) + sorteador.nextInt(12) + 2;
        System.out.println("Ataque com martelo: " + dano);

        var atordoar = sorteador.nextDouble() < 0.1;
        if (atordoar) System.out.println("Alvo atordoado");
    }
}
